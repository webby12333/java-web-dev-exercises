package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class Course {
    private String classYear;
    private ArrayList<String> subjects;
    private String studentName;

    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String aStudentName) {
        studentName= aStudentName;
    }
}
