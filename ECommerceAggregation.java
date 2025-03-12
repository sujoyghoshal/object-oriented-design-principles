import java.util.ArrayList;

class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void displayProduct() {
        System.out.println("Product: " + name + ", Price: $" + price);
    }
}

class Order {
    int orderId;
    ArrayList<Product> products;

    public Order(int orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void displayOrder() {
        System.out.println("Order ID: " + orderId);
        for (Product p : products) {
            p.displayProduct();
        }
    }
}

class Customer {
    String name;

    public Customer(String name) {
        this.name = name;
    }

    public void placeOrder(Order order) {
        System.out.println(name + " placed an order:");
        order.displayOrder();
    }
}

public class ECommerceAggregation {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 1200);
        Product p2 = new Product("Phone", 800);

        Order order = new Order(101);
        order.addProduct(p1);
        order.addProduct(p2);

        Customer customer = new Customer("Alice");
        customer.placeOrder(order);
    }
}
