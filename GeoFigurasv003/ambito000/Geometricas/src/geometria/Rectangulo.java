package geometria;

import java.util.Scanner;

public class Rectangulo implements FiguraGeometrica
{
    private double base;
    private double altura;
    private double area;
    private double perimetro;

    public Rectangulo(double base, double altura)
    {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {

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
        area= base * altura;
    }



    public static double perimetro(double base, double altura)

    {
        double perimetro =  base + base + altura + altura;

        System.out.println (" El perímetro del rectángulo es : " + perimetro +" cm");

        return perimetro;

    }


    public static double area (double base, double altura)
    {double area = base * altura;

        System.out.println (" El área del rectángulo es : " + area + " cm2");
        return area;

    }

    public static void figura4()

    {Scanner scan = new Scanner (System.in);

        System.out.println("Ingresar la base del rectángulo: ");
        try {
            double base = scan.nextDouble();


            System.out.println("Ingresar su altura: ");


            try {
                double altura = scan.nextDouble();


                area(base, altura); //
                perimetro(base, altura); //

            } catch (Exception e) {
                System.out.println("formato de dato altura no coincide");
            }
        }catch (Exception e) {System.out.println("Cerrando");}



    }












}