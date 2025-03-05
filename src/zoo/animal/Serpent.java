package zoo.animal;

public class Serpent extends Animal {
    private boolean estVenimeux; // Attribut ajouté pour le différencier des autres animaux

    public Serpent(String nom, int age, double poids, boolean estVenimeux) {
        super(nom, age, poids);
        this.estVenimeux = estVenimeux;
    }

    @Override
    public void faireDuBruit() {
        System.out.println("Le serpent " + getNom() + " siffle !");
    }

    @Override
    public void seDeplacer() {
        System.out.println("Le serpent " + getNom() + " rampe silencieusement.");
    }

    @Override
    public void manger() {
        System.out.println("Le serpent " + getNom() + " avale sa proie.");
    }

    @Override
    public void faireSpectacle() {
        System.out.println("Le serpent " + getNom() + " s'enroule autour du soigneur !");
    }
}