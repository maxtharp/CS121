package activity31;

import java.util.LinkedList;

public class Student {
    private String firstName;
    private String lastName;
    private String id;
    private String major;
    private String classStanding;
    private double gpa;
    private LinkedList<String> courseList;

    public Student(String firstName, String lastName, String id, String major, String classStanding, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.major = major;
        this.classStanding = classStanding;
        this.gpa = gpa;
        this.courseList = new LinkedList<String>();
    }

    public void addCourse(String courseName) {
        courseList.add(courseName);
    }

    public void removeCourse(String courseName) {
        courseList.remove(courseName);
    }

    public String getStudentInfo() {
        return "Name: " + firstName + " " + lastName + "\n" +
                "ID: " + id + "\n" +
                "Major: " + major + "\n" +
                "Class Standing: " + classStanding + "\n" +
                "GPA: " + gpa;
    }

    public void displayStudentCourses() {
        for (String courseName : courseList) {
            System.out.println(courseName);
        }
    }
}

