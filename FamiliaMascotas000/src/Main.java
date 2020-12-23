import java.util.ArrayList;

public class Main {

    public static void main (String [] args){
        creaFamilia000();
    }

    public static void creaFamilia000(){
        Familia familia = new Familia("Perez Gonzalez");
        ArrayList<Persona> miembrosFamilia = new ArrayList<Persona>();
        creaPersona001();
        creaPersona002();
        creaPersona003();

        familia.setListaDeMiembros(miembrosFamilia);

        for(Persona persona: miembrosFamilia )
        {
            System.out.println(persona.getListaDeMascotas());
            System.out.println(familia.getNombreFamilia());
            System.out.println("*************************");
        }
    }

    public static void creaPersona001(){
        Persona persona = new Persona("Juana",45);
        System.out.println("Existe la madre, " + persona.getNombre());
        Mascota[] mascotas = new Mascota[2];
        Mascota mascota001 = new Mascota("Bobby");
        System.out.println("Ha adoptado la mascota " + mascota001.getNombre());
        Mascota mascota002 = new Mascota("Fido");
        System.out.println("Ha adoptado la mascota " + mascota002.getNombre());
        mascotas[0] = mascota001;
        mascotas[1] = mascota002;
        persona.setListaDeMascotas(mascotas);
        for(int i = 0; i <=1; i++)
        {
            System.out.println("mascota de " + persona.getNombre() + ": " +mascotas[i].getNombre());
        }
        System.out.println("*****************************************");
    }

    public static void creaPersona002(){
        Persona persona = new Persona("Pedro",50);
        System.out.println("Existe el padre, " + persona.getNombre());
        Mascota[] mascotas = new Mascota[2];
        Mascota mascota003 = new Mascota("Garfield");
        System.out.println("Adoptó la mascota " + mascota003.getNombre());
        Mascota mascota004 = new Mascota("Heatcliff");
        System.out.println("Adoptó la mascota " + mascota004.getNombre());
        mascotas[0] = mascota003;
        mascotas[1] = mascota004;
        persona.setListaDeMascotas(mascotas);
        for(int i = 0; i <=1; i++)
        {
            System.out.println("mascota de " + persona.getNombre() + ": " + mascotas[i].getNombre());
        }
        System.out.println("****************************************");
    }

    public static void creaPersona003(){
        Persona persona = new Persona("Cristian", 14);
        System.out.println("Creado el hijo, " + persona.getNombre());
        Mascota[] mascotas = new Mascota[2];
        Mascota mascota005 = new Mascota("Chip");
        System.out.println("Posee la mascota " + mascota005.getNombre());
        Mascota mascota006 = new Mascota("Dale");
        System.out.println("Posee la mascota " + mascota006.getNombre());
        mascotas[0] = mascota005;
        mascotas[1] = mascota006;
        persona.setListaDeMascotas(mascotas);
        for(int i = 0; i <=1; i++)
        {
            System.out.println("mascota de " + persona.getNombre() + ": " + mascotas[i].getNombre());
        }
        System.out.println("****************************************");

    }

    public static void quienEsDuenio001(){
        String queMascotaEs;
        String queDuenioEs;

        queMascotaEs = "Bobby";


    }
    public static void quienEsDuenio002(){}
    public static void quienEsDuenio003(){}
    public static void quienEsDuenio004(){}
    public static void quienEsDuenio005(){}
    public static void quienEsDuenio006(){}


}
