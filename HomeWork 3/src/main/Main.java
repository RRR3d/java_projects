package main;

public class Main {

    public static void main(String[] args) {

        Administrator admin = new Administrator();

        Administrator admin1 = new Administrator();
        Administrator admin2 = new Administrator();

        admin1.readData();
        admin2.readData();

        System.out.println("Administrator 1:");
        System.out.println(admin1);

        System.out.println("\nAdministrator 2:");
        System.out.println(admin2);



        Doctor d1 = new Doctor("d1","sp1");
        Doctor d2 = new Doctor("d2","sp2");

        Patient p1 = new Patient("p1",d1);
        Patient p2 = new Patient("p2",d2);
        Patient p3 = new Patient("p3",d1);

        System.out.println(p1.getName()+" "+p1.getDoctor1());

        Billing b1 = new Billing(p1,d1,5560);
        Billing b2 = new Billing(p1,d2,1000);
        Billing b3 = new Billing(p3,d2,1000);

        System.out.println(b1.getPatient());
        System.out.println(b1.getDoctor());
        System.out.println(b1.getAmountDue());
        b1.toString();
    }
}
