import java.util.*;

public class GamePanel extends Thread {
    Hero hero = null;
    Monster monster = null;
    String pName;
    String play;
    ArrayList<Item> item;
    Scanner input;
    Quest quest = null;

   public GamePanel() {
        loading();
        System.out.println("\033[H\033[2J");
        input = new Scanner(System.in);
        System.out.println("------------------Wlecome to Heroes of Realm-----------------");
        System.out.println();
        hero = new Hero(selectPlayer(), 100, 25);
        System.out.println("Character selected " + pName);
        System.out.println();
        System.out.println("------------------------------------------------------------------");
        hero.viewHero();
        System.out.println("------------------------------------------------------------------");

        item = new ArrayList<Item>();
        item.add(new Item("Health Potion", "Make the health maximum"));
        item.add(new Item("potion of Strength", "increases power"));
        item.add(new Item("Ancient Amulet", "Maximize the power for one time"));

        selectMonster();

    }

    public void run() {
        do {

            if (monster.getHealth() < 25) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
                System.out.println("********************************************************************");
                System.out.println("|---------**********--------Quest won--------**********------------|");
                quest.completeQuest();
                System.out.println("********************************************************************");
                synchronized (this) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }
                    hero.setLoot(monster.getLoot());
                    hero.levelUp();
                    System.out.println("********************************************************************");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }
                    monster.dropLoot();
                    System.out.println();
                    System.out.println("********************************************************************");
                }
                selectMonster();
            }

            loopPlay();
            if (play.equalsIgnoreCase("no")) {
                return;
            }
            if (monster.getHealth() >= 25) {
                System.out.println(hero.getName() + " is hitted by " + monster.getName());
                System.out.println(hero.getName()+" hitted the " + monster.getName());
                monster.takeDamage();
                System.out.println("Monster health " + monster.getHealth());
            }
        } while (play.equalsIgnoreCase("yes"));
    }

    public void loopPlay() {
        System.out.println();
        System.out.println("------------------------------------------------------------------");
        System.out.println("\nDo you want to play (Yes/No)");
        play = input.next();

        if (play.equalsIgnoreCase("yes") != true && play.equalsIgnoreCase("no") != true) {
            System.out.println("Invalid choice");
            System.out.println("re-enter your choice");
            loopPlay();
        }

    }

    public String selectPlayer() {
         int choice;

        String[] players = { "Wizard", "Ranger", "Cleric" };
        System.out.println("Select Character");
        for (int i = 0; i < players.length; i++) {
            System.out.println((i + 1) + ". " + players[i]);
        }
        System.out.println("!!! Warning Do not enter any character !!!");
        System.out.println("Please enter any number between (1-3)...!!!!!");

        choice = input.nextInt();

        switch (choice) {
            case 1:
                pName = players[choice - 1];
                break;
            case 2:
                pName = players[choice - 1];
                break;
            case 3:
                pName = players[choice - 1];
                break;
            default:
                pName = players[0];
                System.out.println("Invalid choice");
                System.out.println("Default character selected...!");
        }
        return pName;
    }

    public void selectMonster() {
         int choice;
        System.out.println();
        System.out.println("Select Enemy ..!");
        String[] enemy = { "Oherem", "Neithis", "Sydney Funnel" };
        for (int i = 0; i < enemy.length; i++) {
            System.out.println((i + 1) + ". " + enemy[i]);
        }
        System.out.println("!!! Warning Do not enter any character !!!");
        System.out.println("Please enter any number between (1-3)...!!!!!");
        choice = input.nextInt();
        System.out.println("------------------------------------------------------------------");
        switch (choice) {
            case 1:
                System.out.println("Monster Selected\n");
                monster = new Monster(enemy[choice - 1], 100, hero.getAttackPower(), "Dragon", item.get(0));
                quest = new Quest("Dragon Challenge", "Face the Fear some Dragon", monster.getLoot());
                System.out.println("------------------------------------------------------------------");
                System.out.println("Quest selected " + quest.getQuestName());
                monster.monsterDescription();
                break;
            case 2:
                System.out.println("Monster Selected\n");
                monster = new Monster(enemy[choice - 1], 100, hero.getAttackPower(), "Spider", item.get(1));
                quest = new Quest("Spider Challenge", "Face the Fear some Ant leader Spider Queen", monster.getLoot());
                System.out.println("------------------------------------------------------------------");
                System.out.println("Quest selected " + quest.getQuestName());
                monster.monsterDescription();
                break;
            case 3:
                System.out.println("Monster Selected\n");
                monster = new Monster(enemy[choice - 1], 100, hero.getAttackPower(), "Snake", item.get(2));
                quest = new Quest("Snake Challenge", "Face the Fear some Snake King", monster.getLoot());
                System.out.println("------------------------------------------------------------------");
                System.out.println("Quest selected " + quest.getQuestName());
                monster.monsterDescription();
                break;
            default:
                System.out.println("Invalid choice");
                System.out.println("Default enemy selected...!");
                monster = new Monster(enemy[0], 100, hero.getAttackPower(), "Dragon", item.get(0));
                quest = new Quest("Dragon Challenge", "Face the Fear some Dragon", monster.getLoot());
                System.out.println("------------------------------------------------------------------");
                System.out.println("Quest selected " + quest.getQuestName());
                monster.monsterDescription();

        }
    }

    public void loading() {
        for (int i = 0; i < 3; i++) {
            System.out.println("\033[H\033[2J");
            System.out.println("--------------------------------Starting Game---------------------------------");
            System.out.println("\n\n");

            System.out.println();
            System.out.print("                                   Loading ");
            for (int j = 0; j < 3; j++) {
                System.out.print(".");
                try {
                    Thread.sleep(250);
                } catch (InterruptedException e) {
                }
            }
        }
    }

    public static void main(String[] args) {
        GamePanel g1 = new GamePanel();
        g1.start();

        // GamePanel g2 = new GamePanel();
        // GamePanel g3 = new GamePanel();
        // GamePanel g4 = new GamePanel();
        // GamePanel g5 = new GamePanel();
        // g2.start();
        // g3.start();
        // g4.start();
        // g5.start();

        // try{
        // g1.join();
        // g2.join();
        // g3.join();
        // g4.join();
        // g5.join();
        // }catch(InterruptedException e){}
    }
}
