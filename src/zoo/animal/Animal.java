package zoo.animal;

public abstract class Animal {
    private String nom;
    private int age;
    private boolean estMalade;
    private double poids;

    public Animal(String nom, int age, double poids) {
        this.nom = nom;
        this.age = age;
        this.poids = poids;
        this.estMalade = false;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean getEstMalade() {
        return estMalade;
    }

    public void setEstMalade(boolean estMalade) {
        this.estMalade = estMalade;
    }

    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    public abstract void faireDuBruit();
    public abstract void seDeplacer();
    public abstract void manger();
    public abstract void faireSpectacle();


}