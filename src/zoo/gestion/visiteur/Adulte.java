package zoo.gestion.visiteur;

public class Adulte extends Visiteur {
    private static final double TARIF_ADULTE = 20.0;

    public Adulte(String nom, int age) {
        super(nom, age);
        if (age < 16) {
            throw new IllegalArgumentException("Un adulte doit avoir au moins 16 ans");
        }
    }

    @Override
    public double getTarif() {
        return TARIF_ADULTE;
    }
}