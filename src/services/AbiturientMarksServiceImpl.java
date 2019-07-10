package services;

import entity.AbiturientMarks;

public class AbiturientMarksServiceImpl implements AbiturientMarksService {
    @Override
    public double averageAbiturientMark(AbiturientMarks abiturientMarks) {
        double sumOfMarks = 0;
        sumOfMarks += abiturientMarks.getChemistryMark();
        sumOfMarks += abiturientMarks.getComputerScienceMark();
        sumOfMarks += abiturientMarks.getChemistryMark();
        sumOfMarks += abiturientMarks.getDrawing();
        sumOfMarks += abiturientMarks.getMathematicsMark();
        sumOfMarks += abiturientMarks.getPhysicsMark();
        return sumOfMarks / 6;
    }
}
