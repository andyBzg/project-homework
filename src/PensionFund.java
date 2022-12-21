public class PensionFund {

    private static final double RATIO = 0.02; //коэффициент пенсионного фонда
    private static int currentYear = 2022;
    private static final int averagePensionInTheCountry = 1500;

    private String fundName;
    private boolean statePension;
    private final int fundOpeningYear;

    public PensionFund(String fundName, boolean isStatePension, int fundOpeningYear) {
        this.fundName = fundName;
        this.statePension = isStatePension;
        this.fundOpeningYear = fundOpeningYear;
    }

    public static void setCurrentYear(int currentYear) {
        PensionFund.currentYear = currentYear;
    }

    public void findEstimatedPension(int lowestSalary, int highestSalary) {
        int estimatedPension = calculatePension(lowestSalary, highestSalary);
        System.out.println(estimatedPension + " EURO");
    }

    private int calculatePension(int lowestSalary, int highestSalary) {

        int experience = currentYear - fundOpeningYear;

        if (statePension) {
            int result = AverageUtils.findAverageOfTwoNumbers(lowestSalary, highestSalary);
            result *= (RATIO * experience);
            System.out.print("При государственной пенсии в " + currentYear + " году ваша пенсия составит: ");
            return result;
        }
        else {
            int result = AverageUtils.findAverageOfThreeNumbers(lowestSalary, highestSalary, averagePensionInTheCountry);
            result *= (RATIO * experience);
            System.out.print("При не-государственной пенсии в " + currentYear + " году ваша пенсия составит: ");
            return result;
        }
    }


}
