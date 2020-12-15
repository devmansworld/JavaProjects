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
            Triangulo triangulo = new Triangulo(0, 0);
            triangulo.figura1();

        }
        else if (forma == 2) {
            Cuadrado cuadrado = new Cuadrado(0);
            cuadrado.figura2();

        }
        else if (forma == 3) {
            Circulo circulo = new Circulo(  0);
            circulo.figura3();

        }
        else if (forma == 4) {
            Rectangulo rectangulo = new Rectangulo();
            rectangulo.figura4();

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
















