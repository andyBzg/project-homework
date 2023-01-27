package classes;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Worker extends Person implements AbleToCalculatePension {

    private double minSalary;
    private double maxSalary;
    private Month month;
    private Sex sex;
    private List<Company> previousJob;
    private Set<PensionFund> pensionFundSet;

    public Worker(String name) {
        super(name);
    }

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

    public Month getMonth() {
        return month;
    }

    public void setMonth(Month month) {
        this.month = month;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public List<Company> getPreviousJob() {
        return previousJob;
    }

    public void setPreviousJob(List<Company> previousJob) {
        this.previousJob = previousJob;
    }

    public Set<PensionFund> getPensionFundSet() {
        return pensionFundSet;
    }

    public void setPensionFundSet(Set<PensionFund> pensionFundSet) {
        this.pensionFundSet = pensionFundSet;
    }

    public void setNewSalary() {
        double number = month.getNumber();
        minSalary *= number;
        maxSalary *= number;
    }

    @Override
    public void die() {
        System.out.println("Этот человек не дожил до пенсии");
    }

    @Override
    public double calculatePension() {
        String name = getName() + "'s Pension Fund";
        int experience = getAge() - 18;
        double minSalaryIncreasedPerChild = minSalary + getChildren().size() * 200;
        PensionFund pensionFund = new PensionFund(name, FundType.getRandomType(), "12.01.1976");
        return pensionFund.calculatePensionPayment(experience, minSalaryIncreasedPerChild, maxSalary);
    }

    public void showCompaniesPersonWorked() {
        System.out.println("Я работал в следующих компаниях:");
        for (Company company : previousJob) {
            System.out.println(company.getName());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Worker worker = (Worker) o;

        if (Double.compare(worker.minSalary, minSalary) != 0) return false;
        if (Double.compare(worker.maxSalary, maxSalary) != 0) return false;
        if (month != worker.month) return false;
        if (sex != worker.sex) return false;
        return Objects.equals(previousJob, worker.previousJob);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(minSalary);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(maxSalary);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (month != null ? month.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + (previousJob != null ? previousJob.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "minSalary=" + minSalary +
                ", maxSalary=" + maxSalary +
                ", month=" + month +
                ", sex=" + sex +
                ", job=" + previousJob +
                '}';
    }
}
