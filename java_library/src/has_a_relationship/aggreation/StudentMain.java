package has_a_relationship.aggreation;

public class StudentMain {
    public static void main(String[] args) {
        Student s = new Student("tony","1234",1234567890,"new york");
        s.buyBook(new Book("classmate",136,500));
        s.studentDetails();
    }
}
