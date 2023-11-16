import java.util.Scanner;

public class PetrolStation {
    
 public static void main(String[] args) {
     Scanner sc =new Scanner(System.in);
     System.out.println("Enter price");
     int price=sc.nextInt();
    for(int i=0;i<=price;i++){
        try {
           Thread.sleep(250);
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println("\033[H\033[2J");
        System.out.println("\n\n\n\t\t\t\t\t--Petrol Pump-- ");
        System.out.println("\n\n\t\t\tRUPEES "+i+" RS.");
        System.out.println("\n\t\t\tLiter "+(float)i/280);
        System.out.println("\n\t\t\tPrice per liter 280 Rs.");
    }
 }   
}
