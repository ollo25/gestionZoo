package zoo.animal.lion;

import zoo.animal.Animal;

public class Lion extends Animal {
    public Lion(String name, int age, int gender) {
        super(name, age, gender);
    }
    public void seDeplacer() {}

    @Override
    public void manger() {
        System.out.println("Il mange bien chacal");
    }

    @Override
    public void faireBruit() {
        System.out.println("Rrrrrrr");
    }
}
