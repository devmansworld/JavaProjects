import java.util.Scanner;

public class main {


    public static void main(String []args)
    {int forma = 0;


        forma = intro(forma);

        if (forma == 1) {
            Triangulo.figura1();
        } else if (forma == 2) {
            Cuadrado.figura2();
        } else if (forma == 3) {
            Circulo.figura3();

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
