import java.util.Scanner;

class HealthProfile {
    private String firstName;
    private String lastName;
    private String DOB;
    private int yearOfBirth;
    private int monthOfBirth;
    private int dayOfBirth;
    private char gender;
    private int height;
    private double weight;


    HealthProfile(String firstName, String lastName, int yearOfBirth, int monthOfBirth, int dayOfBirth, char gender, int height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.dayOfBirth = dayOfBirth;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        DOB = Integer.toString(dayOfBirth) + Integer.toString(monthOfBirth) + Integer.toString(yearOfBirth);
    }


    // getters
    public String getFirstName() {
        return firstName;
    }

    public String getlastName() {
        return lastName;
    }

    public char getGender() {
        return gender;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getDOB() {
        return DOB;
    }

    public int getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    // Setters

    public void setFirstName(String name) {
       firstName = name;
    }

    public void setlastName(String name) {
        lastName = name;
    }

    public void setGender(char g) {
       gender = g;
    }

    public void setDayOfBirth(int day) {
        dayOfBirth = day;
    }

    public void setMonthOfBirth(int month) {
        monthOfBirth = month;
    }

    public void setYearOfBirth(int year) {
        yearOfBirth = year;
    }

    public void setDOB(String newDOB) {
        DOB = newDOB;
    }

    public void setHeight(int newHeight) {
        height = newHeight;
    }

    public void setWeight(double newWeight) {
        weight = newWeight;
    }

    // methods
    public int UserAge() {
        return 2026-yearOfBirth;
    }

    public double maxHeartRate() {
       return 220 - UserAge();
    }

    public String targetHeartRate() {
        // low limit
        double low = maxHeartRate() * 0.50;
        double high = maxHeartRate() * 0.80;
        return Double.toString(low) + " - " + Double.toString(high);
    }  

    public double BMI() {
        return (weight * 703) / height;
    }

}

public class Task1 {
    public static void main(String[] a) {

       Scanner input = new Scanner(System.in);
       System.out.print("Type in your first name: ");
       String firstName = input.next();
        

       System.out.print("Type in your last name: ");
       String lastName = input.next();

       System.out.print("Type in your gender: ");
       char gender = input.next().trim().charAt(0);

       System.out.print("Type in your day of birth: ");
       int dayBirth = input.nextInt();


       System.out.print("Type in your month of birth: ");
       int monthBirth = input.nextInt();


       System.out.print("Type in your year of birth: ");
       int yearBirth = input.nextInt();


       System.out.print("Type in your height in inches: ");
       int height = input.nextInt();


       System.out.print("Type in your weight in lbs: ");
       double weight = input.nextDouble();

       // object creation

       HealthProfile p1 = new HealthProfile(firstName, lastName, dayBirth, dayBirth, dayBirth, gender, height, weight);

       //using getters
        System.out.println("--------------------- BEFORE SETTERS ---------------------");

       System.out.println("First name: " + p1.getFirstName());
       System.out.println("Last name: " + p1.getlastName());
       System.out.println("Gender: " + p1.getGender());
       System.out.println("Day of birth: " + p1.getDayOfBirth());
       System.out.println("Month of birth: " + p1.getMonthOfBirth());
       System.out.println("Year of birth: " + p1.getYearOfBirth());
       System.out.println("Height: " + p1.getHeight());
       System.out.println("Weight: " + p1.getWeight());
       System.out.println("");
       
       
       // using setters

       p1.setFirstName("Mustafa");
       p1.setlastName("Ali");
       p1.setHeight(72);
       p1.setWeight(165.437);
       p1.setGender('M');
       p1.setDayOfBirth(15);
       p1.setMonthOfBirth(3);
       p1.setYearOfBirth(2007);
       p1.setDOB("15/03/2007");
       
       // verifying changes
       System.out.println("--------------------- AFTER SETTERS ---------------------");

       System.out.println("First name: " + p1.getFirstName());
       System.out.println("Last name: " + p1.getlastName());
       System.out.println("Gender: " + p1.getGender());
       System.out.println("Day of birth: " + p1.getDayOfBirth());
       System.out.println("Month of birth: " + p1.getMonthOfBirth());
       System.out.println("Year of birth: " + p1.getYearOfBirth());
       System.out.println("Height: " + p1.getHeight());
       System.out.println("Weight: " + p1.getWeight());
       
        // using methods

        double BMI = p1.BMI();
        int age = p1.UserAge();
        String targetHeartRate = p1.targetHeartRate();
        double maxHeartRate = p1.maxHeartRate();

        // printing them
        System.out.println("--------------------- METHODS ---------------------");
        System.out.println("BMI: " + BMI);
        System.out.println("Age: " + age);
        System.out.println("Target Heart Rate: " + targetHeartRate);
        System.out.println("Max Heart Rate: " + maxHeartRate);
        
    }
}