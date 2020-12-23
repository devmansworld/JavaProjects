import java.util.ArrayList;

public class Familia {

    public String nombreFamilia;
    public int numeroIntegrantes;
    public ArrayList<Persona> listaDeMiembros;

    public Familia(String nombreFamilia) {
        this.nombreFamilia = nombreFamilia;
    }

    public Familia(String nombreFamilia, int numeroIntegrantes) {
        this.nombreFamilia = nombreFamilia;
        this.numeroIntegrantes = numeroIntegrantes;
    }

    public Familia(String nombreFamilia, int numeroIntegrantes, ArrayList<Persona> listaDeMiembros) {
        this.nombreFamilia = nombreFamilia;
        this.numeroIntegrantes = numeroIntegrantes;
        this.listaDeMiembros = listaDeMiembros;
    }

    public String getNombreFamilia() {
        return nombreFamilia;
    }

    public void setNombreFamilia(String nombreFamilia) {
        this.nombreFamilia = nombreFamilia;
    }

    public int getNumeroIntegrantes() {
        return numeroIntegrantes;
    }

    public void setNumeroIntegrantes(int numeroIntegrantes) {
        this.numeroIntegrantes = numeroIntegrantes;
    }

    public ArrayList<Persona> getListaDeMiembros() {
        return listaDeMiembros;
    }

    public void setListaDeMiembros(ArrayList<Persona> listaDeMiembros) {
        this.listaDeMiembros = listaDeMiembros;
    }

    public Familia(ArrayList<Persona> listaDeMiembros) {
        this.listaDeMiembros = listaDeMiembros;
    }
}
/*

int firstItem = array[0];
int lastItem = array[array.length - 1];


* class ArrayDemo {
    public static void main(String[] args) {
        // declares an array of integers
        int[] anArray;

        // allocates memory for 10 integers
        anArray = new int[10];

        // initialize first element
        anArray[0] = 100;
        // initialize second element
        anArray[1] = 200;
        // and so forth
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;

        System.out.println("Element at index 0: "
                           + anArray[0]);
        System.out.println("Element at index 1: "
                           + anArray[1]);
        System.out.println("Element at index 2: "
                           + anArray[2]);
        System.out.println("Element at index 3: "
                           + anArray[3]);
        System.out.println("Element at index 4: "
                           + anArray[4]);
        System.out.println("Element at index 5: "
                           + anArray[5]);
        System.out.println("Element at index 6: "
                           + anArray[6]);
        System.out.println("Element at index 7: "
                           + anArray[7]);
        System.out.println("Element at index 8: "
                           + anArray[8]);
        System.out.println("Element at index 9: "
                           + anArray[9]);
    }
}
*
* */