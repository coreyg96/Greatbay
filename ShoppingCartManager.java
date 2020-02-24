import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ShoppingCartManager {
    private static Scanner scan = new Scanner(System.in);
    private static List<Character> choices = Arrays.asList('a', 'c', 'd', 'i', 'o', 'q');

    public static void printMenu() {
        System.out.println("MENU");
        System.out.println("a - Add item to cart");
        System.out.println("d - Remove item from cart");
        System.out.println("c - Change item quantity");
        System.out.println("i - Output items' descriptions");
        System.out.println("o - Output shopping cart");
        System.out.println( "q - Quit");
        System.out.println("");
    }

    public static void main(String[] args) {
        String customerName;
        String todayDate;
        char menuChoice = ' ';

        System.out.println("Enter Customer's Name:");
        customerName = scan.nextLine();

        System.out.println("Enter Today's Date:");
        todayDate = scan.nextLine();

        System.out.println("\nCustomer Name: " + customerName);
        System.out.println("Today's Date: " + todayDate);
        System.out.println("");

        ShoppingCart cart = new ShoppingCart(customerName, todayDate);

        while(menuChoice != 'q') {
            printMenu();

            String productName;
            String productDescription;
            int productPrice = 0;
            int productQuantity = 0;

            while (!choices.contains(menuChoice)) {
                System.out.println("Choose an option:");
                menuChoice = scan.next().charAt(0);
            }

            switch (menuChoice) {
                case 'a':
                    scan.nextLine();
                    System.out.println("ADD ITEM TO CART");
                    System.out.println("Enter the item name:");
                    productName = scan.nextLine();

                    System.out.println("Enter the item description:");
                    productDescription = scan.nextLine();

                    System.out.println("Enter the item price:");
                    productPrice= scan.nextInt();

                    System.out.println("Enter the item quantity:");
                    productQuantity = scan.nextInt();

                    ItemToPurchase newItem = new ItemToPurchase(productName, productDescription, productPrice, productQuantity);
                    cart.addItem(newItem);

                    menuChoice = ' ';
                    System.out.println("");
                    break;

                case 'd':
                    scan.nextLine();

                    System.out.println("REMOVE ITEM FROM CART");
                    System.out.println("Enter name of item to remove:");
                    productName = scan.nextLine();

                    cart.removeItem(productName);
                    menuChoice = ' ';
                    System.out.println("");
                    break;

                case 'c':
                    scan.nextLine();

                    System.out.println("CHANGE ITEM QUANTITY");
                    System.out.println("Enter the item name:");
                    productName = scan.nextLine();

                    System.out.println("Enter the new quantity:");
                    productQuantity = scan.nextInt();

                    ItemToPurchase modItem = new ItemToPurchase();
                    modItem.setName(productName);
                    modItem.setQuantity(productQuantity);

                    cart.modifyItem(modItem);

                    menuChoice = ' ';
                    System.out.println("");
                    break;

                case 'i':
                    System.out.println("OUTPUT ITEMS' DESCRIPTIONS");
                    cart.printDescriptions();

                    menuChoice = ' ';
                    System.out.println("");
                    break;

                case 'o':
                    System.out.println("OUTPUT SHOPPING CART");
                    cart.printTotal();

                    menuChoice = ' ';
                    System.out.println("");
                    break;
            }
        }
    }
}
