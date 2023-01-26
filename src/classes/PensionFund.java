package classes;

import java.util.List;
import java.util.Objects;

public class PensionFund {

    private static final double PENSION_RATIO = 0.02;
    private static final int AVERAGE_PENSION_IN_THE_COUNTRY = 1500;

    private String name;
    private FundType fundType;
    private final String openingDate;
    private List<String> currencies;


    public List<String> getCurrencies() {
        return currencies;
    }

    public void setCurrencies(List<String> currencies) {
        this.currencies = currencies;
    }

    public PensionFund(String name, FundType fundType, String openingDate) {
        this.name = name;
        this.fundType = fundType;
        this.openingDate = openingDate;
    }


    public double calculatePensionPayment(int experience, double minSalary, double maxSalary) {

        double pension;

        switch (fundType) {
            case STATE:
                pension = AverageUtils.findAverageOfNumbers(minSalary, maxSalary);
                break;
            case NON_STATE:
                pension = AverageUtils.findAverageOfNumbers(minSalary, maxSalary, AVERAGE_PENSION_IN_THE_COUNTRY);
                break;
            case SCAMMERS:
                return 0.0;
            default:
                pension = 0.0;
        }
        pension *= (PENSION_RATIO * experience);
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
        return "classes.PensionFund{" +
                "name='" + name + '\'' +
                ", fundType=" + fundType +
                ", openingDate='" + openingDate + '\'' +
                '}';
    }

}
