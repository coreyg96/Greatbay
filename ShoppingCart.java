import java.util.ArrayList;

public class ShoppingCart {

    private String customerName;
    private String currentDate;
    private ArrayList<ItemToPurchase> cartItems = new ArrayList<>();

    public ShoppingCart() {
        this.customerName = "none";
        this.currentDate = "January 1, 2016";
    }

    public ShoppingCart(String customerName, String currentDate) {
        this.customerName = customerName;
        this.currentDate = currentDate;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setDate(String currentDate) {
        this.currentDate = currentDate;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getDate() {
        return currentDate;
    }

    public void addItem(ItemToPurchase ItemToPurchase) {
        this.cartItems.add(cartItems.size(), ItemToPurchase);
    }

    public void removeItem(String ItemToRemove) {
        int itemCount = 0;
        for (int i = 0; i < cartItems.size(); ++i) {
            if (cartItems.get(i).getName().equalsIgnoreCase(ItemToRemove)) {
                cartItems.remove(i);
                ++itemCount;
            }
        }
        if (itemCount == 0) {
            System.out.println("\nItem not found in cart. Nothing removed.");
        }
    }

    public void modifyItem(ItemToPurchase itemToPurchase) {
        int itemCount = 0;
        for (int i = 0; i < cartItems.size(); ++i) {
            if (cartItems.get(i).getName().equals(itemToPurchase.getName())) {
                cartItems.get(i).setQuantity(itemToPurchase.getQuantity());
                ++itemCount;
            }
        }
        if (itemCount == 0) {
            System.out.println("\nItem not found in cart. Nothing modified.");
        }
    }

    public int getNumItemsInCart() {
        int count = 0;
        for (int i = 0; i < cartItems.size(); ++i) {
            count += cartItems.get(i).getQuantity();
        }
        return count;
    }

    public int getCostOfCart() {
        int totalCost = 0;
        for (int i = 0; i < cartItems.size(); ++i) {
            totalCost += (cartItems.get(i).getPrice() * cartItems.get(i).getQuantity());
        }
        return totalCost;
    }

    public void printTotal() {
        for (int i = 0; i < cartItems.size(); ++i) {
            System.out.print(cartItems.get(i).printItemCost());
        }
        System.out.println();
    }

    public void printDescriptions() {
        System.out.println("Item Descriptions");
        for (int i = 0; i < cartItems.size(); ++i) {
            System.out.println(cartItems.get(i).printItemDescription());
        }
    }
}