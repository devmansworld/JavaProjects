public class Person {

    private String personName;
    private Pet[] petsList;
    private int petCount;

    public Person(String personName) {
        this.personName = personName;
    }

    public Person(String personName, Pet[] petsList) {
        this.personName = personName;
        this.petsList = petsList;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public Pet[] getPetsList() {
        return petsList;
    }

    public void setPetsList(Pet[] petsList) {
        this.petsList = petsList;
    }

    public int getPetCount() {
        return petCount;
    }

    public void setPetCount(int petCount) {
        this.petCount = petCount;
    }
}


