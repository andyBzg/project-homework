package classes;

import java.util.Map;
import java.util.Objects;

public class Company implements Comparable<Company> {

    private String name;
    private Map<String, String> holidays;


    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, String> getHolidays() {
        return holidays;
    }

    public void setHolidays(Map<String, String> holidays) {
        this.holidays = holidays;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Company company = (Company) o;

        if (!Objects.equals(name, company.name)) return false;
        return Objects.equals(holidays, company.holidays);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (holidays != null ? holidays.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", holidays=" + holidays +
                '}';
    }

    @Override
    public int compareTo(Company o) {
        if (name.length() > o.getName().length()) {
            return 1;
        }
        else if (name.length() < o.getName().length()) {
            return -1;
        }
        else
            return 0;
        //0 - два объекта равны
        //<0, тогда наш изначальный объект "меньше"
        //>0, тогда наш изначальный объект "больше"
    }
}
