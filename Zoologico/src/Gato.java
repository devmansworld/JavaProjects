public class Gato extends Animal {

    String nombre;
    String raza;
    String color;
    Integer edad;


    public Gato(String nombre, String raza, String color, Integer edad)
    {
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.edad = edad;
    }

    public Gato() {}


    public Gato(String nombre, String Raza, String Color, int Edad)
    {
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.edad = edad;

    }

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
