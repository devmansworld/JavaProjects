import java.util.ArrayList;
import java.lang.String;

public class Persona {

    private String nombre;
    private Gato gato;

    public Persona(String nombre, Gato gato){
        this.nombre = nombre;
        this.gato = gato;
    }

    public Persona(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Gato getGato() {
        return gato;
    }
    public void setGato(Gato gato) {
        this.gato = gato;
    }
    public void noHaceNada(){}
    public void haceAlgo(){}
    public void asignarGatos(){}
    public void imprimeGatos(){}






}
/* Ejemplo:
Crear una clase Persona que puede tener ningun gato o muchos gatos. (Usar ArrayList)
Imprimir el nombre del dueño y el nombre de los gatos que tiene asociado (si tuviera). Si no tiene gatos, imprimir "No tiene gato"
 Para imprimir crea un ejemplo:
Una persona que no tiene gatos
Una persona con 1 gato
Una persona con mas de +1 gato


listadegatos.add(new Gato("felini", "gatomediano", " clarito ", 2));
        listadegatos.add(new Gato("felini", "gatomediano", " clarito ", 2));
        listadegatos.add(new Gato("silvestre", "panda", "invisible", 8));
        listadegatos.add(new Gato("tom", "feral", "salmon", 2));
        listadegatos.add(new Gato("garfield", "stray cat", "bayo", 3));
        listadegatos.add(new Gato("run", "siamese", "pardo", 5));
        listadegatos.add(new Gato("tobias", "greek", "marron", 7));




  //primer duenio
        superLista.add(new Gato("felini", "gatomediano", " clarito ", 2));
        superLista.add(new Gato("silvestre", "panda", "invisible", 8));

    //    segundo duenio
        superLista.add(new Gato("tom", "feral", "salmon", 2));


    //    tercer duenio

        superLista.add(new Gato("tobias", "greek", "marron", 7));
        superLista.add(new Gato("pong", "angora", "blanco-siena", 12));
           superLista.add(new Gato("jesus saves", "siamese", "bayo", 3));


    //    cuarto duenio

     //  quinto duenio
        superLista.add(new Gato("steppy", "panda", "cherry", 3));
        superLista.add(new Gato("gato con botas", "pelados", "cherry", 3));

       // sexto duenio
        superLista.add(new Gato("riff raff", "panda", "blanco-siena", 12));
        superLista.add(new Gato("orson", "angora", "marron", 7));
          superLista.add(new Gato("peewee", "greek cat", "salmon", 2));

     //   septimo duenio





      //  octavo duenio
        superLista.add(new Gato("urdu", "stray", "invisible", 8));
        superLista.add(new Gato("malu", "golden cat", "malva", 2));

     //   noveno duenio
        superLista.add(new Gato("steppy", "panda", "cherry", 3));


   //     decimo duenio
        superLista.add(new Gato("garfield", "stray cat", "bayo", 3));
        superLista.add(new Gato("tom", "feral", "salmon", 2));

// user de prueba



 public static void creaCeroDuenio(){
        Persona duenio001 = new Persona("jurelio en masa");
        ArrayList<Gato>listaDuenio000 = new ArrayList<Gato>();
        listaDuenio001.add(new Gato("folini", "gatomediani", " clarita ", 2));
        listaDuenio001.add(new Gato("silvastre", "pinda", "invisible", 8));

    }


*/
