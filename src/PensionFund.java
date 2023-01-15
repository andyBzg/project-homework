import java.util.Objects;

public class PensionFund {

    private static final double PENSION_RATIO = 0.02;
    private static final int AVERAGE_PENSION_IN_THE_COUNTRY = 1500;

    private String name;
    private FundType fundType;
    private final String openingDate;


    public PensionFund(String name, FundType fundType, String openingDate) {
        this.name = name;
        this.fundType = fundType;
        this.openingDate = openingDate;
    }


    public double calculatePensionPayment(int experience, double minSalary, double maxSalary) {

        double pension = 0.0;

        switch (fundType) {
            case STATE:
                pension = AverageUtils.findAverageOfNumbers(minSalary, maxSalary);
                break;
            case NON_STATE:
                pension = AverageUtils.findAverageOfNumbers(minSalary, maxSalary, AVERAGE_PENSION_IN_THE_COUNTRY);
                break;
            case SCAMMERS:
                System.out.println(fundType.getMessage() + " вас обокрали :(");
                return 0.0;
        }
        pension *= (PENSION_RATIO * experience);
        System.out.println(fundType.getMessage() + " фонде ваша пенсия составит: ");
        return pension;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PensionFund that = (PensionFund) o;

        if (!Objects.equals(name, that.name)) return false;
        if (fundType != that.fundType) return false;
        return Objects.equals(openingDate, that.openingDate);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (fundType != null ? fundType.hashCode() : 0);
        result = 31 * result + (openingDate != null ? openingDate.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PensionFund{" +
                "name='" + name + '\'' +
                ", fundType=" + fundType +
                ", openingDate='" + openingDate + '\'' +
                '}';
    }

}
