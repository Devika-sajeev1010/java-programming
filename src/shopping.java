import java.util.Scanner;

class Item {
    String name;
    double price;

    Item(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

public class shopping{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Item[] cart = new Item[100]; // array of Item objects
        int count = 0;
        int choice;

        do {
            System.out.println("\n==== Shopping Cart Menu ====");
            System.out.println("1. Add to Cart");
            System.out.println("2. Delete from Cart");
            System.out.println("3. Display Cart");
            System.out.println("4. Total Price");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    if (count >= cart.length) {
                        System.out.println("Cart is full.");
                        break;
                    }
                    System.out.print("Enter item name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter item price: ");
                    double price = sc.nextDouble();
                    cart[count++] = new Item(name, price);
                    System.out.println("Item added to cart.");
                    break;

                case 2:
                    System.out.print("Enter item name to delete: ");
                    String deleteName = sc.nextLine();
                    boolean found = false;
                    for (int i = 0; i < count; i++) {
                        if (cart[i].name.equalsIgnoreCase(deleteName)) {
                            for (int j = i; j < count - 1; j++) {
                                cart[j] = cart[j + 1]; // shift items left
                            }
                            cart[--count] = null; // clear last item
                            found = true;
                            System.out.println("Item removed.");
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Item not found.");
                    }
                    break;

                case 3:
                    if (count == 0) {
                        System.out.println("Cart is empty.");
                    } else {
                        System.out.println("Items in cart:");
                        for (int i = 0; i < count; i++) {
                            System.out.println((i + 1) + ". " + cart[i].name + " ₹" + cart[i].price);
                        }
                    }
                    break;

                case 4:
                    double total = 0;
                    for (int i = 0; i < count; i++) {
                        total += cart[i].price;
                    }
                    System.out.println("Total Price: ₹" + total);
                    break;

                case 5:
                    System.out.println("Exiting. Thank you for shopping!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 5);

        sc.close();
    }
}