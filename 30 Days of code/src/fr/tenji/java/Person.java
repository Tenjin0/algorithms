package fr.tenji.java;

/**
 * Created by nekran on 05/10/16.
 */
public class Person {
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private String firstName;
    private String lastName;
    private int identification;

    public Person(String firstName, String lastName, int identification) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.identification = identification;
    }
    public void printPerson() {
        System.out.println("Name " + lastName + ", " + firstName + "\nID" + identification);
    }
    public Person(int initialAge) {
        if (initialAge < 0) {
            this.age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        } else {
            this.age = initialAge;
        }
        // Add some more code to run some checks on initialAge
    }

    public void amIOld() {
        if (this.age < 13) {
            System.out.println("You are young.");
        } else if (this.age < 18) {
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are old.");
        }
    }

    public void yearPasses() {
        // Increment this person's age.
        this.age++;
    }
}
