public class Main {

    public static void main (String [] args )
    {
        Gato gato2 = new Gato("micifus", "angora")
        { System.out.println( gato2.getNombre + gato2.getRaza); }

        Gato gato3 = new Gato('Willy', '"Angora', "gris", 9)
        {System.out.println( gato3.nombre, gato3.raza, gato3.color, gato3.edad); }

        Gato gato1() = new Gato()
    {}

    }

}

/*Ejercicio 1:
        Crear una Clase Cat, que tenga los atributos: nombre, raza, color, edad.
        Permitir a un usuario crear un objeto de la Clase Cat. con un constructor que no reciba parametros.
        Permitir a un usuario crear un objeto de la Clase Cat. con un constructor que reciba solo el nombre y la raza.
        Permitir a un usuario crear un objeto de la Clase Cat. con un constructor que reciba nombre, raza, color, edad.
        Resultado
        Cat cat1 = new Cat(); // cat1.nombre= "name" // cat2.raza = "raza";
        Cat cat2 = new Cat(nombre, raza);
        Cat cat3 = new Cat(nombre, raza, color, edad)
        Print:
        cat1.nombre + cat1.raza
        cat2.nombre + cat2.raza
        cat3.nombre + cat3.raza + cat3.color + cat3.edad
        Tema: Sobrecarga de metodos
*/