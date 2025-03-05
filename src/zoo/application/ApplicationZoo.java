package zoo.application;

import zoo.animal.*;
import zoo.gestion.*;
import zoo.gestion.visiteur.*;

public class ApplicationZoo {
    public static void main(String[] args) {
        System.out.println("--- Création du Zoo ---");
        Zoo zoo = new Zoo();

        System.out.println("--- Création des enclos ---");
        Enclos enclosLions = new Enclos("Territoire des Lions", 3);
        Enclos enclosOiseaux = new Enclos("Volière", 5);
        Enclos enclosSerpents = new Enclos("Terrarium", 4);

        System.out.println("--- Ajout des enclos dans le Zoo ---");
        zoo.ajouterEnclos(enclosLions);
        zoo.ajouterEnclos(enclosOiseaux);
        zoo.ajouterEnclos(enclosSerpents);

        // Noms d'animaux demandé à ChatGPT par manque d'inspiration //

        System.out.println("\n--- Création des animaux ---");
        Lion simba = new Lion("Simba", 5, 180.0);
        Lion nala = new Lion("Nala", 4, 160.0);
        Oiseau rio = new Oiseau("Rio", 2, 1.5, 0.8);
        Oiseau blu = new Oiseau("Blu", 3, 1.2, 0.7);
        Serpent kaa = new Serpent("Kaa", 3, 5.0, false);
        Serpent nagini = new Serpent("Nagini", 4, 4.5, true);

        System.out.println("\n--- Placement des animaux dans les enclos ---");
        enclosLions.ajouterAnimal(simba);
        enclosLions.ajouterAnimal(nala);
        enclosOiseaux.ajouterAnimal(rio);
        enclosOiseaux.ajouterAnimal(blu);
        enclosSerpents.ajouterAnimal(kaa);
        enclosSerpents.ajouterAnimal(nagini);

        System.out.println("\n--- Recrutements des soigneurs (avec spécialités) ---");
        Soigneur sebastien = new Soigneur("Sebastien", "Félins");
        Soigneur tristan = new Soigneur("Tristan", "Oiseaux");
        Soigneur leo = new Soigneur("Leo", "Reptiles");

        zoo.ajouterSoigneur(sebastien);
        zoo.ajouterSoigneur(tristan);
        zoo.ajouterSoigneur(leo);

        System.out.println("\n--- Simulation d'une journée au Zoo ---\n");

        System.out.println("--- Arrivée des visiteurs ---");
        Adulte thomas = new Adulte("Thomas", 30);
        Adulte marie = new Adulte("Marie", 25);
        Enfant sophie = new Enfant("Sophie", 12);
        Enfant lucas = new Enfant("Lucas", 8);

        zoo.accueillirVisiteur(thomas);
        zoo.accueillirVisiteur(marie);
        zoo.accueillirVisiteur(sophie);
        zoo.accueillirVisiteur(lucas);
        System.out.println("Recettes de la journée : " + zoo.getCaisse() + "€\n");

        System.out.println("--- Routine matinale des soigneurs ---");
        System.out.println("--- Marc diagnostique "+simba.getNom()+"---");
        sebastien.diagnostiquer(simba);
        sebastien.soigner(simba);
        tristan.diagnostiquer(rio);
        leo.diagnostiquer(kaa);

        System.out.println("\n--- Nettoyage des enclos ---");
        enclosLions.nouveauJour();
        enclosOiseaux.nouveauJour();
        enclosSerpents.nouveauJour();

        sebastien.nettoyerEnclos(enclosLions);
        tristan.nettoyerEnclos(enclosOiseaux);

        System.out.println("\n--- Comportements naturels des animaux ---");
        simba.faireDuBruit();
        nala.seDeplacer();
        rio.faireDuBruit();
        blu.manger();
        kaa.seDeplacer();
        nagini.faireDuBruit();

        System.out.println("\n--- Spectacles du Zoo ---");
        zoo.organiserSpectacle(sebastien, simba);
        System.out.println();
        zoo.organiserSpectacle(tristan, rio);
        System.out.println();
        zoo.organiserSpectacle(leo, kaa);

        System.out.println("\n--- Tentative de spectacle avec un soigneur occupé ---");
        zoo.organiserSpectacle(sebastien, nala);

        System.out.println("\n--- Fin de journée et bilan ---");
        System.out.println("Recette totale : " + zoo.getCaisse() + "€");
        System.out.println("\n--- Fin de la simulation (journée type) ---");
    }
}