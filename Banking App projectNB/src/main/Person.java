package main;

public class Person {

    // PERSON CLASS , I WILL ADD THE NEW USERS IN THIS CLASS
    private String Name;
    private double salary;
    private int ID;
    private boolean BankAgent;

    /**
     *
     * @param Name
     * @param salary
     * @param ID
     * @param BankAgent
     */
    public Person(String Name , double salary , int ID , boolean BankAgent){
        this.Name = Name;
        this.salary = salary;
        this.ID = ID;
        this.BankAgent = BankAgent;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public boolean isBankAgent() {
        return BankAgent;
    }

    public void setBankAgent(boolean bankAgent) {
        BankAgent = bankAgent;
    }
}
