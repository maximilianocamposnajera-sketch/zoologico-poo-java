package zoologico;

public class Insecto extends Animal {
    protected boolean vuela;

    public Insecto(String especie, String nombre, double peso, int jaula, boolean vuela) {
        super(especie, nombre, peso, jaula);
        this.vuela = vuela;
    }

    @Override
    public String definirClaseDeAnimalEres() {
        return "Soy un insecto llamado " + nombre + ", de la especie " + especie +
                ". " + (vuela ? "Puedo volar." : "no vuelo.") +
                " Peso: " + peso + " kg. Estoy en la jaula " + jaula + ".";
    }
}
