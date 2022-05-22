package main;

class Doctor extends Person{

    private String specialization;

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public Doctor(String name, String specialization) {
        super(name);
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return "Doctor [specialization=" + specialization + ", getName()=" + getName() + ", toString()="
                + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
    }


}