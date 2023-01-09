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
