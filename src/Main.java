public class Main {
    public static void main(String[] args) {

        Worker worker = new Worker("Vasya", 63, 170, 86);
        worker.setMinSalary(1551);
        worker.setMaxSalary(2357);
        System.out.println(worker.calculatePension());


        PensionFund stateFund = new PensionFund("Government", FundType.STATE, "01.01.23");
        PensionFund nonStateFund = new PensionFund("Private", FundType.NON_STATE, "02.02.23");
        PensionFund fakeFund = new PensionFund("MMM", FundType.SCAMMERS, "03.03.23");
        System.out.println();

        double firstTest = stateFund.calculatePensionPayment(45, 1551, 2357);
        System.out.println(firstTest);

        double secondTest = nonStateFund.calculatePensionPayment(45, 1551, 2357);
        System.out.println(secondTest);

        double thirdTest = fakeFund.calculatePensionPayment(45, 1551, 2357);
        System.out.println(thirdTest);
    }
}