package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public String getName() {
        return name;
    }
    public void setName(String aName) {
        name = aName;
    }
    public int getId() {
        return studentId;
    }
    public void setId(int aId) {
        studentId = aId;
    }
    public int getCredits() {
        return numberOfCredits;
    }
    public void setCredits(int aCredit) {
        numberOfCredits = aCredit;
    }
    public double getGpa() {
        return gpa;
    }
    public void setGpa(double aGpa) {
        gpa = aGpa;
    }
}