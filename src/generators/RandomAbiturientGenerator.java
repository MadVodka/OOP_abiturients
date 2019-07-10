package generators;

import entity.Abiturient;
import entity.AbiturientMarks;

public class RandomAbiturientGenerator implements EntityGenerator<Abiturient> {
    private EntityGenerator<AbiturientMarks> randomStudentProgressGenerator;

    public RandomAbiturientGenerator(EntityGenerator<AbiturientMarks> randomStudentProgressGenerator) {
        this.randomStudentProgressGenerator = randomStudentProgressGenerator;
    }

    @Override
    public Abiturient generate() {
        NameGenerator nameGenerator = new NameGenerator();
        String firstName = nameGenerator.generateFirstName();
        String secondName = nameGenerator.generateSecondName();

        AbiturientMarks abiturientMarks = randomStudentProgressGenerator.generate();

        return new Abiturient(firstName, secondName, abiturientMarks);
    }
}
