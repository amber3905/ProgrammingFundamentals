package ProblemSet_5c;

public class Pizza {

    private String[] toppings;
    private double cost;

    public Pizza() {
        this.toppings = new String[10];
        this.cost = 0.0;
    }

    public void addToppings(String[] newToppings) {
        int count = 0;
        for (String topping : newToppings) {
            if (count < toppings.length) {
                toppings[count] = topping;
                count++;
            }
        }
        String[] validToppings = new String[count];
        for (int i = 0; i < count; i++) {
            validToppings[i] = toppings[i];
        }
        this.toppings = validToppings;
        calculateCost();
    }

    public String printToppings() {
        String result = "";
        for (int i = 0; i < toppings.length; i++) {
            if (toppings[i] != null) {
                result += toppings[i];
                if (i < toppings.length - 1 && toppings[i + 1] != null) {
                    result += ",";
                }
            }
        }
        return result;
    }

    public double calculateCost() {
        int toppingCount = 0;
        for (String topping : toppings) {
            if (topping != null) {
            	toppingCount++;
            }
        }

        if (toppingCount == 0) {
            cost = 0;
        } else if (toppingCount == 1) {
            cost = 9.99;
        } else if (toppingCount >= 2 && toppingCount <= 3) {
            cost = 10.99;
        } else if (toppingCount >= 4 && toppingCount <= 5) {
            cost = 11.99;
        } else if (toppingCount == 6) {
            cost = 12.99;
        } else if (toppingCount == 7) {
            cost = 13.99;
        } else if (toppingCount == 8) {
            cost = 14.99;
        } else if (toppingCount == 9) {
            cost = 15.99;
        } else {
            cost = 14.99;
        }

        return cost;
    }
}
