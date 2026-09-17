class areas {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(7,8);
        Circle c1 = new Circle(1/3.14);
        System.out.println(r1.findArea());
        System.out.println(c1.findArea());
    }
}
interface Shape {
    double findArea();

}
class Rectangle implements Shape {
    double length;
    double width;
    Rectangle(double length,double width) {
        this.length=length;
        this.width=width;
    }
    @Override
    public double findArea() {
        return length*width;
    }
}
class Circle implements Shape {
    double radius;
    Circle(double radius) {
        this.radius=radius;

    }
    @Override
    public double findArea() {
        return 3.14*radius*radius;
    }
}