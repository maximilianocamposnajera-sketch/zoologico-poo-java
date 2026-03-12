package zoologico;

public class Ave extends Animal {
    protected String colorPlumaje;
    protected double alturaMaximaVuelo;

    public Ave(String especie, String nombre, double peso, int jaula,
               String colorPlumaje, double alturaMaximaVuelo) {
        super(especie, nombre, peso, jaula);
        this.colorPlumaje = colorPlumaje;
        this.alturaMaximaVuelo = alturaMaximaVuelo;
    }

    @Override
    public String definirClaseDeAnimalEres() {
        return "Soy un ave llamada " + nombre + ", de la especie " + especie +
                ". Plumaje: " + colorPlumaje + ", Altura máxima de vuelo: " + alturaMaximaVuelo + " m. " +
                "Peso: " + peso + " kg. Estoy en la jaula " + jaula + ".";
    }
}
