import java.util.ArrayList;

public class Main {



public static void main (String [] args){
    createASmallFamily();
}

public static void createASmallFamily() {
    Family theVenegas = new Family();
    ArrayList<Person> whoAreTheVenegas = new ArrayList<Person>();
    Person mrJulioVenegas = new Person("Julio Venegas");
    Person msLinaVenegas = new Person("Lina Venegas");
    Person missPaolitaVenegas = new Person("Paolita Venegas");
    whoAreTheVenegas.add(mrJulioVenegas);
    whoAreTheVenegas.add(msLinaVenegas);
    whoAreTheVenegas.add(missPaolitaVenegas);

    Pet[] julioPets = new Pet[2];
    julioPets[0] = new Pet("Snoop Dogg");
    julioPets[1] = new Pet("Bobby");
    mrJulioVenegas.setPetsList(julioPets);
    theVenegas.setMembersList(whoAreTheVenegas);

    Pet[] linaPets = new Pet[2];
    msLinaVenegas.setPetsList(linaPets);
    theVenegas.setMembersList(whoAreTheVenegas);

    Pet[] paolitaPets = new Pet[2];
    paolitaPets[0] = new Pet("Roger Rabbit");
    missPaolitaVenegas.setPetsList(paolitaPets);
    theVenegas.setMembersList(whoAreTheVenegas);


    int i = 0;
    int j= 0;
    int k= 0;


    for (i = 0; i< paolitaPets.length; i++){
    if (paolitaPets[i]!=null) {
        for (Pet pet : missPaolitaVenegas.getPetsList()) {
        System.out.println(paolitaPets[i].getPetName());
    }}}

    for (j=0; j< julioPets.length; j++){
    if (julioPets[j]!=null) {
        for(Pet pet : mrJulioVenegas.getPetsList()){
        System.out.println(julioPets[j].getPetName());
    }}}



   /* for (i=0, i<linaPets.length; i++){
        {for(Pet pet : msLinaVenegas.getPetsList()){
        System.out.println(linaPets[i].getPetName());
    }}}} */

   /* for (Person person = theVenegas.getMembersList()) {

        System.out.println("Mascota" + mrJulioVenegas.getPetsList());
    }

    */
    /*for (Person person : theVenegas.getMembersList()) {
        System.out.println(person.getPetsList().toString());
    }

    */

}
}













