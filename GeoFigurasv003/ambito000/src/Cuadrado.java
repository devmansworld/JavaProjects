import java.util.Scanner;

public class Cuadrado extends main {


    public double areaCuadrado(double lado)
    {double area = lado * lado;

        System.out.println (" El área del cuadrado es : " + area + " cm2");
        return area;

    }
    public double periCuadrado(double lado)
    {
        double perimetro = lado * 4;

        System.out.println (" El perímetro del cuadrado es : " + perimetro +" cm");

        return perimetro;

    }


    public void figura2()


    { Scanner scan = new Scanner (System.in);

        System.out.println ("ingrese el lado de uno de los lados :");

        try{
            double lado = scan.nextDouble();

            areaCuadrado(lado);
            periCuadrado(lado);
        }catch(Exception e){System.out.println("Error en formato de lado cuadrado");}


    }









}
