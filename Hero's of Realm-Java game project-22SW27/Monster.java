
public class Monster extends Character {
   private String monsterType;
   private Item loot;

   public Monster(String name, int maxHealth, int attackPower, String monsterType, Item loot) {
      super(name, maxHealth, attackPower);
      this.monsterType = monsterType;
      this.loot = loot;
   }

   public void monsterDescription() {
      System.out.println("Monster Name : " + getName());
      System.out.println("Monster Type : " + monsterType);
      System.out.println(getName() + " have Health :" + getHealth() + "%");
      System.out.println("Have Item ");
      loot.use();
   }

   public Item getLoot() {
      return loot;
   }

   public void dropLoot() {
      System.out.println(getName() + " Defeated...");
      System.out.println("Item Dropped ");
      loot.use();
   }

}
