package classes;

import java.util.*;

public class Worker extends Person implements AbleToCalculatePension {

    private static int MONEY_PER_CHILD = 200;
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

    public Worker(int age) {
        super(age);
    }

    public Worker(String name, int age, Sex sex) {
        super(name);
        super.setAge(age);
        this.sex = sex;
    }

    public Worker(int age, Sex sex) {
        super(age);
        this.sex = sex;
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
        if (previousJob == null) {
            previousJob = new ArrayList<>();
        }
        return previousJob;
    }

    public void setPreviousJob(List<Company> previousJob) {
        this.previousJob = previousJob;
    }

    public Set<PensionFund> getPensionFundSet() {
        if (pensionFundSet == null) {
            pensionFundSet = new HashSet<>();
        }
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
        int experience = getAge() - 18;
        double minSalaryIncreasedPerChild = minSalary + getChildren().size() * MONEY_PER_CHILD;
        double topPayment = 0;
        for (PensionFund fund : pensionFundSet) {
            double result = fund.calculatePensionPayment(experience, minSalaryIncreasedPerChild, maxSalary);
            if (result > topPayment) {
                topPayment = result;
            }
        }
        return topPayment;
    }

    public void showCompaniesPersonWorked() {
        System.out.println("Я работал в следующих компаниях: ");
        boolean start = true;
        for (Company company : previousJob) {
            if (start) {
                System.out.print(company.getName());
                start = false;
            } else {
                System.out.print(", " + company.getName());
            }
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
        return getName() + ", " + getAge() + ", " + getSex();
    }
}
