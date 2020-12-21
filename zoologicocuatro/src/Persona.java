import java.util.ArrayList;
import java.lang.String;

public class Persona {

    private String nombre;
    private ArrayList<Gato> listadegatos;

    public ArrayList<Gato> getListadegatos() {
        return listadegatos;
    }

    public void setListadegatos(ArrayList<Gato> listadegatos) {
        this.listadegatos = listadegatos;
    }

    public Persona(String nombre, ArrayList<Gato> listadegatos){
        this.nombre = nombre;
        this.listadegatos = listadegatos;
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

}




