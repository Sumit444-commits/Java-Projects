import java.util.Random;
import java.util.Scanner;
import java.util.*;
public class Rockpaperscissor {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();
    int cpnum, userch;
    Rockpaperscissor(){
        rock_paper_scissor();
    }
     void rock_paper_scissor(){
        char ch;
        do{
            System.out.println("Rock, Paper , Scissor  Game ");
            System.out.println("For R press 1");
            System.out.println("For P press 2");
            System.out.println("For S press 3");
            userch = sc.nextInt();
            cpnum =rd.nextInt(3);
            cpnum+=1;
            if(userch == cpnum){
                System.out.println("match Draw");
            }
            else if(userch ==1 && cpnum==2){
                System.out.println("you Lose");
                System.out.println("Computer choice P");
            }
            else if(userch == 1 && cpnum==3){
                System.out.println("you win");
                System.out.println("Computer choice S");
            }
            else if(userch == 2 && cpnum==1){
                System.out.println("you win");
                System.out.println("Computer choice R");
            }
            else if(userch == 2&& cpnum==3){
                System.out.println("you lose");
                System.out.println("Computer choice S");
            }
            else if(userch == 3&& cpnum==1){
                System.out.println("you lose");
                System.out.println("Computer choice R");
            }
            else if(userch == 3 && cpnum==2){
                System.out.println("you win");
                System.out.println("Computer choice P");
            }

            System.out.print("Want to continue (y/n) : ");
            ch = sc.next().charAt(0);
        }while(ch=='y'||ch=='Y');
     }
    public static void main(String[] args) {
        Rockpaperscissor u1 =new Rockpaperscissor();
        
    }
}
