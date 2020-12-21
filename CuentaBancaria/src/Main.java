import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main (String [] args ) {
       nuevoUsuario();

       // imprimeOperaciones();
    }

    public static void nuevoUsuario(){
        // Usuario usuario = new Usuario("pepito gomez", 20141547);
        String suNombre ="";
        Integer suDni = 0;

        Scanner cualnombre = new Scanner(System.in);
        System.out.println("Banco Dolares, Ingresar nombre del Cliente ");
        try{
            suNombre = cualnombre.nextLine();
            try{
                System.out.println("Hola " + suNombre + " Favor ingresar DNI o Pasaporte:  ");
                Scanner cualpasaporte = new Scanner(System.in);
                suDni = cualpasaporte.nextInt();
                Usuario usuario = new Usuario(suNombre,suDni);

            }
            catch(Exception e){
                System.out.println("El pasaporte o dni no coincide");
            }
        }
        catch(Exception e){
            System.out.println(" nombre no coincide");
        }


        Usuario usuario = new Usuario("", 0000000);
        CuentaBancaria cuentaBancaria = new CuentaBancaria(000000,0.0);
        double saldo = cuentaBancaria.getSaldo();
        ArrayList<Operacion> operaciones = new ArrayList<Operacion>() ;



        nuevaOperacion(operaciones);
    }



    public static void nuevaOperacion(ArrayList<Operacion> operaciones) {
       //  Double saldo = getSaldo();
        Double monto = 0.0;


        Integer operacion;
        String nombreOperacion;
        System.out.println("ingrese el tipo de operación : 1 deposito, 2 giro");
        Scanner escoger = new Scanner(System.in);
        /*   */
        try {
            operacion = escoger.nextInt();
            if(operacion == 1){
                nombreOperacion ="Deposito";
                System.out.println("Ha escogido " + nombreOperacion);
                try {
                    System.out.println("Ingrese monto");
                    Scanner ingresar = new Scanner(System.in);
                    monto = ingresar.nextDouble();

                   // operaciones.add("", monto);

                }catch(Exception E){System.out.println("Monto no corresponde");}
                operaciones.add(new Operacion(nombreOperacion, monto));
            
            }
            else if(operacion ==2){
                nombreOperacion ="Giro";
                System.out.println("Ha escogido " + nombreOperacion);
                try {
                    System.out.println("Ingrese monto");
                    Scanner ingresar = new Scanner(System.in);
                    monto = ingresar.nextDouble();
                    monto = monto-2*monto;

                    // operaciones.add("", monto);

                }catch(Exception E){System.out.println("Monto no corresponde");}
                operaciones.add(new Operacion(nombreOperacion, monto));


            }
            else{
                System.out.println("Solo opciones 1 ó 2 !!!! ");
            }

        } catch (Exception e) {
            System.out.println("Solo opciones 1 ó 2");
        }



    }
    public static void imprimeOperaciones(Usuario usuario){
        System.out.println("");
        System.out.println(" Usuario: " + usuario.getNombre() + " Dni: " + usuario.getDni() );
        System.out.println(" Operaciones: " + usuario.getCuentaBancaria().getOperacionesRealizadas());
    }

    public void nuevaOperacion000(){

    Operacion operacion = new Operacion("deposito",800.60);
    double monto = operacion.getMontoOperacion();



    }



}


/*
*
*
*    public void nuevoUsuarioBancario001(){
        Usuario usuario001 = new Usuario("juanito flores", 12345345);
        CuentaBancaria cuentaBancaria = new CuentaBancaria(000000,0.0);
    }

    public void nuevoUsuarioBancario002(){
        Usuario usuario002 = new Usuario("mariela pino", 45646722);

    }     CuentaBancaria cuentaBancaria = new CuentaBancaria(000000,0.0);

    public void nuevoUsuarioBancario003(){
        Usuario usuario003 = new Usuario("cristian gutierrez",23445669);
        CuentaBancaria cuentaBancaria = new CuentaBancaria(000000,0.0);
    }

    public void nuevoUsuarioBancario004(){
        Usuario usuario002 = new Usuario("selena perez", 52343678);
        CuentaBancaria cuentaBancaria = new CuentaBancaria(000000,0.0);
    }

*
*
*
*     public void nuevaOperacion001(){
    Operacion operacion = new Operacion("deposito", 85400.60);
    }
    public void nuevaOperacion002(){
        Operacion operacion = new Operacion("giro", -6760.11);
    }

    public void nuevaOperacion003(){
        Operacion operacion = new Operacion("giro", -555.66);
    }

    public void nuevaOperacion004(){
        Operacion operacion = new Operacion("deposito", 6555.66);
    }
    *
    *
    *     public static void nuevoUsuario000(){
       // Usuario usuario = new Usuario("pepito gomez", 20141547);
        Usuario usuario = new Usuario("", 0000000);
        CuentaBancaria cuentaBancaria = new CuentaBancaria(000000,0.0);
        double saldo = cuentaBancaria.getSaldo();
        ArrayList<Operacion> operaciones = new ArrayList<Operacion>() ;
    }

    *
    *
    *
    *
    *

*
* */