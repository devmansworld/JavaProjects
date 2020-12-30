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

//findByName();
// averiguar diferencia entre Equals y ==  como comparacion

    }


    public static void findingPetByName(Family family, String whichPet) {
        System.out.println("****");
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
        System.out.println("****");
        System.out.println("Printing Full List");
        for (Person person : family.getMembersList()) {
            if (person.getPetsList() == null) {
                System.out.println(person.getPersonName() + " Null no tiene ");
            }else{
                System.out.println(" list of pets for " + person.getPersonName());
                Arrays.asList(person.getPetsList());  //<-------------------- por validar si esta ok
                for (Pet pet : person.getPetsList()) {
                    if (pet == null) {
                    } else {
                        System.out.println(pet.getPetSpecies() + " , named  " + pet.getPetName());
                    }
                }
            }
        }//
    }
    
    public static void findByOtherStuff(Family family, String whichSpecies) {
        System.out.println("Finding Parrots");
        for (Person person : family.getMembersList()) {
            {
            }
            for (Pet pet : person.getPetsList())
                if (pet == null) {
                } else if (pet.getPetSpecies() == whichSpecies) {
                    System.out.println("Parrot owner is " + person.getPersonName());
                } else {
                }
        }
        //obs : si se tiene else vacios o if vacios, se pueden obviar o potenciar mejora en logica
        // no sirven if vacios Nunca, mejorar logica

        //verificar orden adecuado de los pasos en cada script : no rompe el codigo pero no opera ninguna funcion
        //
    }

    public static void getCatsAndParrots(Family family, String oneOfThese, String oneOfThose) {
        System.out.println("*********");
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
    //se pueden utilizar variables locales como un booleano
    // has dog: cambia booleano
    //  dependiendo del ejercicio = ocupar un contador no romperia la funcion
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


    public static void whoHasNoPets(Family family) {
        System.out.println("*********");
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
*
*
*
*
*
*
*
*

*
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

* */