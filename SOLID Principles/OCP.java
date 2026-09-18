import java.util.ArrayList;
import java.util.List;

class Product {
    private final String name;
    private final double price; 
    
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public double getPrice() { return price; }
    public String getName() { return name; }
}

class ShoppingCart {
    private final List<Product> products = new ArrayList<>();
    
    public void addProduct(Product p) { products.add(p); }
    public List<Product> getProducts() { return new ArrayList<>(products); }
}

interface DiscountStrategy {
    double applyDiscount(double subtotal);
}

class NoDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double subtotal) {
        return subtotal;
    }
}

class BlackFridayDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double subtotal) {
        return subtotal * 0.70; // 30% off
    }
}


class CheckoutEngine {

    public double calculateFinalTotal(ShoppingCart cart, DiscountStrategy discount) {
        double subtotal = cart.getProducts().stream()
                              .mapToDouble(Product::getPrice)
                              .sum();
        return discount.applyDiscount(subtotal);
    }
}

class InvoicePrinter {
    public void printInvoice(ShoppingCart cart, CheckoutEngine engine, DiscountStrategy activeDiscount) {
        System.out.println("--- Checkout Invoice ---");
        for (Product p : cart.getProducts()) {
            System.out.println(p.getName() + " : $" + p.getPrice());
        }
        double finalPrice = engine.calculateFinalTotal(cart, activeDiscount);
        System.out.println("Total Amount Due: $" + finalPrice);
        System.out.println("------------------------\n");
    }
}

class OCP {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(new Product("Mechanical Keyboard", 150.0));
        cart.addProduct(new Product("Ergonomic Mouse", 80.0));
        CheckoutEngine checkout = new CheckoutEngine();
        InvoicePrinter printer = new InvoicePrinter();
        System.out.println("Normal Day:");
        printer.printInvoice(cart, checkout, new NoDiscount());
        System.out.println("Black Friday Sale:");
        printer.printInvoice(cart, checkout, new BlackFridayDiscount());
    }
}