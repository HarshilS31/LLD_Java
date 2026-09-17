class example {
    public static void main(String[] args) {
        Lamborghini huracan = new Lamborghini();
        Buggati veyron = new Buggati();
        huracan.drive();
        veyron.drive();

        
    }
}
class Car {
    void drive() {
        System.out.println("The car has started");
    }
}
class Lamborghini extends Car {
    @Override 
    void drive() {
        System.out.println("Lambo is flying!");
    }
}
class Buggati extends Car {
    @Override 
    void drive() {
        System.out.println("Buggati is cruising!");
    }
}

