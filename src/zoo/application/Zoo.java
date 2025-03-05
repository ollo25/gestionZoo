package zoo.application;

import zoo.animal.*;
import zoo.gestion.visiteur.Visiteur;
import zoo.gestion.*;
import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Enclos> enclos;
    private List<Soigneur> soigneurs;
    private List<Visiteur> visiteurs;
    private double caisse;

    public Zoo() {
        this.enclos = new ArrayList<>();
        this.soigneurs = new ArrayList<>();
        this.visiteurs = new ArrayList<>();
        this.caisse = 0.0;
    }

    public void ajouterEnclos(Enclos enclos) {
        this.enclos.add(enclos);
    }

    public void ajouterSoigneur(Soigneur soigneur) {
        this.soigneurs.add(soigneur);
    }

    public void accueillirVisiteur(Visiteur visiteur) {
        this.visiteurs.add(visiteur);
        this.caisse += visiteur.getTarif();
        System.out.println("Bienvenue à " + visiteur.getNom() + " ! Tarif : " + visiteur.getTarif() + "€");
    }

    public void organiserSpectacle(Soigneur soigneur, Animal animal) {
        if (!soigneur.getEstOccupe()) {
            System.out.println("\n=== Début du spectacle ===");
            System.out.println(soigneur.getNom() + " présente " + animal.getNom());
            animal.faireSpectacle();
            for (Visiteur visiteur : visiteurs) {
                visiteur.reagir();
            }
            System.out.println("=== Fin du spectacle ===\n");
        } else {
            System.out.println(soigneur.getNom() + " est occupé et ne peut pas présenter de spectacle.");
        }
    }

    public double getCaisse() {
        return caisse;
    }
}