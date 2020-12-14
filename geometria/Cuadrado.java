package geometria;
import java.util.Scanner;
public class Cuadrado implements FiguraGeometrica
{
    //public String getArea;
    private double lado;
    private double area;
    private double perimetro;

    public Cuadrado(double lado)
    {
        this.lado = lado;
    }

    public double getLado()
    {
        return lado;
    }

    public void setLado(double lado)
    {
        this.lado = lado;
    }

    public double getArea()
    {
        return area;
    }

    public double getPerimetro()
    {

        return perimetro;
    }

    public void setPerimetro()
    {this.perimetro = perimetro;}

    /*@Override
    public void areaCuadrado()
    {
        area = lado * lado;
    }
*/

    public static double periCuadrado(double lado)
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

          //  Cuadrado.area(lado);
           //  Cuadrado.perimetro(lado);
        }catch(Exception e){System.out.println("Error en formato de lado cuadrado");}
    }


    public void areaCuadrado() {

    area = lado * lado;

    }
}

