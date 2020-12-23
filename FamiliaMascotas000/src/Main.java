import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main (String [] args){
        creaFamilia000();
    }

    public static void creaFamilia000(){
        Familia familia = new Familia("Perez Gonzalez");
        ArrayList<Persona> miembrosFamilia = new ArrayList<Persona>();
        String queMascota = "Bobby";
        //persona1
        Persona persona001 = new Persona("Juana",45);
        System.out.println("Existe la madre, " + persona001.getNombre());
        Mascota[] mascotas001 = new Mascota[2];
        Mascota mascota001 = new Mascota("Bobby");
        System.out.println("Ha adoptado la mascota " + mascota001.getNombre());
        Mascota mascota002 = new Mascota("Fido");
        System.out.println("Ha adoptado la mascota " + mascota002.getNombre());
        mascotas001[0] = mascota001;
        mascotas001[1] = mascota002;
        persona001.setListaDeMascotas(mascotas001);

        int i=0;
        if (mascotas001[i]!=null){
        for(i=0; i< mascotas001.length; i++){
            if(mascotas001[i].equals("Bobby")){
                System.out.println("El dueño es " + persona001.getNombre() );
            }
            else{
                System.out.println("Dueño no encontrado");
            }
        }}
       /* if(Arrays.asList(mascotas001).contains("Bobby")){

            System.out.println("El dueño de " +queMascota+ "es : " + persona001.getNombre());
        }*/

        //persona2
        Persona persona002 = new Persona("Pedro",50);
        System.out.println("Existe el padre, " + persona002.getNombre());
        Mascota[] mascotas002 = new Mascota[2];

        persona002.setListaDeMascotas(mascotas002);
        System.out.println(persona002.getNombre() + " no tiene mascotas");
        if (mascotas002[i]!=null){
            for (i = 0; i < mascotas002.length; i++) {
                if (mascotas002[i].equals("Bobby")) {
                    System.out.println("El dueño es " + persona002.getNombre());
                } else {
                    System.out.println("Dueño no encontrado");
                }
            }
        }

        //This exception is thrown when the index is either negative
        // or greater than or equal to the size of the array.

        /*if(Arrays.asList(mascotas002).contains("Bobby")){

            System.out.println("El dueño de " +queMascota+ "es : " + persona002.getNombre());
        }  */



        //persona 3
        Persona persona003 = new Persona("Cristian", 14);
        System.out.println("Creado el hijo, " + persona003.getNombre());
        Mascota[] mascotas003 = new Mascota[2];
        Mascota mascota005 = new Mascota("Chip");
        System.out.println("Posee la mascota " + mascota005.getNombre());

        mascotas003[0] = mascota005;

        persona003.setListaDeMascotas(mascotas003);
        familia.setListaDeMiembros(miembrosFamilia);
        if (mascotas003[i]!=null){
        for( i=0; i< mascotas003.length; i++){
            if(mascotas003[i].equals("Chip")){
                System.out.println("El dueño es " + persona003.getNombre() );
            }
            else{
                System.out.println("Dueño no encontrado");
            }
        }}
        for(Persona persona: miembrosFamilia )
        {
            System.out.println(persona.getListaDeMascotas());
            System.out.println(familia.getNombreFamilia());
            System.out.println("*************************");
        }


        /*if(Arrays.asList(mascotas003).contains("Bobby")){

            System.out.println("El dueño de " +queMascota+ "es : " + persona003.getNombre());
        }*/


    }

    /*

Para (<DataType of array / List> <Temp variable name>: <Array / List to be iterated>) {
      System.out.println ();
} */

       /* for ( Familia:miembrosFamilia) {if(queMascota == mascota001.getNombre())
        {
            System.out.println("La mascota pertenece a " + persona001.getNombre()); }

        }
        else {System.out.println("Nothing found");}
        *
         */
public static String quienEsDuenio001(){
String duenio = "";
String queMascotaEs = "Bobby";
return duenio;


    }
    public static void quienEsDuenio002(){}
    public static void quienEsDuenio003(){}
    public static void quienEsDuenio004(){}
    public static void quienEsDuenio005(){}
    public static void quienEsDuenio006(){}


}

