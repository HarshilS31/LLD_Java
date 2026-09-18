import java.util.ArrayList;
import java.util.List;

class Product {
    String name;
    double price;
    String category;
    Product(String name,double price,String category) {
        this.name=name;
        this.price=price;
        this.category=category;
    }
}
class ShoppingCart {
    private List<Product> products  = new ArrayList<>();
    public void addProduct(Product p) {
        products.add(p);
    }
    List<Product> getProducts() {
        return products;
    }
    double totalPrice() {
        double total=0;
        for(Product p:products) {
            total+=p.price;
        }
        return total;
    }
    void printInvoice() {
        System.out.println("Shopping Cart Invoice");
        for(Product p:products) {
            System.out.println(p.name+"- $"+p.price);
        }
        double total = totalPrice();
        System.out.println("Total Price:"+total);


    }
    void saveInDB() {
        System.out.println("Saving Products in Database");
    }

}

class SRP {
    public static void main(String[] args) {
        Product p1 = new Product("Earphones", 10, "Electronics");
        Product p2 = new Product("Power Bank", 15, "Electronics");
        ShoppingCart s1 = new ShoppingCart();
        s1.addProduct(p1);
        s1.addProduct(p2);
        s1.printInvoice();


    }

}