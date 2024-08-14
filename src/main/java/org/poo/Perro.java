package org.poo;

class Perro extends Animal {
    private String raza;

    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad);
        this.raza = raza;
    }

    @Override
    public void hacerSonido() {
        System.out.println("El perro hace: ¡Guau guau!");
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Raza: " + raza);
    }
}

class Gato extends Animal {
    private String tipo;

    public Gato(String nombre, int edad, String tipo) {
        super(nombre, edad);
        this.tipo = tipo;
    }

    @Override
    public void hacerSonido() {
        System.out.println("El gato hace: ¡Miau miau!");
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tipo: " + tipo);
    }
}
