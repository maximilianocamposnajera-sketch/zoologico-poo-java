package zoologico;

public abstract class Animal {
    protected String especie;
    protected String nombre;
    protected double peso;
    protected int jaula;

    public Animal(String especie, String nombre, double peso, int jaula) {
        this.especie = especie;
        this.nombre = nombre;
        this.peso = peso;
        this.jaula = jaula;
    }

    // Metodo abstracto que se implementra en subclases
    public abstract String definirClaseDeAnimalEres();

    public String getInfo() {
        return "Nombre: " + nombre +
                ", Especie: " + especie +
                ", Peso: " + peso + " kg" +
                ", Jaula: " + jaula;
    }
}
