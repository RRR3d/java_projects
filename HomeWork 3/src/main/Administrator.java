package main;


import java.util.Scanner;

public class Administrator
{
    private String title;
    private String responsibility;
    private String supervisor;

    public Administrator()
    {
        super();
        this.title = "";
        this.responsibility = "";
        this.supervisor = "";
    }

    public Administrator(String name, double salary,
                         String title, String responsibility, String supervisor)
    {

        this.title = title;
        this.responsibility = responsibility;
        this.supervisor = supervisor;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getResponsibility()
    {
        return responsibility;
    }

    public void setResponsibility(String responsibility)
    {
        this.responsibility = responsibility;
    }

    public String getSupervisor()
    {
        return supervisor;
    }

    public void setSupervisor(String supervisor)
    {
        this.supervisor = supervisor;
    }

    public void readData()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the name of administrator: ");
        String name = input.nextLine();

        System.out.print("Enter the salary of administrator: ");
        double salary = Double.parseDouble(input.nextLine());

        System.out.print("Enter valid month of hire date: ");
        int month = Integer.parseInt(input.nextLine());

        System.out.print("Enter valid day of hire date: ");
        int day = Integer.parseInt(input.nextLine());

        System.out.print("Enter valid year of hire date: ");
        int year = Integer.parseInt(input.nextLine());

        System.out.println("Salary is: " +salary  + " " + "Date is " + month + day + year);

        System.out.print("Enter title of administrator: ");
        title = input.nextLine();

        System.out.print("Enter responsibility of administrator: ");
        responsibility = input.nextLine();

        System.out.print("Enter supervisor for administrator: ");
        supervisor = input.nextLine();
        System.out.println("Title is: " + title + " Responsibilty is " + responsibility + " Superisor" + supervisor);

    }

    public boolean equals(Administrator other)
    {
        return super.equals(other) &&(title.equals(other.title)
                && responsibility.equals(other.responsibility)
                && supervisor.equals(other.supervisor));
    }

    public String toString()
    {
        return super.toString() + "\n" + title + ", "
                + responsibility + ", supervised by " + supervisor;
    }
}


/*
    public Administrator(String Director , String Accounting , String adminName){
        this.Accounting = Accounting;
        this.adminName = adminName;
        this.Dirictor = Director;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getDirictor() {
        return Dirictor;
    }

    public void setDirictor(String dirictor) {
        Dirictor = dirictor;
    }

    public String getAccounting() {
        return Accounting;
    }

    public void setAccounting(String accounting) {
        Accounting = accounting;
    }
}
*/