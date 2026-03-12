package zoologico;

public class Mamifero extends Animal {

    public Mamifero(String especie, String nombre, double peso, int jaula) {
        super(especie, nombre, peso, jaula);
    }

    @Override
    public String definirClaseDeAnimalEres() {
        return "Soy un mamífero llamdo " + nombre + ", de la especie " + especie +
                ". Peso: " + peso + " kg. Estoy en la jaula " + jaula + ".";
    }
}
