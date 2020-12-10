import java.util.Scanner;
public class Calculadora003 {

    public void main(String[] args) {  //no es necesario sea static
        boolean result=true;
        while(result) {
            result=capturaInput();
        }
    }
    public boolean capturaInput() {  //no es necesario sea static
        double primerOperando=0;
        double segundoOperando=0;
        double resultado = 0;
        Scanner lector = new Scanner(System.in);
        try {
            System.out.println("Ingrese primer número");
            primerOperando = lector.nextDouble();

            System.out.println("Ingresar segundo número");
            segundoOperando = lector.nextDouble();

            escogeOperacion(primerOperando, segundoOperando, resultado);
            return false;
        }catch(Exception e){ //Se ha quidado un try/catch
            System.out.println("Nuevamente favor solo números");
        } // funcion si retorna valor
        return true;
    }
    public void escogeOperacion(double primerOperando, double segundoOperando,  double resultado){
        System.out.print("Ingrese un operador (+. -, *, /): ");
        Scanner lector = new Scanner(System.in);
        char operador = lector.nextLine().charAt(0);
        switch(operador)
        {
            case '+':
                resultado = primerOperando
                        + segundoOperando;
                break;
            case '-':
                resultado = primerOperando - segundoOperando;
                break;
            case '*':
                resultado = primerOperando * segundoOperando;
                break;
            case '/':
                resultado = primerOperando / segundoOperando;
                break;
            default:
                System.out.println("Error, el operador no corresponde");
                break;
        }
        mostrarResultado(primerOperando, segundoOperando, resultado, operador);
    }
    public void mostrarResultado( double primerOperando, double segundoOperando, double resultado,char operador){
        System.out.println(primerOperando + " " + operador + " " + segundoOperando + " = " + resultado);
      //metodo es cuando No devuelve un valor de return. y se etiqueta VOID.
    }
}