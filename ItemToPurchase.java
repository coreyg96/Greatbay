public class ItemToPurchase {

    private String itemName;
    private int itemPrice;
    private int itemQuantity;
    private String itemDescription;

    public ItemToPurchase() {
        this.itemName = "none";
        this.itemPrice = 0;
        this.itemQuantity = 0;
        this.itemDescription = "none";
    }

    public ItemToPurchase(String itemName, String itemDescription, int itemPrice, int itemQuantity) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemQuantity = itemQuantity;
        this.itemDescription = itemDescription;
    }

    public void setName(String itemName) {
        this.itemName = itemName;
    }

    public void setPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public void setQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public void setDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getName() {
        return itemName;
    }

    public int getPrice() {
        return itemPrice;
    }

    public int getQuantity() {
        return itemQuantity;
    }

    public String getDescription() {
        return itemDescription;
    }

    public String printItemCost() {
        return String.format("\n%s %d @ $%d = $%d", itemName, itemQuantity, itemPrice, itemQuantity * itemPrice);
    }

    public String printItemDescription() {
        return itemName + ": " + itemDescription;
    }
}