import java.util.Scanner;

public class Triangulo extends main {


    public double areaTriangulo(double base, double altura)
    {
        double area = base * altura * .5;
        System.out.println ( "El área del triángulo es : " + area + " cm2");
        return area;

    }

    public double periTriangulo(double base, double altura)

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





}
