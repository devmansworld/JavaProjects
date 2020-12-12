import java.util.Scanner;

public class main {


    public static void main(String[] args)
    {int forma = 0;


        forma = intro(forma);

        if (forma == 1) {
            Triangulo triangulo = new Triangulo();
            triangulo.figura1(); // se ha llamado metodo de clase sin tener el objeto  , corregido
            // las clases estáticas se usan cuando no se necesita instancias de objetos : son clases genéricas de las cuales solo invoca sus métodos.

            double atrea = 0;
            double batse = 0;

            triangulo.areaTriangulo(atrea, batse);
          // no matchea nombre sino el tipo
            // por este motivo arroja error: por el tipo no por el dato como tal
            // si se elimina los estatic va a salir todos disponibles
            //

        } else if (forma == 2) {
            Cuadrado cuadrado = new Cuadrado();
            cuadrado.figura2();
            double lado = 0;
           cuadrado.areaCuadrado(lado);


        } else if (forma == 3) {
            Circulo circulo = new Circulo();
            Circulo.figura3();
            double radio = 0;
            circulo.areaCirculo(radio);

        } else
            System.out.println("Cerrando rutina");
    }



    public static int intro(int forma)
    {
        Scanner scan = new Scanner(System.in);
        int ejemplo = 0;


        System.out.println("Geofiguras v002. Escoger figura a calcular:");
        System.out.println("Triángulo Rectángulo (1), Cuadrado (2), Círculo (3)");
        try {

            forma = scan.nextInt();

        }

        catch(Exception e) {
            System.out.println("Solo opciones 1,2,ó 3");
            //


        }

        ejemplo = 4;



        return forma;

    }


}
