package has_a_relationship.composition;

import java.io.Serializable;

public class Engine implements Serializable {
    private String type;
    private int cc;
    private int torque;

    public Engine () {}

    public Engine(String type, int cc, int torque) {
        this.type = type;
        this.cc = cc;
        this.torque = torque;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public int getTorque() {
        return torque;
    }

    public void setTorque(int torque) {
        this.torque = torque;
    }

    public void display(){
        System.out.println("type : " + getType());
        System.out.println("cc :" + getCc());
        System.out.println("torque is : " + getTorque());
    }
}
