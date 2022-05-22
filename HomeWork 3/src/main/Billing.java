package main;

class Billing{
     static public double totalIncome =0;
    private Patient patient;
    private Doctor doctor;
    private double amountDue;
    public Patient getPatient() {
        return patient;
    }
    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    public Doctor getDoctor() {
        return doctor;
    }
    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
    public double getAmountDue() {
        return amountDue;
    }
    public void setAmountDue(double amountDue) {
        this.amountDue = amountDue;
    }
    public Billing(Patient patient, Doctor doctor, double amountDue) {
        super();
        this.patient = patient;
        this.doctor = doctor;
        this.amountDue = amountDue;
        setTotalIncome(amountDue);
    }


    public static double getTotalIncome() {
        return totalIncome;
    }
    public static void setTotalIncome(double totalIncome) {
        Billing.totalIncome += totalIncome;
    }
    @Override
    public String toString() {
        return "Billing [patient=" + patient + ", doctor=" + doctor + ", amount_due=" + amountDue + "]";
    }

}

