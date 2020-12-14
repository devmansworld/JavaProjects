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
    public Circulo(){}

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
    public void setArea(double area) {this.area = area; }

    //atributo de esa clase, definido en linea 8 = area 2 es igual al atributo.
 // area2 es nombre del parametro   // area es el nombre del atributo
//    public void setArea(double area2) {this.area = area2; }

    public double getPerimetro() {return perimetro; }
    public void setPerimetro(double perimetro)
    {
        this.perimetro = perimetro;
    }

    //que el atributo perimetro obtenga el valor de perimetro

    public void area()
    {
        area = pi * radio * radio;
    }
    public double periCirculo(double radio)
    {
        double perimetro = 2 * radio * Math.PI;

        System.out.println ("El perimetro del círculo es : " + perimetro + "cm" );
        return perimetro;
    }

    public void figura3()
    {
        Scanner scan = new Scanner (System.in);
        System.out.println ("ingrese el radio del círculo");

        try{
            double radio = scan.nextDouble();

        }catch(Exception e){System.out.println("radio en formato incorrecto");

        }
        area();
        perimetro(radio);

    //
        //

    }

// set y get : metodos publicos para acceder a los atributos.

    // por ejemplo base, altura : que otorga resultado en área

    //


   /* @Override
    public void areaCirculo() {
    area = ( radio * radio * pi);
    }  */
}