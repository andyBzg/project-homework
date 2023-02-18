package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Person implements Comparable<Person> {

    private String name;
    private int age;
    private int height;
    private int weight;
    private List<Child> children;


    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
            this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
            this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
            this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
            this.weight = weight;
    }

    public List<Child> getChildren() {
        if (children == null) {
            children = new ArrayList<>();
        }
        return children;
    }

    public void setChildren(List<Child> children) {
        this.children = children;
    }

    public abstract void die();

    public void showChildren() {
        System.out.println("У меня " + children.size() + " детей");
        for (Person child : children) {
            System.out.println(child.name);
        }
    }

    public void info() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
        System.out.println(weight);
    }

    public void goToWork() {
        if (age < 18 || age > 70) {
            System.out.println("отдыхаю дома");
        } else System.out.println("работаю");
    }

    @Override
    public int compareTo(Person o) {
        if (name.length() != o.name.length()) {
            return Integer.compare(name.length(), o.name.length());
        }
        else {
            return Integer.compare(age, o.age);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        if (height != person.height) return false;
        if (weight != person.weight) return false;
        if (!Objects.equals(name, person.name)) return false;
        return Objects.equals(children, person.children);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + height;
        result = 31 * result + weight;
        result = 31 * result + (children != null ? children.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "classes.Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", children=" + children +
                '}';
    }
}
