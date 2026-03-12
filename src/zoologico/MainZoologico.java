package zoologico;

public class MainZoologico {
    public static void main(String[] args) {
        Animal[] animales = new Animal[3];

        animales[0] = new Mamifero("Leon", "Simba", 190.5, 1);
        animales[1] = new Ave("Aguila", "cielo", 5.2, 2, "Cafe oscro", 3500);
        animales[2] = new Insecto("Abeja", "Buzz", 0.02, 3, true);

        System.out.println("--- Zoologico --");
        for (Animal a : animales) {
            System.out.println(a.definirClaseDeAnimalEres());
        }
    }
}
