package main;

public class Student {
    // id, department, faculty and gpa
    private int id;
    private String department;
    private String faculty;
    private double gpa;

    public Student(int id, String department, String faculty, double gpa) {
        this.id = id;
        this.department = department;
        this.faculty = faculty;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", department=" + department + ", faculty=" + faculty + ", gpa=" + gpa + "]";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }




}
