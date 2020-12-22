import java.util.ArrayList;


public class Usuario {
    private String nombre;
    private Integer dni;
    private CuentaBancaria cuentaBancaria;

    public Usuario(String nombre, Integer dni, CuentaBancaria cuentaBancaria) {
        this.nombre = nombre;
        this.dni = dni;
        this.cuentaBancaria = cuentaBancaria;
    }

    public Usuario(String nombre, Integer dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public CuentaBancaria getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(CuentaBancaria cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }
}
