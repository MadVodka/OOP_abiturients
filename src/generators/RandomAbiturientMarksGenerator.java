package generators;

import entity.AbiturientMarks;

import java.util.Random;

public class RandomAbiturientMarksGenerator implements EntityGenerator<AbiturientMarks> {
    private static final int EXCELLENT_RATING = 0; // only 5 marks
    private static final int GOOD_RATING = 1; // marks between 4 and 5
    private static final int MIXED_RATING = 2; // marks between 2 and 5

    private Random random = new Random();

    @Override
    public AbiturientMarks generate() {
        int randomRating = random.nextInt(10);

        switch (randomRating) {
            case EXCELLENT_RATING:
                return new AbiturientMarks()
                        .setComputerScienceMark(5)
                        .setDrawing(5)
                        .setChemistryMark(5)
                        .setEnglishLanguageMark(5)
                        .setMathematicsMark(5)
                        .setPhysicsMark(5);

            case GOOD_RATING:
                return new AbiturientMarks()
                        .setComputerScienceMark(generateMark(4))
                        .setDrawing(generateMark(4))
                        .setChemistryMark(generateMark(4))
                        .setEnglishLanguageMark(generateMark(4))
                        .setMathematicsMark(generateMark(4))
                        .setPhysicsMark(generateMark(4));
            case MIXED_RATING:
                return new AbiturientMarks()
                        .setComputerScienceMark(generateMark(2))
                        .setDrawing(generateMark(2))
                        .setChemistryMark(generateMark(2))
                        .setEnglishLanguageMark(generateMark(2))
                        .setMathematicsMark(generateMark(2))
                        .setPhysicsMark(generateMark(2));
            default: // creates student progress with marks between 3 and 5
                return new AbiturientMarks()
                        .setComputerScienceMark(generateMark(3))
                        .setDrawing(generateMark(3))
                        .setChemistryMark(generateMark(3))
                        .setEnglishLanguageMark(generateMark(3))
                        .setMathematicsMark(generateMark(3))
                        .setPhysicsMark(generateMark(3));
        }
    }

    /**
     * @param lowBound
     * @return mark between low bound and 5 inclusive
     */
    private int generateMark(int lowBound) {

        while (true) {
            int mark = random.nextInt(6);
            if (mark >= lowBound) {
                return mark;
            }
        }

    }
}
