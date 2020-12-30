import java.util.ArrayList;

public class Family {

    private ArrayList<Person> membersList;
    public ArrayList<Person> getMembersList() {
        return membersList;
    }
    public Family() {
        this.membersList = membersList;
    }
    public void setMembersList(ArrayList<Person> membersList) {
        this.membersList = membersList;
    }
}
/*



Leo, ejercicio:
Una familia tiene muchos integrantes.
Cada integrante puede tener uno o mas de un tipo de animal: loro, gato, perro. Cada animal tiene un nombre.  Por ejemplo: Un integrante puede tener un perro y un loro. Otro integrante puede tener solo gato.
Resultados:
Quiero saber cuantos integrantes tienen loro. Y cuales son los nombres de los integrantes.
Quiero saber quien es el dueño del animal "X".
Quiero saber el nombre de todos los integrantes con sus respectivas mascotas.
Quiero saber quienes tienen Loro y Gato pero no Perro.
Se considerara:
Clases, y alcance de sus atributos (privados, publicos, protected)
Conocimiento desarrollado hasta el momento (instanciamiento de clases, orden de metodos y su objetivo)
Codigo 100% funcionando.
Optimizacion de codigo y de uso apropiado de estructuras de datos.
*
*/