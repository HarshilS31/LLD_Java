class simpleAssociation {
    public static void main(String[] args) {
        Student s1=new Student("John");
        Teacher t1=new Teacher();
        t1.teach(s1);

    }
}
class Student {
    String name;
    Student(String name) {
        this.name=name;
    }
}
class Teacher {
    void teach(Student s1) {
        System.out.println("Teaching Student :"+s1.name);
    }

}