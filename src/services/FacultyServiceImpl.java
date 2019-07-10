package services;

import comparators.AbiturientMarksDescendingComparator;
import entity.Abiturient;
import repository.Faculty;

import java.util.Arrays;

public class FacultyServiceImpl implements FacultyService {
    @Override
    public Abiturient[] abiturientsPassedExamines(Faculty faculty, AbiturientMarksService abiturientMarksService) {
        Abiturient[] abiturients = faculty.getAbiturients();
        int vacantPlaces = faculty.getVacantPlaces();
        Arrays.sort(abiturients, new AbiturientMarksDescendingComparator());
        int size = Math.min(abiturients.length, vacantPlaces);
        Abiturient[] abiturientsPassedExamines = new Abiturient[size];
        System.arraycopy(abiturients, 0, abiturientsPassedExamines, 0, size);
        return abiturientsPassedExamines;
    }
}
