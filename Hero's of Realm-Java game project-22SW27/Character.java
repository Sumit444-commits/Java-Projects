
//Base Class
public class Character {
   private String name; // store name of character
   private int health; // Current health points
   private int maxHealth; // Maximum health points
   private int attackPower; // power of character

   public Character(String name, int maxHealth, int attackPower) {
      this.name = name;
      this.maxHealth = maxHealth;
      this.attackPower = attackPower;
      this.health = maxHealth;
   }

   public String getName() {
      return name;
   }

   public int getHealth() {
      return health;
   }

   public int getAttackPower() {
      return attackPower;
   }

   public int takeDamage() {
      health = health - attackPower;
      return health;
   }

   public void attack() {
      System.out.println("Attacked by :" + getName());
   }

   public void heal() {
      this.health = maxHealth;
      System.out.println(getName() + " healed succesfully...!");
   }

}