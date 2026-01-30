class Person {
    String name;

    void displayName() {
        System.out.println("Name: " + name);
    }
}

class Student extends Person {
    int rollNo;

    void displayRollNo() {
        System.out.println("Roll No: " + rollNo);
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Karthika";
        s.rollNo = 101;

        s.displayName();
        s.displayRollNo();
    }
}
