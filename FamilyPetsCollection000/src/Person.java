public class Person {
    String personName;
    Pet[] petsList;

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


    public Person(String personName) {
        this.personName = personName;
    }
    public Person(){}

    public Person(String personName, Pet[] petsList) {
        this.personName = personName;
        this.petsList = petsList;
    }
}
