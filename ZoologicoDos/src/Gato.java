import java.util.ArrayList;
import java.lang.String;

public class Gato {

    private String nombre;
    private String raza;
    private String color;
    private  Integer edad;

    public Gato(String nombre, String raza, String color, Integer edad)
    {
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.edad = edad;
    }

    public Gato() {}

    public Gato(String nombre, String raza)
    { this.nombre = nombre;
        this.raza = raza;}

    // constructor con solo 2 parametros

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }




}





// public Gato gato1 = new Gato("bacano","texto","texto", 0);
//  public Gato gato1 = new Gato("bacano","texto","texto", 0);   public Gato gato01 = new Gato("bacan1","texto1","texto1", 0);
//    public Gato gato02 = new Gato("bacan2","texto2","texto2", 0);
//    public Gato gato03 = new Gato("bacan3","texto3","texto3", 0);
//    public Gato gato04 = new Gato("bacan4","texto4","texto4", 0);
//    public Gato gato05 = new Gato("bacan5","texto5","texto5", 0);