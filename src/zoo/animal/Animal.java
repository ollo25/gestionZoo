package zoo.animal;

public abstract class Animal {
    private String name;
    private int age;
    private int gender;
    public Animal(String name, int age, int gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public abstract void manger();
    public abstract void faireBruit();
    public abstract void seDeplacer();
}
