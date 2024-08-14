package org.poo;

//TIP Para <b>ejecutar</b> el código, presione <shortcut actionId="Run"/> o
// Haga clic en el icono <icon src="AllIcons.Actions.Execute"/> en el margen del editor.
public class Main {
    public static void main(String[] args) {
        // Crear objetos de las clases
        Perro perro = new Perro("Firulais", 3, "Chihuahua");
        Gato gato = new Gato("Michi", 2, "Siames");

        // Mostrar información de los animales
        perro.mostrarInformacion();
        gato.mostrarInformacion();

        // Demostrar polimorfismo
        Animal miAnimal = new Perro("Rex", 5, "Pastor Alemán");
        miAnimal.mostrarInformacion();
        miAnimal.hacerSonido();

        miAnimal = new Gato("Garfield", 4, "Persa");
        miAnimal.mostrarInformacion();
        miAnimal.hacerSonido();
    }
}