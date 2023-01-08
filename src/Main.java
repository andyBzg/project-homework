
public class Main {
    public static void main(String[] args) {

        Worker worker = new Worker("Vasya", 49, 175, 86);
        worker.setMinSalary(1300);
        worker.setMaxSalary(2800);
        double workersPension;
        workersPension = worker.calculatePension();
        System.out.println(workersPension);

    }
}