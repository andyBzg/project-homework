package classes;

public class Child extends Person {
    public Child(String name) {
        super(name);
    }

    public Child(String name, int age, int height, int weight) {
        super(name, age, height, weight);
    }


    @Override
    public void die() {
        System.out.println("Ребенок умер");
    }

    @Override
    public String toString() {
        return "Pensioner{" +
                "name=" + getName() +
                '}';
    }
}
