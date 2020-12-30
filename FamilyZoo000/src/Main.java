import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        createASmallFamily();
    }
//loro y gato Sin perro - excluir
    public static void createASmallFamily() {
        Family anything;
        //si no se instancia, null
        Family theVenegas = new Family();
        ArrayList<Person> whoAreTheVenegas = new ArrayList<Person>();
        Person mrJulioVenegas = new Person("Julio Venegas");
        Person msLinaVenegas = new Person("Lina Venegas");
        Person missPaolitaVenegas = new Person("Paolita Venegas");
        Person missMirnitaVenegas = new Person("Mirnita Venegas");
        Person grannyAnitaVenegas = new Person("Anita Venegas");

        Pet[] julioPets = new Pet[4];
        julioPets[0] = new Pet("Snoop Dogg", "Dog");
        julioPets[1] = new Pet("Bobby", "Dog");
        mrJulioVenegas.setPetsList(julioPets);

        Pet[] linaPets = new Pet[4];
        //both values array elements will be Null !!!
        msLinaVenegas.setPetsList(linaPets);

        Pet[] paolitaPets = new Pet[4];
        paolitaPets[0] = new Pet(" Roger Rabbit ", "Dog");
        paolitaPets[0] = new Pet(" Tucapel", "Parrot");
        missPaolitaVenegas.setPetsList(paolitaPets);

        Pet[] mirnitaPets = new Pet[4];
        mirnitaPets[0] = new Pet("Shilloh", "Dog");
        mirnitaPets[1] = new Pet("Lady San", "Cat");
        mirnitaPets[2] = new Pet("Lady Lee", "Cat");
        missMirnitaVenegas.setPetsList(mirnitaPets);

        Pet[] anitaPets = new Pet[4];
        anitaPets[0] = new Pet("Goofy", "Cat");
        anitaPets[1] = new Pet("Gandhi", "Parrot");
        grannyAnitaVenegas.setPetsList(anitaPets);


        whoAreTheVenegas.add(mrJulioVenegas);
        whoAreTheVenegas.add(msLinaVenegas);
        whoAreTheVenegas.add(missPaolitaVenegas);
        whoAreTheVenegas.add(missMirnitaVenegas);
        whoAreTheVenegas.add(grannyAnitaVenegas);
        theVenegas.setMembersList(whoAreTheVenegas);

        // imprimirLista(theVenegas);
        //  findBySpecies(theVenegas,"Parrot");
        //encontrarPerro(theVenegas, " Snoopy ");
        printingAllFamilyList(theVenegas);
        findByOtherStuff(theVenegas, "Parrot");
        getCatsAndParrots(theVenegas, "Cat", "Parrot");
        whoHasNoPets(theVenegas);
        findingPetByName(theVenegas, "Bobby");
        catsAndParrotsNotDogs(theVenegas, "Cat","Parrot","Dog" );
        //findingMemberWithNoPets(theVenegas);
        //findingAnyGivenSpecies(theVenegas,"Parrot");


    }

    public static void catsAndParrotsNotDogs(Family family, String catSpecies, String parrotSpecies, String dogSpecies) {

        System.out.println("- - - - - - - - - - ");
        System.out.println("Finding members that have only Cat and Parrot :");
        int howManyCatsOrParrots=0;
        for (Person person: family.getMembersList()) {
            boolean hasCat=false;
            boolean hasParrot=false;

            for(Pet pet: person.getPetsList()){
                for(int i=0; i<person.getPetsList().length; i++) {
                    if (person.getPetsList()[i] != null) {
                        if (person.getPetsList()[i].getPetSpecies().equals(catSpecies)) {
                            hasCat = true;

                        } else if (person.getPetsList()[i].getPetSpecies().equals(parrotSpecies)) {
                            hasParrot = true;
                        }
                    }
                }
            }
            if((hasCat==true)&&(hasParrot==true))
            {
                System.out.println( person.getPersonName() + " has at least one Cat and Parrot, but not any Dogs!");
                howManyCatsOrParrots++;

            }
        }
        System.out.println("Total of people having Cats and Parrots : " + howManyCatsOrParrots);
    }



    public static void findingPetByName(Family family, String whichPet) {
        System.out.println("- - - - - - - - - -");
        System.out.println("Finding the Pet");
        for (Person person : family.getMembersList()) {
            for (Pet pet : person.getPetsList()) {
                if (pet == null) {
                } else if (pet.getPetName().equals(whichPet)) {   // <------------------------ forma correcta (googlear diferencias)

                    System.out.println(whichPet + " is a pet which owner is " + person.getPersonName());
                } else {
                }

            }
        }
    }

    public static void printingAllFamilyList(Family family) {
        int animalCount=0;
        boolean hasPets=false;
        System.out.println("- - - - - - - - - - ");
        System.out.println("Printing Full List");
        for (Person person : family.getMembersList()) {
            if (person.getPetsList() != null) {
                System.out.println("- - - - - - - - - - - - - - ");
                System.out.println(" list of pets for " + person.getPersonName() + ": ");
                Arrays.asList(person.getPetsList());  //<-------------------- por validar si esta ok
                for (Pet pet : person.getPetsList()) {
                    if (pet != null) {  System.out.println(pet.getPetSpecies() + " , named  " + pet.getPetName());
                    animalCount++;
                    hasPets=true;
                    }
                }
            }
        }
    }

    public static void findByOtherStuff(Family family, String whichSpecies) {
        System.out.println("- - - - - - - - - -");
        System.out.println("Finding Parrots");
        int speciesCounter=0;
        for (Person person : family.getMembersList()) {
            for (Pet pet : person.getPetsList())
                if (pet == null) {
                } else if (pet.getPetSpecies() == whichSpecies) {
                    System.out.println("Parrot owner is " + person.getPersonName());
                    speciesCounter++;
                }
        }
        System.out.println("Number of parrots owners : " + speciesCounter);
    }

    public static void getCatsAndParrots(Family family, String oneOfThese, String oneOfThose) {
        System.out.println("- - - - - - - - - - ");
        System.out.println("Finding Cats and Parrots, excluding Dogs: ");
        for (Person person : family.getMembersList()) {
            {
            }
            for (Pet pet : person.getPetsList())
                if (pet == null) { // en vez de igualar el null y no hace nada, mejor negar null y listar condiciones ahorra un ciclo
                } else if (pet.getPetSpecies() == oneOfThese) {
                    System.out.println(person.getPersonName() + " has one of these " + oneOfThese + " named " + pet.getPetName());
                } else if (pet.getPetSpecies() == oneOfThose) {
                    System.out.println(person.getPersonName() + " owns one of those " + oneOfThose + " known as " + pet.getPetName());
                } else {
                    if ((pet==null)&&(pet.getPetSpecies()==oneOfThese)){
                        System.out.println("");
                    }
                }
        }
    }


    public static void whoHasNoPets(Family family) {
        System.out.println("- - - - - - - - - - ");
        System.out.println("Naming who does not have pets ");
        for (Person person : family.getMembersList()) {
            if (person.getPetsList()==null) {
             //   person.setPetCount(0); se sugiere no utilizar indices como "atributos" de una clase
                System.out.println("No pets");

            } else {
                person.setPetCount(person.getPetCount() + 1);
            }

        }
    }

}

