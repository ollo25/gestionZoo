package zoo.gestion;

import zoo.animal.Animal;
import java.util.Random;

public class Soigneur {
    private String nom;
    private String specialite;
    private boolean estOccupe;
    private Random random;

    public Soigneur(String nom, String specialite) {
        this.nom = nom;
        this.specialite = specialite;
        this.estOccupe = false;
        this.random = new Random();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public boolean getEstOccupe() {
        return estOccupe;
    }

    public void setEstOccupe(boolean estOccupe) {
        this.estOccupe = estOccupe;
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public boolean diagnostiquer(Animal animal) {
        if (estOccupe) {
            System.out.println(nom + " est déjà occupé aujourd'hui.");
            return false;
        }

        boolean maladie = random.nextBoolean();
        if (maladie) {
            System.out.println(nom + " a diagnostiqué une maladie chez " + animal.getNom());
            animal.setEstMalade(true);
        } else {
            System.out.println(animal.getNom() + " est en bonne santé !");
        }
        return maladie;
    }

    public void soigner(Animal animal) {
        if (estOccupe) {
            System.out.println(nom + " est déjà occupé aujourd'hui.");
            return;
        }

        if (animal.getEstMalade()) {
            animal.setEstMalade(false);
            System.out.println(nom + " a soigné " + animal.getNom());
        } else {
            System.out.println(animal.getNom() + " n'est pas malade !");
        }
    }

    public void nettoyerEnclos(Enclos enclos) {
        if (!estOccupe) {
            estOccupe = true;
            enclos.nettoyer();
            System.out.println(nom + " nettoie l'enclos " + enclos.getNom());
        } else {
            System.out.println(nom + " est déjà occupé aujourd'hui.");
        }
    }
}