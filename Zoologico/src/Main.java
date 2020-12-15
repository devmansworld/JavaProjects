public class Main extends Gato {

    public static void main (String [] args )

    {
        crearGato("micifus");

    }

    public static String crearGato(String nombreGato)
    {

        nombreGato = "Charlie";

        System.out.println(" Hola");
        System.out.println(" Soy " + nombreGato);
        return nombreGato;


    }

    Gato gato = new Gato ("cachorrito","angora" , "negro" , 3);
//  Gato gato1 = new Gato ("margarito","angora");
//  Gato gato3 = new Gato ("sultan","feral");
//Gato cat = new Gato ("sultan","negro", 5);

}


