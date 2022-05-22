package main;

class Patient extends Person
{
    private Doctor Doctor1;

    public Doctor getDoctor1() {
        return Doctor1;
    }

    public void setDoctor1(Doctor doctor1) {
        this.Doctor1 = doctor1;
    }

    @Override
    public String toString() {
        return "Patient [primary_physician=" + Doctor1 + ", getName()=" + getName() + ", toString()="
                + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
    }

    public Patient(String name, Doctor primary_physician) {
        super(name);
        this.Doctor1 = primary_physician;
    }

}