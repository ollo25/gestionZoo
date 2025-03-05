package zoo.gestion.visiteur;

public abstract class Visiteur {
    private String nom;
    private int age;

    public Visiteur(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public int getAge() {
        return age;
    }

    public void reagir() {
        String[] reactions = {
                "Wow, c'est impressionnant !",
                "Incroyable !",
                "Magnifique !",
                "Fantastique !"
        };
        System.out.println(nom + " : " + reactions[(int)(Math.random() * reactions.length)]);
    }

    public abstract double getTarif();

}