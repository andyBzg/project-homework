
public class Main {
    public static void main(String[] args) {

        PensionFund statePension = new PensionFund("Government", true, "12.01.1976");
        PensionFund nonStatePension = new PensionFund("New-York lions bank", false, "12.01.1976");

        System.out.println(statePension.calculatePension(40, 1300, 2800));
        System.out.println(nonStatePension.calculatePension(40, 1300, 2800));

        Worker worker = new Worker("Vasya", 40, 175, 86);
        worker.die();

        Pensioner pensioner = new Pensioner("Petya", 85, 175, 75);
        pensioner.setPension(864.56);
        pensioner.die();

    }
}