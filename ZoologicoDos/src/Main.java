import java.util.ArrayList;import java.util.Arrays;
import java.lang.String;

public class Main {

    private Object Gato;

    public static  void main (String [] args )
    {

        creaUnGato();;


    }
    static void creaUnGato() {    Gato[] gatitos = new Gato[5];
        gatitos[0] = new Gato( " gatochico" , " gatonuevo", " oscurito" , 11);;
        gatitos[1] = new Gato( "felini" , "gatomediano" , " clarito " , 2);
        gatitos[2] = new Gato("charlie","angora","texto3", 4);
        gatitos[3] = new Gato("epic","persa","texto4", 3);
        gatitos[4] = new Gato("tina","siamese","texto4", 8);

        for ( int i=0; i<gatitos.length; i++){System.out.println(Arrays.toString(gatitos));;
        }


    }

}

   // private Gato listarUnGato(String nombre, String raza, String color, int edad)
    //{for (int i=0;i=<4;i++){ System.out.println( "hola" gatitos[i].nombre + " " + gatitos[i].raza + " " + gatitos[i].color + " " + gatitos[i].edad);}}
// String[] gatitos = new String[5];

// si requiere parametros, se manda, si no requiere.
// nombre metodo (parametros sin tipo)
/*
        //     ( "hola" + gatitos[i].nombre + " " + gatitos[i].raza + " " + gatitos[i].color + " " + gatitos[i].edad);

static void creaUnGato(){
        Gato gato = new Gato ("cachorrito","angora" , "negro" , 3);
        System.out.println(" hola yo soy " + gato.getNombre() + ", de raza " + gato.getRaza() + ", color " + gato.getColor() + ", y " + gato.getEdad() + " años" );

    }



static
        public static String crearGato(String nombreGato)
    {
        nombreGato = "Charlie";
        System.out.println(" Hola");
        System.out.println(" Soy " + nombreGato);
        return nombreGato;

    }
 { }

    public static void creaOtroGato() {
        Gato gatito  = new Gato ( " gatochico" , " gatonuevo", " oscurito" , 11);
        System.out.println("el segundo gato es " + gatito.getNombre()  + "y es de raza " + gatito.getRaza() );
    }

    public static void creaTercerGato() {
        Gato gatonio  = new Gato ( "felini" , "gatomediano" , " clarito " , 2);
        System.out.println("el tercer gato es " + gatonio.getNombre() + "y tiene " +  gatonio.getEdad()+ " años ");

    }
    public static void creaCuartoGato() {
        Gato gatinio  = new Gato ( "felini" , "gatomediano" , "clarito " , 2);
        System.out.println("el tercer gato es " + gatinio.getNombre() + "y tiene " +  gatinio.getEdad()+ " años ");
    }

    public static void creaQuintoGato() {
        Gato gatuleco = new Gato ( "pepito" , "angora");
        System.out.println ("el gatito" + gatuleco.getNombre()+ "  es de tipo  " + gatuleco.getRaza());
        gatuleco.setEdad(2);
        System.out.println (" y tiene " + gatuleco.getEdad()+ " años ");
    }

   Gato[] gatitos = new Gato[5];
         gatitos[0] = new Gato( " gatochico" , " gatonuevo", " oscurito" , 11);;
         gatitos[1] = new Gato( "felini" , "gatomediano" , " clarito " , 2);
         gatitos[2] = new Gato("charlie","angora","texto3", 4);
         gatitos[3] = new Gato("epic","persa","texto4", 3);
         gatitos[4] = new Gato("tina","siamese","texto4", 8);

        for ( int i=0; i<gatitos.length; i++)
    }static void creaUnGato() {    Gato[] gatitos = new Gato[5];
        gatitos[0] = new Gato( " gatochico" , " gatonuevo", " oscurito" , 11);;
        gatitos[1] = new Gato( "felini" , "gatomediano" , " clarito " , 2);
        gatitos[2] = new Gato("charlie","angora","texto3", 4);
        gatitos[3] = new Gato("epic","persa","texto4", 3);
        gatitos[4] = new Gato("tina","siamese","texto4", 8);

        for ( int i=0; i<gatitos.length; i++){System.out.println(Arrays.toString(gatitos));
        }
 */