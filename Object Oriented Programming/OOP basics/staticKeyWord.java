public class staticKeyWord {
    public static void main(String[] args) {
        Student s1 = new  Student("abc",1,"CSE");
        System.out.println(Student.college);
        System.out.println(s1.name);
        System.out.println(s1.rollNo);
        System.out.println(s1.course);

    }
}
class Student {
    String name;
    int rollNo;
    String course;
    static String college = "IIT B";

    Student(String name,int rollNo,String course) {
        this.name=name;
        this.rollNo=rollNo;
        this.course=course;

    }
    Student() {

    }

    

}