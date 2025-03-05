package zoo.animal;

public class Oiseau extends Animal {
    private double envergure; // Attribut ajouté pour le différencier des autres animaux

    public Oiseau(String nom, int age, double poids, double envergure) {
        super(nom, age, poids);
        this.envergure = envergure;
    }

    @Override
    public void faireDuBruit() {
        System.out.println("L'oiseau " + getNom() + " chante mélodieusement !");
    }

    @Override
    public void seDeplacer() {
        System.out.println("L'oiseau " + getNom() + " vole gracieusement.");
    }

    @Override
    public void manger() {
        System.out.println("L'oiseau " + getNom() + " picore des graines.");
    }

    @Override
    public void faireSpectacle() {
        System.out.println("L'oiseau " + getNom() + " fait une magnifique démonstration de vol !");
    }
}