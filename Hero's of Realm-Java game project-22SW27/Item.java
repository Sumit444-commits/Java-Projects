
public class Item {
   private String itemName;
   private String description;

   public Item(String itemName, String description) {
      this.itemName = itemName;
      this.description = description;

   }

   public void use() {
      System.out.println("Item Name : " + itemName);
      System.out.println("Decription  of Item : " + description);
   }
}
