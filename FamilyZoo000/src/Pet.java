public class Pet {

    private String petName;
    private String petSpecies;

    public Pet(String petName, String petSpecies) {
        this.petName = petName;
        this.petSpecies = petSpecies;
    }

    public Pet(String petName) {
        this.petName = petName;
    }

    public String getPetSpecies() {
        return petSpecies;
    }

    public void setPetSpecies(String petSpecies) {
        this.petSpecies = petSpecies;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

}
