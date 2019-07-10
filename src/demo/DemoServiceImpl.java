package demo;

import entity.Abiturient;
import entity.AbiturientMarks;
import generators.EntityGenerator;
import generators.RandomAbiturientGenerator;
import generators.RandomAbiturientMarksGenerator;
import repository.Faculty;
import services.AbiturientMarksService;
import services.AbiturientMarksServiceImpl;
import services.FacultyService;
import services.FacultyServiceImpl;

public class DemoServiceImpl implements DemoService {
    private FacultyService facultyService;
    private AbiturientMarksService abiturientMarksService;
    private EntityGenerator<Abiturient> randomAbiturientGenerator;
    private EntityGenerator<AbiturientMarks> randomAbiturientsMarksGenerator;
    private Faculty faculty;

    public DemoServiceImpl() {
        facultyService = new FacultyServiceImpl();
        abiturientMarksService = new AbiturientMarksServiceImpl();
        randomAbiturientsMarksGenerator = new RandomAbiturientMarksGenerator();
        randomAbiturientGenerator = new RandomAbiturientGenerator(randomAbiturientsMarksGenerator);
    }

    @Override
    public void start() {
        System.out.println("------ Demo \"abiturients\" start ------");
        System.out.println();

        createFaculty();
        showFullAbiturientsInfo();
        showAbiturientsPassedExamines();

        System.out.println("------ Demo \"abiturients\" end ------");
    }

    private void createFaculty() {
        System.out.println("Generating a faculty...");
        Abiturient[] abiturients = new Abiturient[20]; // for example 20 abiturients
        for (int i = 0; i < abiturients.length; i++) {
            abiturients[i] = randomAbiturientGenerator.generate();
        }
        int vacantPlaces = 10;
        faculty = new Faculty("Engineering", vacantPlaces, abiturients);
        System.out.println();
    }

    private void showFullAbiturientsInfo() {
        System.out.println("------ All abiturients ------");
        for (int i = 0; i < faculty.getAbiturients().length; i++) {
            Abiturient abiturient = faculty.getAbiturients()[i];
            System.out.println(i + ". " + abiturient);
        }
        System.out.println();
    }

    private void showAbiturientsPassedExamines() {
        System.out.println("------ Abiturients passed examines ------");
        Abiturient[] abiturients = facultyService.abiturientsPassedExamines(faculty, abiturientMarksService);
        for (int i = 0; i < abiturients.length; i++) {
            Abiturient abiturient = abiturients[i];
            System.out.println(i + ". " + abiturient);
        }
        System.out.println();
    }
}
