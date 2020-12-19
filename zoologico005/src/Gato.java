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
