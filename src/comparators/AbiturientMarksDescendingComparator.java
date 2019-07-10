package comparators;

import entity.Abiturient;
import entity.AbiturientMarks;
import services.AbiturientMarksService;
import services.AbiturientMarksServiceImpl;

import java.util.Comparator;

public class AbiturientMarksDescendingComparator implements Comparator<Abiturient> {
    @Override
    public int compare(Abiturient abiturient1, Abiturient abiturient2) {
        AbiturientMarksService abiturientMarksService = new AbiturientMarksServiceImpl();
        AbiturientMarks abiturientMarks1 = abiturient1.getAbiturientMarks();
        AbiturientMarks abiturientMarks2 = abiturient2.getAbiturientMarks();
        double averageMarkAbiturient1 = abiturientMarksService.averageAbiturientMark(abiturientMarks1);
        double averageMarkAbiturient2 = abiturientMarksService.averageAbiturientMark(abiturientMarks2);
        return Double.compare(averageMarkAbiturient2, averageMarkAbiturient1);
    }
}
