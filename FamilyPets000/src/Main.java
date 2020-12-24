import java.util.ArrayList;

public class Main {

    public static void main (String [] args){
        createFamily000();
    }

    public static void createFamily000(){
        Family family = new Family();
        ArrayList<Person> membersList = new ArrayList<Person>();
        int i=0;

        //persona1
        Person person001 = new Person("Juana");
        System.out.println("La persona, " + person001.getPersonName());
        Pet[] petsList001= new Pet[2];
        Pet pet001 = new Pet("Bobby");
        System.out.println("Tiene la mascota:  " + pet001.getPetName());
        Pet pet002 = new Pet("Fido");
        System.out.println("Tiene la mascota:  " + pet002.getPetName());
        petsList001[0] = pet001;
        petsList001[1] = pet002;
        person001.setPetsList(petsList001);
        family.setMembersList(membersList);


        try {
            if (petsList001[i] != null) {
                for (i = 0; i < person001.getPetsList().length; i++) {
                    if (petsList001[i].getPetName().equals("Bobby")) {
                        System.out.println("El dueño de Bobby es  " + person001.getPersonName());
                    }
                }
            }
            else{
                System.out.println( person001.getPersonName() + " No tiene Mascotas");
            }
        }
        catch(Exception e){
            System.out.println("------------------------------------");
        }


        //persona2
        Person person002 = new Person("Pedro");
        System.out.println("La persona, " + person002.getPersonName());
        Pet[] petsList002 = new Pet[2];

        person002.setPetsList(petsList002);
        family.setMembersList(membersList);


        try {
            if (petsList002[i] != null) {
                for (i = 0; i < person002.getPetsList().length; i++) {
                    if (petsList002[i].getPetName().equals("Bobby")) {
                        System.out.println("El dueño de Bobby es  " + person002.getPersonName());
                    }
                }
            }
            else{
                System.out.println( person002.getPersonName() + " No tiene Mascotas");
            }
        }
        catch(Exception e){
            System.out.println("------------------------------------");
        }


        //persona 3
        Person person003 = new Person("Cristian");
        System.out.println("La persona, " + person003.getPersonName());
        Pet[] petsList003 = new Pet[2];
        Pet pet005 = new Pet("Wrinkles");
        petsList003[0] = pet005;
        System.out.println("tiene la mascota:  " + pet005.getPetName());

        person003.setPetsList(petsList003);
        family.setMembersList(membersList);


        try {
            if (petsList003[i] != null) {
                for (i = 0; i < person003.getPetsList().length; i++) {
                    if (petsList003[i].getPetName().equals("Bobby")) {
                        System.out.println("El dueño de Bobby es  " + person003.getPersonName());
                    }
                }
            }
            else{
                System.out.println( person003.getPersonName() + " No tiene Mascotas");
            }
        }
        catch(Exception e){
            System.out.println("------------------------------------");
        }



        for(Person person: membersList )
        {
            System.out.println(person.getPetsList());

            System.out.println("*************************");
        }
        for(Person person: family.getMembersList()){
            System.out.println(person.getPersonName());

        }
    }
}
