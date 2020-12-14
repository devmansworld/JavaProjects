package geometria;
import java.util.Scanner;

public class Geometria
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
       int forma = 0;
       forma = intro(forma);
       if (forma  ==1 ) {
           Triangulo triangulo = new Triangulo(5, 10);
           triangulo.figura1();
           //triangulo.areaTriangulo();


           System.out.println("Área del triángulo : " +
                   triangulo.getArea());
       }
       else if (forma == 2) {
           Cuadrado cuadrado = new Cuadrado(10);
           cuadrado.figura2();
           //cuadrado.areaCuadrado();
        //    cuadrado.periCuadrado();
           System.out.println("Área del cuadrado : " +
                   cuadrado.getArea());
       }
       else if (forma == 3) {
           Circulo circulo = new Circulo(200);
           circulo.figura3();
           //circulo.areaCirculo();
           System.out.println("Área del círculo: " +
                   circulo.getArea());
       }
       else if (forma == 4) {
           Rectangulo rectangulo = new Rectangulo();
           rectangulo.figura4();

           //   Rectangulo.areaRectangulo();
        //   Rectangulo.perimetro();

           rectangulo.getArea();
           System.out.println("Área del rectángulo  " +
                   rectangulo.getArea());
       }
    }

    public static int intro(int forma)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Geofiguras v003. Escoger figura a calcular: ");

        System.out.println ("Solo opciones Triangulo ,Cuadrado, Círculo ó Rectángulo");
        System.out.println ("Solo opciones 1,2, 3 ó 4");
        try {
            forma = scan.nextInt();
        }
        catch (Exception e) {
            System.out.println("¡System halted, solo opciones 1,2, ó 3 !");
        }
        return forma;
    }
}



