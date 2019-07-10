package repository;

import entity.Abiturient;

public class Faculty {
    private String name;
    private int vacantPlaces;
    private Abiturient[] abiturients;

    public Faculty(String name, int vacantPlaces, Abiturient[] abiturients) {
        this.name = name;
        this.vacantPlaces = vacantPlaces;
        this.abiturients = abiturients;
    }

    public String getName() {
        return name;
    }

    public int getVacantPlaces() {
        return vacantPlaces;
    }

    public Abiturient[] getAbiturients() {
        return abiturients;
    }
}
