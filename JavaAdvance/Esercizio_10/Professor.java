package Esercizio_10;

class Professor extends CollegePerson implements TeachingPerson {
    private String teachingSubject;
    public Professor(String name, String surname, int collegeId, String materia) {
        super(name, surname, collegeId);
        this.teachingSubject = materia;
    }

    @Override
    public void teachToOtherPeople() {
        System.out.println("Teaching " + teachingSubject + "Java" +
                "\n to the students.");
    }
}