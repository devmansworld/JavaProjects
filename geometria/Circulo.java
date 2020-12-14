package geometria;

import java.util.Scanner;

public class Circulo implements FiguraGeometrica
{
    private double radio;
    private double area;
    private double perimetro;
    static final double pi = 3.1415;

    public Circulo(double radio)
    {
        this.radio = radio;
    }

    public double getRadio()
    {
        return radio;
    }

    public void setRadio(double radio)
    {
        this.radio = radio;
    }

    public double getArea()
    {
        return area;
    }

    public void setPerimetro()
    {
        this.perimetro = perimetro;
    }

    public double getPerimetro()
    {return perimetro;
    }


    public void areaCirculo()
    {
        area = pi * radio * radio;
    }

    public static double periCirculo(double radio)
    {
        double perimetro = 2 * radio * Math.PI;

        System.out.println ("El perimetro del círculo es : " + perimetro + "cm" );

        return perimetro;

    }

    public static void figura3()
    {
        Scanner scan = new Scanner (System.in);
        System.out.println ("ingrese el radio del círculo");

        try{
            double radio = scan.nextDouble();




        }catch(Exception e){System.out.println("radio en formato incorrecto");}


    }


   /* @Override
    public void areaCirculo() {
    area = ( radio * radio * pi);
    }  */
}