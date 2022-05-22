package main;

public class Vechicle {
    private String M_name;
    private int Cylinder;
    private String ownerName;

    public String getM_name() {
        return M_name;
    }

    public void setM_name(String m_name) {
        M_name = m_name;
    }

    public int getCylinder() {
        return Cylinder;
    }

    public void setCylinder(int cylinder) {
        Cylinder = cylinder;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Vechicle(String m_name, int cylinder, String ownerName) {
        M_name = m_name;
        Cylinder = cylinder;
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return "Vechicle{" +
                "M_name='" + M_name + '\'' +
                ", Cylinder=" + Cylinder +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }

    public Vechicle(){}

}

