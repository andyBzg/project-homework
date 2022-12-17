public class Person {

    private String name;
    private int age;
    private int height;
    private double weight;
    private int money;

    public Person(String name, int age, int height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public Person() {}

    public void info() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
        System.out.println(weight);
        System.out.println(money);
    }

    public void goToWork() {
        if (age < 18 || age > 70){
            System.out.println("отдыхаю дома");
        }
        else System.out.println("работаю");
    }

    public int getMoney() {
        return money;
    }

}
