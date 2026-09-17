public class OOPs {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Student s1 = new Student("abc",19,10001,"xyz");
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.id);
        System.out.println(s1.college);
        s1.markAttendance();
        Student s2 = new Student();
        s2.name = "def";
        s2.age = 20;
        s2.id = 10002;
        s2.college = "uvw";
        System.out.println(s2.name);
        System.out.println(s2.age);
        System.out.println(s2.id);
        System.out.println(s2.college);
        Student s3 = new Student("s3",19);
        System.out.println(s3.name);
        s3.markAttendance();

    }
}
class Student {
    String name;
    int age;
    int id;
    String college;
    void markAttendance() {
        System.out.println("Attendance marked for " + name);
    }
    //Constructor1
    Student() {
        //default constructor
    }
    // Constructor2
    Student(String name,int age,int id,String college) {
        this.name=name;
        this.age=age;
        this.id=id;
        this.college=college;
    }

    //Constructor3
    Student(String name,int age) {
        this(name,age,1,"ghi");
 
    }
}