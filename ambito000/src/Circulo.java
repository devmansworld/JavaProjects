import java.util.Scanner;

public class Circulo extends main{




    public static double areaCirculo(double radio)
    {
        double area = radio * radio * Math.PI;

        System.out.println ("El área del círculo es : " + area  + " cm2" );

        return area;


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

            areaCirculo(radio);
            periCirculo(radio);


        }catch(Exception e){System.out.println("radio en formato incorrecto");}


    }

}
