import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        casoPrueba001();

    }

    public static void casoPrueba001() {
        Usuario usuario = new Usuario("Jorge González", 21245412);
        System.out.println("Bienvenido, " + usuario.getNombre() + ". Su DNI o Pasaporte es :" + usuario.getDni());
        CuentaBancaria cuentaBancaria = new CuentaBancaria(934302400, 0.0);
        System.out.println("Su Número de Cuenta Corriente es: " + cuentaBancaria.getIdentificador());
        System.out.println("Su Saldo Contable inicial es de USD$ : " + cuentaBancaria.getSaldo());
        ArrayList<Operacion> listaDeOperaciones = new ArrayList<Operacion>();


        System.out.println("-------------------------------------------------------------------------");
        //op1
        Operacion operacion001 = new Operacion("deposito", 85400.99);
        listaDeOperaciones.add(operacion001);
        System.out.println("Ha realizado la operación "
                + operacion001.getTipoOperacion()
                + " por el monto de USD$: " + operacion001.getMontoOperacion());
        double nuevoSaldoTemporal001 = operacion001.getMontoOperacion() + cuentaBancaria.getSaldo();
        cuentaBancaria.setSaldo(nuevoSaldoTemporal001);
        System.out.println("Su saldo contable luego de la operación " +
                "es de $USD: " + cuentaBancaria.getSaldo());
        cuentaBancaria.setOperacionesRealizadas(listaDeOperaciones);

        System.out.println("-------------------------------------------------------------------------");


        Operacion operacion002 = new Operacion("deposito", 1123400.99);
        listaDeOperaciones.add(operacion002);
        System.out.println("Ha realizado la operación "
                + operacion002.getTipoOperacion()
                + " por el monto de USD$: " + operacion002.getMontoOperacion());
        double nuevoSaldoTemporal002 = operacion002.getMontoOperacion() + cuentaBancaria.getSaldo();
        cuentaBancaria.setSaldo(nuevoSaldoTemporal002);
        System.out.println("Su saldo contable luego de la operación " +
                "es de $USD: " + cuentaBancaria.getSaldo());

        System.out.println("-------------------------------------------------------------------------");

        Operacion operacion003 = new Operacion("giro", -77700.29);
        listaDeOperaciones.add(operacion003);
        System.out.println("Ha realizado la operación "
                + operacion003.getTipoOperacion()
                + " por el monto de USD$: " + operacion003.getMontoOperacion());
        double nuevoSaldoTemporal003 = operacion002.getMontoOperacion() + cuentaBancaria.getSaldo();
        cuentaBancaria.setSaldo(nuevoSaldoTemporal003);
        System.out.println("Su saldo contable luego de la operación " +
                "es de $USD: " + cuentaBancaria.getSaldo());

        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Estimado(a) Cliente "+ usuario.getNombre()+ ":" );
        System.out.println("El siguiente es el listado de sus Operaciones para la cuenta bancaria " + cuentaBancaria.getIdentificador().toString());
        cuentaBancaria.setOperacionesRealizadas(listaDeOperaciones);
        usuario.setCuentaBancaria(cuentaBancaria);
        //
        for (Operacion operacion : listaDeOperaciones) {

            System.out.println(operacion.getTipoOperacion() + ": USD$ " + operacion.getMontoOperacion());

        }
        System.out.println("Y su saldo contable final es de USD$: "+cuentaBancaria.getSaldo());
        System.out.println("-------------fin de la transacción----------------------------------------");

        for ( Operacion operacion : usuario.getCuentaBancaria().getOperacionesRealizadas() ){
            System.out.println("* "+ operacion.getTipoOperacion() + "," + operacion.getMontoOperacion());

        }

    }
}