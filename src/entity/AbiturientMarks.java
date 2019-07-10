package entity;

public class AbiturientMarks {
    private int physicsMark;
    private int mathematicsMark;
    private int computerScienceMark;
    private int englishLanguageMark;
    private int chemistryMark;
    private int drawing;

    public int getPhysicsMark() {
        return physicsMark;
    }

    public AbiturientMarks setPhysicsMark(int physicsMark) {
        this.physicsMark = physicsMark;
        return this;
    }

    public int getMathematicsMark() {
        return mathematicsMark;
    }

    public AbiturientMarks setMathematicsMark(int mathematicsMark) {
        this.mathematicsMark = mathematicsMark;
        return this;
    }

    public int getComputerScienceMark() {
        return computerScienceMark;
    }

    public AbiturientMarks setComputerScienceMark(int computerScienceMark) {
        this.computerScienceMark = computerScienceMark;
        return this;
    }

    public int getEnglishLanguageMark() {
        return englishLanguageMark;
    }

    public AbiturientMarks setEnglishLanguageMark(int englishLanguageMark) {
        this.englishLanguageMark = englishLanguageMark;
        return this;
    }

    public int getChemistryMark() {
        return chemistryMark;
    }

    public AbiturientMarks setChemistryMark(int chemistryMark) {
        this.chemistryMark = chemistryMark;
        return this;
    }

    public int getDrawing() {
        return drawing;
    }

    public AbiturientMarks setDrawing(int drawing) {
        this.drawing = drawing;
        return this;
    }

    @Override
    public String toString() {
        return "physicsMark=" + physicsMark + "\n" +
                "mathematicsMark=" + mathematicsMark + "\n" +
                "computerScienceMark=" + computerScienceMark + "\n" +
                "englishLanguageMark=" + englishLanguageMark + "\n" +
                "chemistryMark=" + chemistryMark + "\n" +
                "drawing=" + drawing + "\n";
    }
}
