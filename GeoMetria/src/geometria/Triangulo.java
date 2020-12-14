package geometria;
import java.util.Scanner;
public class Triangulo implements FiguraGeometrica
{
    private double base;
    private double altura;
    private double area;
    private double perimetro;

    public Triangulo(double base, double altura)
    {
        this.base = base;
        this.altura = altura;
    }

    public double getBase()
    {
        return base;
    }

    public void setBase(double base)
    {
        this.base = base;
    }

    public double getAltura()
    {
        return altura;
    }

    public void setAltura(double altura)
    {
        this.altura = altura;
    }

    public double getArea()
    {
        return area;
    }


    @Override
    public void area()
    {
        area = base * altura / 2;
    }

    public void setArea(double area) {
        this.area = area;
    }
    public static double areaTriangulo(double base, double altura)
    {
        double area = base * altura * .5;
        System.out.println ( "El área del triángulo es : " + area + " cm2");
        return area;

    }

//

    public static double periTriangulo(double base, double altura)

    {   double c = Math.sqrt(base * base + altura * altura);

        double perimetro= altura + base + c;

        System.out.println("El perímetro del triángulo es : " + perimetro + "  cm");
        return perimetro;
    }



    public void figura1()

    {
        Scanner scan = new Scanner (System.in);

        System.out.println("Ingresar la base del triángulo: ");
        try {
            double base = scan.nextDouble();


            System.out.println("Ingresar su altura: ");


            try {
                double altura = scan.nextDouble();
                areaTriangulo(base, altura); //
                periTriangulo(base, altura); //


            } catch (Exception e) {
                System.out.println("formato de dato altura no coincide");
            }
        }catch (Exception e) {System.out.println("Cerrando");}
    }


    // public void perimetro() { perimetro =    }
}








/*
 public static double periTriangulo(double base, double altura)

    {   double c = Math.sqrt(base * base + altura * altura);

        double perimetro= altura + base + c;

        System.out.println("El perímetro del triángulo es : " + perimetro + "  cm");
        return perimetro;
    }

 */