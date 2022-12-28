public abstract class Person {

    private String name;
    private int age;
    private int height;
    private int weight;


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
        if (name.length() >= 2) {
            this.name = name;
        }
        else {
            System.err.println("Error. Name is too short");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age < 110) {
            this.age = age;
        }
        else {
            System.err.println("Incorrect age");
        }
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height > 40) {
            this.height = height;
        } else {
            System.err.println("Error. Person is too short");
        }
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight > 45) {
            this.weight = weight;
        } else {
            System.err.println("Error. Weight is too low");
        }
    }


    public abstract void die();


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


}
