import java.util.ArrayList;
        import java.util.Arrays; // ?
        import java.lang.String;
        import java.util.stream.Collectors;

public class Main {
    /* private Object Gato; */

    public static void main(String[] args) {
        arregloDeGenteGrande();
        arregloDeGatosGrande();
       // arregloDeGatos();
      //  imprimePocosGatos();
      //  creaUnGato();
     //   imprimeGatosTantos();
      //  imprimeGatosAlgunos();


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
        {

            System.out.println("Gato "
                    + s.getNombre()
                    + " , raza: "+s.getRaza()
                    + " , color : " + s.getColor()
                    + " . edad : " + s.getEdad()
                    + " años");

        }
        //  System.out.println(listadegatos);
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

        System.out.println("gato printer II : ");
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
    }

    public static void imprimePocosGatos() {
        Gato[] gatorros = new Gato[4];
        gatorros[0] = new Gato("fluffy", "house cat", "malva", 2);
        gatorros[1] = new Gato("gato con botas", "pelados", "cherry", 3);
        gatorros[2] = new Gato("riff raff", "panda", "blanco-siena", 12);
        gatorros[3] = new Gato("orson", "angora", "marron", 7);
        System.out.println("");

        System.out.println("gato printer IV: ");

        int k = 0;
        while (k <= 3){
            System.out.println(
                    "Se llama  " + gatorros[k].getNombre()
                            + " , de origen " + gatorros[k].getRaza()
                            + " , pelaje " + gatorros[k].getColor()
                            + " ,y " + gatorros[k].getEdad()
                            + " años. ");

            k++;
        }
        System.out.println("");
    }

    public static void arregloDeGatosGrande() {
        ArrayList<Gato> bonitaLista = new ArrayList<Gato>();
        bonitaLista.add(new Gato()); // si instancio un gato sin parámetros es un gato null
        bonitaLista.add(new Gato("fiolini", "gatomediano", " clarito ", 2));
        bonitaLista.add(new Gato("felini", "gatomediano", " clarito ", 2));
        bonitaLista.add(new Gato("silvestre", "panda", "invisible", 8));
        bonitaLista.add(new Gato("tom", "feral", "salmon", 2));
        bonitaLista.add(new Gato("garfield", "stray cat", "bayo", 3));
        bonitaLista.add(new Gato("run", "siamese", "pardo", 5));
        bonitaLista.add(new Gato("tobias", "greek", "marron", 7));
        bonitaLista.add(new Gato("pong", "angora", "blanco-siena", 12));
        bonitaLista.add(new Gato("steppy", "panda", "cherry", 3));
        bonitaLista.add(new Gato("malu", "golden cat", "malva", 2));
        bonitaLista.add(new Gato("fluffy", "house cat", "malva", 2));
        bonitaLista.add(new Gato("gato con botas", "pelados", "cherry", 3));
        bonitaLista.add(new Gato("riff raff", "panda", "blanco-siena", 12));
        bonitaLista.add(new Gato("orson", "angora", "marron", 7));
        bonitaLista.add(new Gato("mila", "cat meme", "pardo", 5));
        bonitaLista.add(new Gato("jesus saves", "siamese", "bayo", 3));
        bonitaLista.add(new Gato("peewee", "greek cat", "salmon", 2));
        bonitaLista.add(new Gato("urdu", "stray", "invisible", 8));
        bonitaLista.add(new Gato("malu", "golden cat", "malva", 2));
        bonitaLista.add(new Gato("steppy", "panda", "cherry", 3));
        bonitaLista.add(new Gato("pong", "angora", "blanco-siena", 12));
        bonitaLista.add(new Gato("tobias", "greek", "marron", 7));
        bonitaLista.add(new Gato("run", "siamese", "pardo", 5));
        bonitaLista.add(new Gato("garfield", "stray cat", "bayo", 3));
        bonitaLista.add(new Gato("tom", "feral", "salmon", 2));
        bonitaLista.add(new Gato("silvestre", "panda", "invisible", 8));

        StringBuilder sb = new StringBuilder();

        for(Gato s : bonitaLista)
        {
            System.out.println(" "+ s.getNombre() + " " + s.getRaza() +" "+ s.getColor() + " " + s.getEdad());

        }
    }

