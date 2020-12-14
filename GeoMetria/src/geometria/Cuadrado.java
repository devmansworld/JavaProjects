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
    public Cuadrado() {
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

    public void setArea(double lado) {this.area = area; }

    public double getPerimetro()
    {

        return perimetro;
    }

    public void setPerimetro()
    {this.perimetro = perimetro;}


    //@Override
    public void area()
    {
        area = lado * lado;
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
        double lado = scan.nextDouble();
        try{

        }catch(Exception e){System.out.println("Error en formato de lado cuadrado");}
        areaCuadrado(lado);
        periCuadrado(lado);
    }

    public double area(double lado)
    {double area = lado * lado;

        System.out.println (" El área del cuadrado es : " + area + " cm2");
        return area;
    }


}

