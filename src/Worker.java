public class Worker extends Person {

    private double minSalary;
    private double maxSalary;


    public Worker(String name, int age, int height, int weight) {
        super(name, age, height, weight);
    }


    @Override
    public void die() {
        System.out.println("Этот человек не дожил до пенсии");
    }
}
