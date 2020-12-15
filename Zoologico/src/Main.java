public class Main extends Gato {

    public static void main (String [] args )

    {
        crearGato("micifus");

        creaUnGato();
        creaOtroGato();
        creaTercerGato();
        creaCuartoGato();
    }

    public static String crearGato(String nombreGato)
    {
        nombreGato = "Charlie";
        System.out.println(" Hola");
        System.out.println(" Soy " + nombreGato);
        return nombreGato;

    }


public static void creaUnGato(){
    Gato gato = new Gato ("cachorrito","angora" , "negro" , 3);
    System.out.println(" hola yo soy " + gato.nombre + ", de raza " + gato.raza + ", color " + gato.color + ", y " + gato.edad + "años" );

}

    public static void creaOtroGato() {
        Gato gatito  = new Gato ( "gatochico" , "gatonuevo", "oscurito" , 11);
        System.out.println("el segundo gato es " + gatito.nombre + "y es de raza " + gatito.raza);
    }

    public static void creaTercerGato() {
        Gato gatonio  = new Gato ( "felini" , "gatomediano" , "clarito " , 2);
        System.out.println("el tercer gato es " + gatonio.nombre + "y tiene " +  gatonio.edad+ " años ");

    }
    public static void creaCuartoGato() {
        Gato gatinio  = new Gato ( "felini" , "gatomediano" , "clarito " , 2);
        System.out.println("el tercer gato es " + gatinio.nombre + "y tiene " +  gatinio.edad+ " años ");
        System.out.println(gatinio.edad);

    }

}


