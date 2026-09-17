class aggregation {
    public static void main(String[] args) {
        Professor p1 = new Professor("James");
        Department CS = new Department(p1);
        

        
    }

}
class Professor {
    String name;
    Professor(String name) {
        this.name = name;
    }
}
class Department {
    private Professor prof;
    Department(Professor prof) {
        this.prof = prof;
    }

}
    

