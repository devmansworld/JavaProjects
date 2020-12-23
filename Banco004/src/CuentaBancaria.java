import java.util.ArrayList;

public class CuentaBancaria {

    private int identificador;
    private double saldo;
    private ArrayList <Operacion> operacionesRealizadas;

    public Integer getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Integer identificador) {
        this.identificador = identificador;
    }

    public CuentaBancaria(Integer identificador, Double saldo, ArrayList<Operacion> operacionesRealizadas) {
        this.identificador = identificador;
        this.saldo = saldo;
        this.operacionesRealizadas = operacionesRealizadas;
    }

    public CuentaBancaria(Integer identificador, Double saldo) {
        this.identificador = identificador;
        this.saldo = saldo;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public ArrayList<Operacion> getOperacionesRealizadas() {
        return operacionesRealizadas;
    }

    public void setOperacionesRealizadas(ArrayList<Operacion> operacionesRealizadas) {
        this.operacionesRealizadas = operacionesRealizadas;
    }
}
