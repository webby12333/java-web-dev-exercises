package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits;
    private double gpa;

    public Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }
    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }

    public void addGrade(int courseCredits, double grade) {
        double currentQualityScore = gpa * numberOfCredits;
        double classScore = grade * courseCredits;
        double newQualityScore = currentQualityScore + classScore;
        numberOfCredits += courseCredits;
        gpa = newQualityScore / numberOfCredits;
    }

    public String getGradeLevel() {
        String gradeLevel = "";
        if (numberOfCredits < 29) {
            gradeLevel = "Freshman";
        } else if (numberOfCredits < 59) {
            gradeLevel = "Sophomore";
        } else if (numberOfCredits < 89) {
            gradeLevel = "Junior";
        } else if (numberOfCredits > 90) {
            gradeLevel = "Senior";
        }
        return gradeLevel;
    }

    /* getters and setters omitted */



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