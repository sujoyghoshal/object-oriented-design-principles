public class Main {
    public static void main(String[] args) {
        // Creating a customer
        Customer customer = new Customer("Alice");

        // Adding products
        customer.addProduct(new Product("Apples", 3.0, 2)); // 2 kg at $3 per kg
        customer.addProduct(new Product("Milk", 2.0, 1));   // 1 liter at $2 per liter

        // Generating bill
        BillGenerator billGenerator = new BillGenerator();
        double totalBill = billGenerator.generateBill(customer);

        // Displaying the bill
        System.out.println("Customer: " + customer.getName());
        for (Product product : customer.getProducts()) {
            System.out.println("Product: " + product.getName() + ", Quantity: " + product.getQuantity() +
                    ", Price per unit: $" + product.getPricePerUnit() + ", Total: $" + product.getTotalPrice());
        }
        System.out.println("Total Bill: $" + totalBill);
    }
}
