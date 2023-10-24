public class VI_Overloading {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Amitesh");
        Student s3 = new Student(123);
        System.out.println(s2.name);
        System.out.println(s3.roll);
    }
}
class Student {
    String name;
    int roll;
    Student() {
        System.out.println("Constructor is called");
    }
    Student(String name) {
        this.name = name;
    }
    Student(int roll) {
        this.roll = roll;
    }
}
