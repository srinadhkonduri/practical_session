package has_a_relationship.aggreation;

import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private String rollNo;
    private long mobileNo;
    private String address;

    public Book b;

    public Student () {}

    public Student(String name, String rollNo, long mobileNo, String address) {
        this.name = name;
        this.rollNo = rollNo;
        this.mobileNo = mobileNo;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public long getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(long mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    // helper method
    public void buyBook(Book b){
        if (this.b == null){
            this.b = b;
            System.out.println("book purchased successfully");
        }
        else {
            System.out.println("no need book ...");
        }
    }

    public void studentDetails(){
        System.out.println("name is : " + getName());
        System.out.println("roll no : " + getRollNo());
        System.out.println("mobile no : " + getMobileNo());
        System.out.println("address : " + getAddress());
        if (b != null){
            b.display();
        }
        else {
            System.out.println();
        }
    }
}
