
public class Quest {
   private String questName;
   private String description;
   private Item reward;

   public Quest(String questName, String description, Item reward) {
      this.questName = questName;
      this.description = description;
      this.reward = reward;
   }

   public String getQuestName() {
      return questName;
   }

   public void completeQuest() {
      System.out.println("Quest Compeleted " + questName);
      System.out.println("Decription of Quest : " + description);
      System.out.println("Quest reward ");
      reward.use();
   }
}