/*

//findByName();
// averiguar diferencia entre Equals y ==  como comparacion

 ///obs : si se tiene else vacios o if vacios, se pueden obviar o potenciar mejora en logica
        // no sirven if vacios Nunca, mejorar logica

        //verificar orden adecuado de los pasos en cada script : no rompe el codigo pero no opera ninguna funcion
        //
        //se pueden utilizar variables locales como un booleano
        // has dog: cambia booleano
        //  dependiendo del ejercicio = ocupar un contador no romperia la funcion

         if (hasPets==false){
                System.out.println(" no pets ");
            }

        /*


       /*
    public static void findingMemberWithNoPets(Family family)
    {
        System.out.println("- - - - - - - - - - ");
        System.out.println("Finding which family member does not have pets:  ");
        for(Person person: family.getMembersList()){
            boolean hasAPet = false;
            for(Pet pet: person.getPetsList()){
              ---> for(int j=0; j<person.getPetsList().length; j++){
              ----> if(person.getPetsList()[j]!=null){
             ----->           hasAPet=false;
              ----->      }
             ------>       else{hasAPet=true;}
            ------->    }
            }
                    if (hasAPet=false){
                    { System.out.println("this family member " + person.getPersonName() + " does not have any pets ");}
                    }
                    }
                    }
        */

    /*
    public static void getEmptyPets(Family family) {
        for (Person person : family.getMembersList()) {
        } for(Pet[] howManyPets : ------------;)
            {
            }
        }
    }
*/
    /*

     * for ciclo incremental: si pet.getpetspecies != null, and pet.getspecies=!dog and pet.getspecies(i+1) not null and!=perro and
     * these are different = tiene cat y tiene parrot .
     ( parrot and cat )
     * se completa con un ciclo for como en el ejercicio 000.
     *
     **/

/*
public static void parrotAndCatNotDog(){}

    public static void findBySpecies(Family family, String whichSpecies){
        for (Person person : family.getMembersList())
        {
            for (Pet pet: person.getPetsList()){
                if (pet==null){
                    System.out.println(" ");
                }
                else
                if(pet.getPetSpecies().equals(whichSpecies)){

                    System.out.println( whichSpecies + " owner is " + person.getPersonName());}
                else{
                    System.out.println("there are no more  " + whichSpecies);}

            }
        }
    }
*
* public static void whosGotSpecies(Family family, String whichSpecies){

        for(Person person : family.getMembersList())
        {
            for (Pet pet: person.getPetsList()){
                while(pet!=null) System.out.println();

            }
        }
}
public static void findByName

        (){}

    public static void findByName(Family family, String whichPet){
        for (Person person : family.getMembersList())
        {
            for (Pet pet: person.getPetsList()){
                if (pet==null){
                    System.out.println(" ");
                }
                else
                if(pet.getPetName().equals(whichPet)){

                    System.out.println( whichPet + " owner is " + person.getPersonName());}
                else{
                    System.out.println("This member is not the owner of  " + whichPet);}

            }
        }
    }
     public static void findingAnyGivenSpecies(Family family, String whichSpecies){
        int speciesCounter = 0;
        System.out.println("- - - - - - - - - ");
        System.out.println("Counting the Parrot owners : ");

        for (Person person : family.getMembersList()){
            if (person.getPetsList()!=null){
                for(Pet pet: person.getPetsList()){
                    while(pet!=null){
                    if(pet.getPetSpecies() == whichSpecies){
                        System.out.println(person.getPersonName() + "is a " +pet.getPetSpecies() +" owner");
                        speciesCounter++;
                    }

                }

                }
            }
        }

    }





 */