package Esercizio_10;

class Student extends CollegePerson implements LearningPerson {
    private int academicYear;

    public Student(String name, String surname, int collegeId, int academicYear) {
        super(name, surname, collegeId);
        this.academicYear = academicYear;
    }
    @Override
    public void studyAtHome() {
        System.out.println("Studying at home as a student in year " + academicYear);
    }
}