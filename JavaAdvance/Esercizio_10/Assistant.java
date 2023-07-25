package Esercizio_10;

class Assistant extends Professor implements LearningPerson, TeachingPerson {
    private boolean isGoingToBeAPhD;

    public Assistant(String name, String surname, int collegeId, boolean willBeAPhD) {
        super(name, surname, collegeId, "Java");
        this.isGoingToBeAPhD = willBeAPhD;
    }

    @Override
    public void studyAtHome() {
        System.out.println("Studying at home as an assistant.");
    }

    @Override
    public void teachToOtherPeople() {
        System.out.println("Assisting in teaching various subjects.");
    }

}