    public static void arregloDeGenteGrande() {
        ArrayList<Persona > superLista = new ArrayList<Persona>();
        superLista.add(new Persona("sony")); // si instancio un gato sin parámetros es un gato null
        superLista.add(new Persona("cher"));
        superLista.add(new Persona("shakira"));
        superLista.add(new Persona("matt bianco"));
        superLista.add(new Persona("alma"));
        superLista.add(new Persona("selena"));
        superLista.add(new Persona("wendy"));
        superLista.add(new Persona("jimmy chamberlain"));
        superLista.add(new Persona("corgan"));

        StringBuilder sb = new StringBuilder();

        for(Persona s : superLista)
        {
            System.out.println(" "+ s.getNombre() + " ");

        }

    }

    public static void creaUnCeroDuenio(){
        Persona duenio000 = new Persona("jesus");

        ArrayList<Gato>listaDuenio000 = new ArrayList<Gato>();
        listaDuenio000.add(new Gato("folini", "gatomediani", " clarita ", 2));
        listaDuenio000.add(new Gato("silvastre", "pinda", "invisible", 8));

        if (listaDuenio000.size()==0)  {
            System.out.println("esta persona : " + duenio000.getNombre() + " no Tiene Gatos!!! ");
        }
        else {
            System.out.println("la persona:  " +duenio000.getNombre()  + "  tiene los siguientes gatos: ");
            System.out.println("");
            for (Gato s : listaDuenio000) {
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


    public static void creaUnPrimerDuenio(){
        Persona duenio001 = new Persona("jurelio en masa");
        ArrayList<Gato>listaDuenio001 = new ArrayList<Gato>();
        listaDuenio001.add(new Gato("felini", "gatomediano", " clarito ", 2));
        listaDuenio001.add(new Gato("silvestre", "panda", "invisible", 8));

        if (listaDuenio001.size()==0)  {
            System.out.println("esta persona : " + duenio001.getNombre() + " no Tiene Gatos!!! ");
            System.out.println("");
        }
        else {
            System.out.println("la persona : " +duenio001.getNombre()  + "  tiene los siguientes gatos: ");

            for (Gato s : listaDuenio001) {
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

    public static void creaUnSegundoDuenio(){
        Persona duenio002 = new Persona("acadio hers");
        ArrayList<Gato>listaDuenio002 = new ArrayList<Gato>();
        listaDuenio002.add(new Gato("tom", "feral", "salmon", 2));

        System.out.println("");
        StringBuilder sb = new StringBuilder();

        if (listaDuenio002.size()==0)  {
            System.out.println("esta persona : " + duenio002.getNombre() + "  no Tiene Gatos!!! ");
        }
        else {
            System.out.println("la persona  " +duenio002.getNombre()  + "  tiene los siguientes gatos: ");
            System.out.println("");
            for (Gato s : listaDuenio002) {
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

    public static void creaUnTercerDuenio(){
        Persona duenio003 = new Persona("kennelclub dada");
        ArrayList<Gato> listaDuenio003 = new ArrayList<Gato>();
        listaDuenio003.add(new Gato("tobias", "greek", "marron", 7));
        listaDuenio003.add(new Gato("pong", "angora", "blanco-siena", 12));
        listaDuenio003.add(new Gato("jesus saves", "siamese", "bayo", 3));

        System.out.println("");
        StringBuilder sb = new StringBuilder();

        if (listaDuenio003.size()==0)  {
            System.out.println("esta persona : " + duenio003.getNombre() + "  no Tiene Gatos!!! ");
        }
        else {
            System.out.println("la persona :   " +duenio003.getNombre()  + "  tiene los siguientes gatos: ");
            System.out.println("");
            for (Gato s : listaDuenio003) {
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

    public static void creaUnCuartoDuenio(){
        Persona duenio004 = new Persona("yaraleth merrisen");
        ArrayList<Gato> listaDuenio004 = new ArrayList<Gato>();
        //    cuarto duenio


        System.out.println("");
        StringBuilder sb = new StringBuilder();

        if (listaDuenio004.size()==0)  {
            System.out.println("esta persona : " + duenio004.getNombre() + "  no Tiene Gatos!!! ");
        }
        else {
            System.out.println("la persona :  " +duenio004.getNombre()  + "  tiene los siguientes gatos: ");
            System.out.println("");
            for (Gato s : listaDuenio004) {
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

    public static void creaUnQuintoDuenio(){
        Persona duenio005 = new Persona("don verminieth");
        ArrayList<Gato> listaDuenio005 = new ArrayList<Gato>();
        listaDuenio005.add(new Gato("steppy", "panda", "cherry", 3));
        listaDuenio005.add(new Gato("gato con botas", "pelados", "cherry", 3));


        System.out.println("");
        StringBuilder sb = new StringBuilder();

        if (listaDuenio005.size()==0)  {
            System.out.println("esta persona : " + duenio005.getNombre() + " no Tiene Gatos!!! ");
        }
        else {
            System.out.println("la persona :  " +duenio005.getNombre()  + "  tiene los siguientes gatos: ");
            System.out.println("");
            for (Gato s : listaDuenio005) {
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

    public static void creaUnSextoDuenio(){
        Persona duenio006 = new Persona("mia yesmireleth");
        ArrayList<Gato> listaDuenio006 = new ArrayList<Gato>();
        listaDuenio006.add(new Gato("riff raff", "panda", "blanco-siena", 12));
        listaDuenio006.add(new Gato("orson", "angora", "marron", 7));
        listaDuenio006.add(new Gato("peewee", "greek cat", "salmon", 2));


        System.out.println("");
        StringBuilder sb = new StringBuilder();

        if (listaDuenio006.size()==0)  {
            System.out.println("esta persona : " + duenio006.getNombre() + " no Tiene Gatos!!! ");
        }
        else {
            System.out.println("la persona  " +duenio006.getNombre()  + "Tiene los siguientes gatos: ");
            System.out.println("");
            for (Gato s : listaDuenio006) {
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

    public static void creaUnSeptimoDuenio(){
        Persona duenio007 = new Persona("Yocsifer");
        ArrayList<Gato> listaDuenio007 = new ArrayList<Gato>();
        //   septimo duenio


        System.out.println("");
        StringBuilder sb = new StringBuilder();

        if (listaDuenio007.size()==0)  {
            System.out.println("esta persona : " + duenio007.getNombre() + " no Tiene Gatos!!! ");
        }
        else {
            System.out.println("la persona : " +duenio007.getNombre()  + "Tiene los siguientes gatos: ");
            System.out.println("");
            for (Gato s : listaDuenio007) {
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

    public static void creaUnOctavoDuenio(){
        Persona duenio008 = new Persona("seth y camelot");
        ArrayList<Gato> listaDuenio008 = new ArrayList<Gato>();
        listaDuenio008.add(new Gato("urdu", "stray", "invisible", 8));
        listaDuenio008.add(new Gato("malu", "golden cat", "malva", 2));


        System.out.println("");
        StringBuilder sb = new StringBuilder();

        if (listaDuenio008.size()==0)  {
            System.out.println("esta persona : " + duenio008.getNombre() + " no Tiene Gatos!!! ");
        }
        else {
            System.out.println("la persona:  " +duenio008.getNombre()  + "tiene los siguientes gatos: ");
            System.out.println("");
            for (Gato s : listaDuenio008) {
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



    public static void creaUnNovenoDuenio(){
        Persona duenio009 = new Persona("sam the follower");
        ArrayList<Gato> listaDuenio009 = new ArrayList<Gato>();
        listaDuenio009.add(new Gato("steppy", "panda", "cherry", 3));

        System.out.println("");
        StringBuilder sb = new StringBuilder();

        if (listaDuenio009.size()==0)  {
            System.out.println("esta persona : " + duenio009.getNombre() + "  no Tiene Gatos!!! ");
        }
        else {
            System.out.println("la persona :  " +duenio009.getNombre()  + " tiene los siguientes gatos: ");
            System.out.println("");
            for (Gato s : listaDuenio009) {
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

    public static void creaUnDecimoDuenio(){
        Persona duenio010 = new Persona("sisters of dawn");
        ArrayList<Gato> listaDuenio010 = new ArrayList<Gato>();
        listaDuenio010.add(new Gato("garfield", "stray cat", "bayo", 3));
        listaDuenio010.add(new Gato("tom", "feral", "salmon", 2));


        System.out.println("");
        StringBuilder sb = new StringBuilder();

        if (listaDuenio010.size()==0)  {
            System.out.println("esta persona : " + duenio010.getNombre() + "  no Tiene Gatos!!! ");
        }
        else {
            System.out.println("la persona : " +duenio010.getNombre()  + "  tiene los siguientes gatos: ");
            System.out.println("");
            for (Gato s : listaDuenio010) {
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

}

/*
*
*  public static void relacionaGatoConPersona(){}

    public static void relacionaMascotaConDuenio(){}

    public static void agregaMascotaAlDuenio(){}
*
*
*
* */
