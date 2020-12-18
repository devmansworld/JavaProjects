import java.util.ArrayList;
import java.util.Arrays; // ?
import java.lang.String;
import java.util.stream.Collectors;

public class Main {
    private Object Gato;

    public static void main(String[] args) {
        arregloDeGatos();
       // creaUnGato();
       //  imprimeGatosTantos();
       // imprimeGatosAlgunos();
    }

    public static void arregloDeGatos() {
        ArrayList<Gato> listadegatos = new ArrayList<Gato>();
        listadegatos.add(new Gato("felini", "gatomediano", " clarito ", 2));
        listadegatos.add(new Gato("felini", "gatomediano", " clarito ", 2));
        listadegatos.add(new Gato("silvestre", "panda", "invisible", 8));
        listadegatos.add(new Gato("tom", "feral", "salmon", 2));
        listadegatos.add(new Gato("garfield", "stray cat", "bayo", 3));
        listadegatos.add(new Gato("run", "siamese", "pardo", 5));
        listadegatos.add(new Gato("tobias", "greek", "marron", 7));
        listadegatos.add(new Gato("pong", "angora", "blanco-siena", 12));
        listadegatos.add(new Gato("steppy", "panda", "cherry", 3));
        listadegatos.add(new Gato("malu", "golden cat", "malva", 2));

        StringBuilder sb = new StringBuilder();
        for (Gato s : listadegatos)
        {sb.append(s);
            sb.append("\t");
        }
        System.out.println(sb.toString());

    }



    public static void imprimeGatosAlgunos() {

        Gato[] gaturros = new Gato[8];
        gaturros[0] = new Gato("fluffy", "house cat", "malva", 2);
        gaturros[1] = new Gato("gato con botas", "pelados", "cherry", 3);
        gaturros[2] = new Gato("riff raff", "panda", "blanco-siena", 12);
        gaturros[3] = new Gato("orson", "angora", "marron", 7);
        gaturros[4] = new Gato("mila", "cat meme", "pardo", 5);
        gaturros[5] = new Gato("jesus saves", "siamese", "bayo", 3);
        gaturros[6] = new Gato("peewee", "greek cat", "salmon", 2);
        gaturros[7] = new Gato("urdu", "stray", "invisible", 8);


        System.out.println("");
        System.out.println("gato printer III: ");
        System.out.println("");


        int k = 0;
        do {
            System.out.println(
                    "su nombre es  " + gaturros[k].getNombre()
                            + " , de raza " + gaturros[k].getRaza()
                            + " , color " + gaturros[k].getColor()
                            + " ,y " + gaturros[k].getEdad()
                            + " años. ");

            k++;
        }
        while (k <= 7);

        System.out.println("");
        System.out.println("");
        System.out.println("");
    }

    public static void imprimeGatosTantos() {
        Gato[] gateros = new Gato[8];
        gateros[0] = new Gato("malu", "golden cat", "malva", 2);
        gateros[1] = new Gato("steppy", "panda", "cherry", 3);
        gateros[2] = new Gato("pong", "angora", "blanco-siena", 12);
        gateros[3] = new Gato("tobias", "greek", "marron", 7);
        gateros[4] = new Gato("run", "siamese", "pardo", 5);
        gateros[5] = new Gato("garfield", "stray cat", "bayo", 3);
        gateros[6] = new Gato("tom", "feral", "salmon", 2);
        gateros[7] = new Gato("silvestre", "panda", "invisible", 8);
        System.out.println("");
        System.out.println("gato printer II : ");
        System.out.println("");
        System.out.println("");

        int x = 0;
        //
        do {
            System.out.println
                    ("se llama " + gateros[x].getNombre()
                            + ", de tipo " + gateros[x].getRaza()
                            + " y color " + gateros[x].getColor()
                            + ", edad  " + gateros[x].getEdad() + " años"
                    );
            x++;
        } while (x <= 7);
    }

    public static void creaUnGato() {

        Gato[] gatitos = new Gato[5];
        gatitos[0] = new Gato(" gatochico", " gatonuevo", " grey", 11);
        ;
        gatitos[1] = new Gato("felini", "gatomediano", " black ", 2);
        gatitos[2] = new Gato("charlie", "angora", "brown", 4);
        gatitos[3] = new Gato("epic", "persa", "white", 3);
        gatitos[4] = new Gato("tina", "siamese", "invisible", 8);

        System.out.println("");
        System.out.println("");
        System.out.println("gato printer I: ");
        System.out.println("");
        for (int i = 0; i <= 4; ++i) {
            System.out.println(
                    "cat name " + (i + 1) + ": "
                            + gatitos[i].getNombre()
                            + ", "
                            + " from "
                            + gatitos[i].getRaza()
                            + " and "
                            + gatitos[i].getColor()
                            + " , it is just "
                            + gatitos[i].getEdad() + " years old");
        }

        System.out.println("");
        System.out.println("");
    }


    }



/*  for (int i = 0; i < listadegatos.size(); i++) {
            System.out.println(listadegatos.get(i));   */

//  System.out.println(listadegatos.get(i));}
/*
        String listString = "";
        for (String s : listadegatos)
        {listString += s + "\t";
        }System.out.println(listString); }
    //agregar arraylist
        //{System.out.println(listadegatos.get(i));}  gatitos[i].getNombre()
        // {System.out.println(listadegatos.get(i));}
// {System.out.println(listadegatos[i].getNombre() + " " );
  // { System.out.println(listadegatos.stream().map(Object::toString).collect(Collectors.joining("\n")));}
*/
