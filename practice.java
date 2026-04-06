import java.util.ArrayList;

class Product {
    String name;
    double price;
    int quantity;

    Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    double getTotalPrice() {
        return price * quantity;
    }
}

public class ShoppingCart {
    public static void main(String[] args) {
        ArrayList<Product> cart = new ArrayList<>();

        cart.add(new Product("Laptop", 800.0, 1));
        cart.add(new Product("Mouse", 20.0, 2));
        cart.add(new Product("Keyboard", 40.0, 1));

        double grandTotal = 0;

        System.out.println("Shopping Cart:");
        System.out.println("-------------------------");

        for (Product product : cart) {
            System.out.println(
                product.name + " - $" + product.price +
                " x " + product.quantity +
                " = $" + product.getTotalPrice()
            );
            grandTotal += product.getTotalPrice();
        }

        System.out.println("-------------------------");
        System.out.println("Total Amount: $" + grandTotal);
    }
}
