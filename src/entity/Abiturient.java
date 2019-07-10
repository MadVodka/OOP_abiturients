package entity;

public class Abiturient {
    private String firstName;
    private String secondName;
    private AbiturientMarks abiturientMarks;

    public Abiturient(String firstName, String secondName, AbiturientMarks abiturientMarks) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.abiturientMarks = abiturientMarks;
    }

    public AbiturientMarks getAbiturientMarks() {
        return abiturientMarks;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    @Override
    public String toString() {
        return "Abiturient{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                '}' + "\n" + abiturientMarks;
    }
}
