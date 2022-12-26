import java.util.Objects;

public class PensionFund {

    private static final double PENSION_RATIO = 0.02; //коэффициент пенсионного фонда
    private static int currentYear = 2022;
    private static final int AVERAGE_PENSION_IN_THE_COUNTRY = 1500;

    private String name;
    private boolean isStatePension;
    private final int openingYear;

    public PensionFund(String name, boolean isStatePension, int openingYear) {
        this.name = name;
        this.isStatePension = isStatePension;
        this.openingYear = openingYear;
    }

    public static void setCurrentYear(int newYear) {
        if (newYear < currentYear) {
            System.err.println("Please set correct year");
        } else {
            PensionFund.currentYear = newYear;
        }

    }

    public void findEstimatedPension(double lowestSalary, double highestSalary) {
        double estimatedPension = calculatePension(lowestSalary, highestSalary);
        System.out.println(estimatedPension + " €$");
    }

    private double calculatePension(double lowestSalary, double highestSalary) {

        double pension;
        if (isStatePension) {
            pension = AverageUtils.findAverageOfTwoNumbers(lowestSalary, highestSalary);
            System.out.print("В государственном фонде ваша пенсия составит: ");
        } else {
            pension = AverageUtils.findAverageOfThreeNumbers(lowestSalary, highestSalary, AVERAGE_PENSION_IN_THE_COUNTRY);
            System.out.print("В не-государственном фонде ваша пенсия составит: ");
        }
        int experience = currentYear - openingYear;
        pension *= (PENSION_RATIO * experience);
        return pension;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PensionFund that = (PensionFund) o;

        if (isStatePension != that.isStatePension) return false;
        if (openingYear != that.openingYear) return false;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (isStatePension ? 1 : 0);
        result = 31 * result + openingYear;
        return result;
    }

    @Override
    public String toString() {
        return "PensionFund{" +
                "name='" + name + '\'' +
                ", isStatePension=" + isStatePension +
                ", fundOpeningYear=" + openingYear +
                '}';
    }


}
