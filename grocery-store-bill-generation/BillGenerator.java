Main.javaclass BillGenerator {
    public double generateBill(Customer customer) {
        double totalBill = 0;
        
        for (Product product : customer.getProducts()) {
            totalBill += product.getTotalPrice();
        }

        return totalBill;
    }
}
