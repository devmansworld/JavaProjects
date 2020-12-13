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
           triangulo.area();
           System.out.println("Área del triángulo de base 5 y altura 10: " +
                   triangulo.getareaTriangulo());
       }
       else if (forma == 2) {
           Cuadrado cuadrado = new Cuadrado(10);
           cuadrado.area();
           System.out.println("Área del cuadrado de lado 10: " +
                   cuadrado.getareaCuadrado());
       }
       else if (forma == 3) {
           Circulo circulo = new Circulo(200);
           circulo.area();
           System.out.println("Área del círculo de radio 200: " +
                   circulo.getAreaRadio());
       }
       else if (forma == 4) {
           Rectangulo rectangulo = new Rectangulo(100, 20);
           rectangulo.area();
           System.out.println("Área del rectángulo de base 100 y altura 20: " +
                   rectangulo.getAreaRectangulo());
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



