import java.util.ArrayList;
        import java.util.Arrays; // ?
        import java.lang.String;
        import java.util.stream.Collectors;

public class Main {
    /* private Object Gato; */

    public static void main(String[] args) {


       // nuevaPersonaCrear();
        creaUnCeroDuenio();
        creaUnPrimerDuenio();
        creaUnSegundoDuenio();
       creaUnTercerDuenio();
      creaUnCuartoDuenio();
      creaUnQuintoDuenio();
       creaUnSextoDuenio();
       creaUnSeptimoDuenio();
        creaUnOctavoDuenio();
          creaUnNovenoDuenio();
       creaUnDecimoDuenio();

    }



    public static void imprimirLista(Persona persona ){
        ArrayList<Gato> listado = new ArrayList<Gato>();
        listado = persona.getListadegatos();

        if (listado.size()==0)  {
            System.out.println("esta persona : " + persona.getNombre() + " no Tiene Gatos!!! ");
        }
        else {
            System.out.println("la persona:  " + persona.getNombre()  + "  tiene los siguientes gatos: ");
            System.out.println("");
            for (Gato s : listado) {
                System.out.println(" Gato "
                        + s.getNombre()
                        + " , raza: " + s.getRaza()
                        + " , color : " + s.getColor()
                        + " . edad : " + s.getEdad()
                        + " años");
            }
        }
        System.out.println("");
    }



    public static void creaUnCeroDuenio(){
        Persona duenio000 = new Persona("jesus");
        ArrayList<Gato>listaDuenio000 = new ArrayList<Gato>();
        listaDuenio000.add(new Gato("folini", "gatomediani", " clarita ", 2));
        listaDuenio000.add(new Gato("silvastre", "pinda", "invisible", 8));
        duenio000.setListadegatos(listaDuenio000);
        imprimirLista(duenio000);
    }

    public static void creaUnPrimerDuenio(){
        Persona duenio001 = new Persona("jurelio en masa");
        ArrayList<Gato>listaDuenio001 = new ArrayList<Gato>();
        listaDuenio001.add(new Gato("felini", "gatomediano", " clarito ", 2));
        listaDuenio001.add(new Gato("silvestre", "panda", "invisible", 8));
        duenio001.setListadegatos(listaDuenio001);
        imprimirLista(duenio001);
    }

    public static void creaUnSegundoDuenio(){
        Persona duenio002 = new Persona("acadio hers");
        ArrayList<Gato>listaDuenio002 = new ArrayList<Gato>();
        listaDuenio002.add(new Gato("tom", "feral", "salmon", 2));
        duenio002.setListadegatos(listaDuenio002);
        imprimirLista(duenio002);

    }

    public static void creaUnTercerDuenio(){
        Persona duenio003 = new Persona("kennelclub dada");
        ArrayList<Gato> listaDuenio003 = new ArrayList<Gato>();
        listaDuenio003.add(new Gato("tobias", "greek", "marron", 7));
        listaDuenio003.add(new Gato("pong", "angora", "blanco-siena", 12));
        listaDuenio003.add(new Gato("jesus saves", "siamese", "bayo", 3));
        duenio003.setListadegatos(listaDuenio003);
        imprimirLista(duenio003);
    }

    public static void creaUnCuartoDuenio(){
        Persona duenio004 = new Persona("yaraleth merrisen");
        ArrayList<Gato> listaDuenio004 = new ArrayList<Gato>();
        duenio004.setListadegatos(listaDuenio004);
        imprimirLista(duenio004);
    }

    public static void creaUnQuintoDuenio(){
        Persona duenio005 = new Persona("don verminieth");
        ArrayList<Gato> listaDuenio005 = new ArrayList<Gato>();
        listaDuenio005.add(new Gato("steppy", "panda", "cherry", 3));
        listaDuenio005.add(new Gato("gato con botas", "pelados", "cherry", 3));
        duenio005.setListadegatos(listaDuenio005);
        imprimirLista(duenio005);
    }

    public static void creaUnSextoDuenio(){
        Persona duenio006 = new Persona("mia yesmireleth");
        ArrayList<Gato> listaDuenio006 = new ArrayList<Gato>();
        listaDuenio006.add(new Gato("riff raff", "panda", "blanco-siena", 12));
        listaDuenio006.add(new Gato("orson", "angora", "marron", 7));
        listaDuenio006.add(new Gato("peewee", "greek cat", "salmon", 2));
        duenio006.setListadegatos(listaDuenio006);
        imprimirLista(duenio006);
    }

    public static void creaUnSeptimoDuenio(){
        Persona duenio007 = new Persona("Yocsifer");
        ArrayList<Gato> listaDuenio007 = new ArrayList<Gato>();
        duenio007.setListadegatos(listaDuenio007);
        imprimirLista(duenio007);

}

    public static void creaUnOctavoDuenio(){
        Persona duenio008 = new Persona("seth y camelot");
        ArrayList<Gato> listaDuenio008 = new ArrayList<Gato>();
        listaDuenio008.add(new Gato("urdu", "stray", "invisible", 8));
        listaDuenio008.add(new Gato("malu", "golden cat", "malva", 2));
        duenio008.setListadegatos(listaDuenio008);
        imprimirLista(duenio008);
       }



    public static void creaUnNovenoDuenio(){
        Persona duenio009 = new Persona("sam the follower");
        ArrayList<Gato> listaDuenio009 = new ArrayList<Gato>();
        listaDuenio009.add(new Gato("steppy", "panda", "cherry", 3));
        duenio009.setListadegatos(listaDuenio009);
        imprimirLista(duenio009);
}

    public static void creaUnDecimoDuenio(){
        Persona duenio010 = new Persona("sisters of dawn");
        ArrayList<Gato> listaDuenio010 = new ArrayList<Gato>();
        listaDuenio010.add(new Gato("garfield", "stray cat", "bayo", 3));
        listaDuenio010.add(new Gato("tom", "feral", "salmon", 2));
        duenio010.setListadegatos(listaDuenio010);
        imprimirLista(duenio010);}

}

/*  ¿Porque falla este método?

    public static void nuevaPersonaCrear(){
        Persona alguien = new Persona("john");
        ArrayList<Gato>listaDuenio = new ArrayList<Gato>();
        imprimirLista(alguien);
    }

     //nuevaPersonaCrear();  tira excepcion


     Idea: Crear una cadena de texto que concatenada recorra de duenio001 a duenio010
     Pregunta : Cómo creamos este puntero y cómo lo hacemos que haga el recorrer una parte de la cadena "Nombre".
      ¿Cómo creamos un arraylist que vaya recorriendo los nombres de los dueños a través de su número ordinal?
     Idea . Método Substring.




 */