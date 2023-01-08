public class Pensioner extends Person {

    private double pension;


    public Pensioner(String name, int age, int height, int weight) {
        super(name, age, height, weight);
    }


    public double getPension() {
        return pension;
    }

    public void setPension(double pension) {
        this.pension = pension;
    }

    @Override
    public void die() {
        double moneyEarned;
        int age = getAge();
        moneyEarned = (age - 50) * pension;
        System.out.println("Этот пенсионер умер, он заработал: " + moneyEarned + " €$");
    }
}
