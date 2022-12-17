public class Main {
    public static void main(String[] args) {

//        Person father = new Person("Vasya", 36, 182, 75.6);
//        Person mother = new Person("Akulina", 31, 164, 54.5);
//        Person kid = new Person("Maloy", 5, 120, 25.6);
//        Person grandfather = new Person("Ded", 79, 171, 80.1);
//        Person postman = new Person();

        PensionFund fathersPension = new PensionFund("Father", true, 1976);
        PensionFund mothersPension = new PensionFund("Mother", false, 1976);

//        PensionFund.setCurrentYear(2030);

        fathersPension.findEstimatedPension(1135, 2378);
        mothersPension.findEstimatedPension(1135, 2378);



    }
}