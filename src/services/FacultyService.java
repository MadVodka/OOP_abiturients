package services;

import entity.Abiturient;
import repository.Faculty;

public interface FacultyService {
    Abiturient[] abiturientsPassedExamines(Faculty faculty, AbiturientMarksService abiturientMarksService);
}
