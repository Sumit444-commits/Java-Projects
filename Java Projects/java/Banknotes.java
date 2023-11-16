import java.util.Scanner;

public class Banknotes {
    public static void main(String arg[]) {
        Scanner input = new Scanner(System.in);

    //User input value in Rupess
        long rupees;

    //Notes and Coins
        long five_thou_notes;
        long thou_notes;
        long five_hund_notes;
        long hund_notes;
        long fifty_notes;
        long twenty_notes;
        long ten_notes;
        long five_coin;
        long two_coin;
        long one_coin;
    
        long remaining;

    //To Continue again and again 
        int ch;

        do {
            System.out.println("\033[H\033[2J");
            System.out.println("Enter rupess : ");
            rupees = input.nextInt();

            if (rupees >= 5000) {
                five_thou_notes = rupees / 5000;
                System.out.println("5k notes " + five_thou_notes);
                remaining = rupees % 5000;
                rupees = remaining;
            }
            if (rupees >= 1000) {
                thou_notes = rupees / 1000;
                System.out.println("1k notes " + thou_notes);
                remaining = rupees % 1000;
                rupees = remaining;
            }
            if (rupees >= 500) {
                five_hund_notes = rupees / 500;
                System.out.println("500 notes " + five_hund_notes);
                remaining = rupees % 500;
                rupees = remaining;
            }
            if (rupees >= 100) {
                hund_notes = rupees / 100;
                System.out.println("100 notes " + hund_notes);
                remaining = rupees % 100;
                rupees = remaining;
            }
            if (rupees >= 50) {
                fifty_notes = rupees / 50;
                System.out.println("50 notes " + fifty_notes);
                remaining = rupees % 50;
                rupees = remaining;
            }
            if (rupees >= 20) {
                twenty_notes = rupees / 20;
                System.out.println("20 notes " + twenty_notes);
                remaining = rupees % 20;
                rupees = remaining;
            }
            if (rupees >= 10) {
                ten_notes = rupees / 10;
                System.out.println("10 notes " + ten_notes);
                remaining = rupees % 10;
                rupees = remaining;
            }
            if (rupees >= 5) {
                five_coin = rupees / 5;
                System.out.println("5 coin " + five_coin);
                remaining = rupees % 5;
                rupees = remaining;
            }
            if (rupees >= 2) {
                two_coin = rupees / 2;
                System.out.println("2 coin " + two_coin);
                remaining = rupees % 2;
                rupees = remaining;
            }
            if (rupees >= 1) {
                one_coin = rupees / 1;
                System.out.println("1 coin " + one_coin);
                remaining = rupees % 1;
                rupees = remaining;
            }

            
            System.out.println("Want to Continue press 1");
            ch = input.nextInt();

        } while (ch == 1);

    }
}
