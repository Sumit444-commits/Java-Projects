import java.util.ArrayList;

public class Hero extends Character {
   private int experience = 0;
   private int level = 0;
   private ArrayList<Item> rewards = null;

   public Hero(String name, int maxHealth, int attackPower) {
      super(name, maxHealth, attackPower);
      rewards = new ArrayList<Item>();
   }

   public int getExperience() {
      return experience;
   }

   public int getLevel() {
      return level;
   }

   public void setLoot(Item wonItem) {
      rewards.add(wonItem);
   }

   public void viewHero() {
      System.out.println("Name : " + getName());
      System.out.println("Experience : " + getExperience());
      System.out.println("Current Level : " + getLevel());
   }

   public void levelUp() {
      level = level + 1;
      System.out.println("Congratulation...! \n" + getName() + " level increased ");
      System.out.println(getName() + " New Level " + getLevel());
      earnExperience();
      System.out.println(getName() + " Won Item ");
      try {
         for (Item i : rewards) {
            i.use();
         }
      } catch (NullPointerException n) {
         System.out.println("No Item won");
      }

   }

   public void earnExperience() {
      experience = experience + 10;
      System.out.println("Experience gained " + getName());
      System.out.println("New experience level : " + getExperience());
   }

}
