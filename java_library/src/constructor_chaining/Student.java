package constructor_chaining;

public class Student {
    String name;
    int age;

    // No-arg constructor
    Student() {
        this("Unknown", 0);  // Calls parameterized constructor
        System.out.println("No-arg constructor called");
    }

    // One-arg constructor
    Student(String name) {
        this(name, 18);  // Calls two-arg constructor
        System.out.println("One-arg constructor called");
    }

    // Two-arg constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Two-arg constructor called");
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // Main method
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();

        System.out.println();

        Student s2 = new Student("Alice");
        s2.display();

        System.out.println();

        Student s3 = new Student("Bob", 22);
        s3.display();
    }
}
