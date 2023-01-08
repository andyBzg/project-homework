import java.util.Random;

public class Worker extends Person implements AbleToCalculatePension {

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

    @Override
    public double calculatePension() {
        Random random = new Random();
        boolean randomBoolean = random.nextBoolean();
        String name = getName() + "'s Pension Fund";
        int experience = getAge() - 18;
        PensionFund pensionFund = new PensionFund(name, randomBoolean, "12.01.1976");
        return pensionFund.calculatePension(experience, minSalary, maxSalary);
    }
}
