package ProblemSet_5c;

import java.util.ArrayList;

public class Order {
    private Customer customer;
    private ArrayList<Pizza> pizzas;

    public Order(Customer customer) {
        this.customer = customer;
        this.pizzas = new ArrayList<>();
    }

    public void addPizza(Pizza pizza) {
        pizzas.add(pizza);
    }

    public double calculateTotal() {
        double total = 0;
        for (Pizza pizza : pizzas) {
            total += pizza.calculateCost();
        }
        return total;
    }

    public String printReceipt() {
        return "Customer: " + customer.toString() + "\n"
        		+ "Number of Pizzas: " + pizzas.size() + "\n"
        		+ "Total Cost: " + String.format("%.2f", calculateTotal());
    }
}
