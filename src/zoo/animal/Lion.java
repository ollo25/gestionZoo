package zoo.animal;

public class Lion extends Animal {
    public Lion(String nom, int age, double poids) {
        super(nom, age, poids);
    }

    @Override
    public void faireDuBruit() {
        System.out.println("Le lion " + getNom() + " rugit !");
    }

    @Override
    public void seDeplacer() {
        System.out.println("Le lion " + getNom() + " se déplace majestueusement.");
    }

    @Override
    public void manger() {
        System.out.println("Le lion " + getNom() + " mange de la viande.");
    }

    @Override
    public void faireSpectacle() {
        System.out.println("Le lion " + getNom() + " saute à travers un cerceau enflammé !");
    }
}