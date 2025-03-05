package zoo.gestion.visiteur;

public class Enfant extends Visiteur {
    private static final double TARIF_ENFANT = 12.0;

    public Enfant(String nom, int age) {
        super(nom, age);
        if (age >= 16) {
            throw new IllegalArgumentException("Un enfant doit avoir moins de 16 ans");
        }
    }

    @Override
    public double getTarif() {
        return TARIF_ENFANT;
    }

    @Override
    public void reagir() {
        String[] reactionsEnfant = {
                "Trop cool !",
                "Génial !",
                "Super !",
                "Waouh !"
        };
        System.out.println(getNom() + " : " + reactionsEnfant[(int)(Math.random() * reactionsEnfant.length)]);
    }
}