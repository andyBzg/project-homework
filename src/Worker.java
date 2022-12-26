public class Worker extends Person {

    private double minSalary;
    private double maxSalary;


    public Worker(String name, int age, int height, int weight) {
        super(name, age, height, weight);
    }


    public double getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(double minSalary) {
        this.minSalary = minSalary;
    }

    public double getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(double maxSalary) {
        this.maxSalary = maxSalary;
    }


    @Override
    public void die() {
        System.out.println("Этот человек не дожил до пенсии");
    }
}
