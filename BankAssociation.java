import java.util.ArrayList;

class Bank {
    String name;
    ArrayList<Customer> customers;

    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public void openAccount(Customer customer) {
        customers.add(customer);
        System.out.println("Account opened for " + customer.name + " at " + name);
    }
}

class Customer {
    String name;
    double balance;

    public Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void viewBalance() {
        System.out.println(name + "'s balance: $" + balance);
    }
}

public class BankAssociation {
    public static void main(String[] args) {
        Bank bank = new Bank("XYZ Bank");

        Customer customer1 = new Customer("Alice", 5000);
        Customer customer2 = new Customer("Bob", 3000);

        bank.openAccount(customer1);
        bank.openAccount(customer2);

        customer1.viewBalance();
        customer2.viewBalance();
    }
}
