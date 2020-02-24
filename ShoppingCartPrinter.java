import java.util.Scanner;

public class ShoppingCartPrinter {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cartTotal = 0;

        ItemToPurchase item1 = new ItemToPurchase();
        ItemToPurchase item2 = new ItemToPurchase();

        // Get item 1 details from user, create itemToPurchase object
        System.out.println("Item 1");
        System.out.println("Enter the item name:");
        item1.setName(scan.nextLine());

        System.out.println("Enter the item price:");
        item1.setPrice(scan.nextInt());

        System.out.println("Enter the item quantity:");
        item1.setQuantity(scan.nextInt());
        System.out.println("");


        // Get item 2 details from user, create itemToPurchase object
        System.out.println("Item 2");
        System.out.println("Enter the item name:");
        scan.nextLine();
        item2.setName(scan.nextLine());

        System.out.println("Enter the item price:");
        item2.setPrice(scan.nextInt());

        System.out.println("Enter the item quantity:");
        item2.setQuantity(scan.nextInt());
        System.out.println("");


        // TODO: Add costs of the two items and print the total


    }
}

