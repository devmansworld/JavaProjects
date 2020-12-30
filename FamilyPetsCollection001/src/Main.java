import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class Main {

    public static void main (String [] args) {
     createASmallFamily();
    }


    public static void createASmallFamily() {
        Family theVenegas = new Family();
        ArrayList<Person> whoAreTheVenegas = new ArrayList<Person>();
        Person mrJulioVenegas = new Person(" Julio Venegas ");
        Person msLinaVenegas = new Person(" Lina Venegas ");
        Person missPaolitaVenegas = new Person(" Paolita Venegas ");

        Pet[] julioPets = new Pet[2];
        julioPets[0] = new Pet(" Snoopy ");
        julioPets[1] = new Pet(" Bobby ");
        mrJulioVenegas.setPetsList(julioPets);

        Pet[] linaPets = new Pet[2];
        //both values array elements will be Null !!!
        msLinaVenegas.setPetsList(linaPets);

        Pet[] paolitaPets = new Pet[2];
        paolitaPets[0] = new Pet(" Snoopy ");
        missPaolitaVenegas.setPetsList(paolitaPets);

        whoAreTheVenegas.add(mrJulioVenegas);
        whoAreTheVenegas.add(msLinaVenegas);
        whoAreTheVenegas.add(missPaolitaVenegas);
        theVenegas.setMembersList(whoAreTheVenegas);

        imprimirLista(theVenegas);
        encontrarPerro(theVenegas, " Snoopy ");




    }

    public static void imprimirLista(Family family){
        for (Person person : family.getMembersList())
        {
            for (Pet pet : person.getPetsList()) {

               // System.out.println("* Person: " + person.getPersonName());

                if (pet == null) {
                    System.out.println("* family member " + person.getPersonName() + " ...has no other pets ");
                } else {
                    if (pet != null){
                        System.out.println("* for Family member : " + person.getPersonName());
                        //System.out.println("* Number of pets : " + person.getPetsList().length);
                        System.out.println(" one pet name is:  " + pet.getPetName());

                    }

                }
            }
        }
    }
    public static void encontrarPerro(Family family, String whichPet){
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

    public static void findingDog(Family family, String whichPet){

    }
}

//no repita mensajes : si salen dos mascotas imprime las dos.
//metodos separados ok
//"sacar valores para pasar como parametros siempre en los metodos para no tener que modificar" !
// reforzar sacar valores hard coded de los métodos, debe siempre usarse parámetros
//
//checkear : mas optimo que (switch case que es para opciones) es el do-while