import java.util.Objects;

public class PensionFund {

    private static final double PENSION_RATIO = 0.02;
    private static final int AVERAGE_PENSION_IN_THE_COUNTRY = 1500;

    private String name;
    private boolean isStatePension;
    private final String openingDate;


    public PensionFund(String name, boolean isStatePension, String openingDate) {
        this.name = name;
        this.isStatePension = isStatePension;
        this.openingDate = openingDate;
    }


    public double calculatePension(int experience, double minSalary, double maxSalary) {

        double pension;
        if (isStatePension) {
            pension = AverageUtils.findAverageOfTwoNumbers(minSalary, maxSalary);
            System.out.print("В государственном фонде ваша пенсия составит: ");
        } else {
            pension = AverageUtils.findAverageOfThreeNumbers(minSalary, maxSalary, AVERAGE_PENSION_IN_THE_COUNTRY);
            System.out.print("В не-государственном фонде ваша пенсия составит: ");
        }
        pension *= (PENSION_RATIO * experience);
        return pension;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PensionFund that = (PensionFund) o;

        if (isStatePension != that.isStatePension) return false;
        if (!Objects.equals(name, that.name)) return false;
        return Objects.equals(openingDate, that.openingDate);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (isStatePension ? 1 : 0);
        result = 31 * result + (openingDate != null ? openingDate.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PensionFund{" +
                "name='" + name + '\'' +
                ", isStatePension=" + isStatePension +
                ", OpeningYear=" + openingDate +
                '}';
    }


}
