package zoo.gestion;

import zoo.animal.Animal;
import java.util.ArrayList;
import java.util.List;

public class Enclos {
    private String nom;
    private int capaciteMax;
    private int proprete;
    private List<Animal> animaux;

    public Enclos(String nom, int capaciteMax) {
        this.nom = nom;
        this.capaciteMax = capaciteMax;
        this.proprete = 10;
        this.animaux = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getCapaciteMax() {
        return capaciteMax;
    }

    public void setCapaciteMax(int capaciteMax) {
        this.capaciteMax = capaciteMax;
    }

    public int getProprete() {
        return proprete;
    }

    public void setProprete(int proprete) {
        this.proprete = proprete;
    }

    public List<Animal> getAnimaux() {
        return animaux;
    }

    public void setAnimaux(List<Animal> animaux) {
        this.animaux = animaux;
    }

    public void ajouterAnimal(Animal animal) {
        if (animaux.size() < capaciteMax) {
            animaux.add(animal);
            System.out.println(animal.getNom() + " a été ajouté à l'enclos " + nom);
        } else {
            System.out.println("L'enclos " + nom + " est plein !");
        }
    }

    public void nouveauJour() {
        proprete--;
        if (proprete < 3) {
            System.out.println("L'enclos " + nom + " doit être nettoyé !");
        }
    }

    public void nettoyer() {
        proprete = 10;
        System.out.println("L'enclos " + nom + " a été nettoyé !");
    }


}