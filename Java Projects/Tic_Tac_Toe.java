import java.util.Random;
import java.util.Scanner;

public class Tic_Tac_Toe{
    String[][] board = new String[3][3];
    public void gameBoard(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                board[i][j]= null;
              
            }
            
        }
       computerInput();
    }

    public void display(){
      
            for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print("["+i+"]["+j+"] "+board[i][j]+"       ");
            }
            System.out.println("\n");
        }
    }

    public void userInput(){
        Scanner sc = new Scanner(System.in);
        byte row;
        byte column;
        System.out.println("\033[H\033[2J");
        display();
        System.out.println("Enter row number : ");
        row = sc.nextByte();
        System.out.println("Enter column number : ");
        column = sc.nextByte();
        
        
        if(board[row][column]==null){
            board[row][column] = "X";
            checkBoard();
            computerInput();
            userInput();

        }else{
            System.out.println("Incorrect choice or Place filled");
            userInput();
            
        }
        sc.close();
    }

    
    
    
    public void computerInput(){
        Random ran = new Random();
        byte random_row = (byte)ran.nextInt(3);
        byte random_col = (byte)ran.nextInt(3);
        if(board[random_row][random_col]==null){
            board[random_row][random_col]="O";
            checkBoard();
        }else{
            computerInput();
        }
    }
    public void checkBoard(){
        for(int i=0;i<3;i++){
            
                if(board[i][0]=="X"&&board[i][1]=="X"&&board[i][2]=="X"){
                  System.out.println("\033[H\033[2J");
                    display();

                    System.out.println("You won");
                    System.out.println();
                    continueNewGame();
                }
                if(board[0][i]=="X"&&board[1][i]=="X"&&board[2][i]=="X"){
                  System.out.println("\033[H\033[2J");
                    display();
                    System.out.println("You won");
                    System.out.println();
                    continueNewGame();
                }
                
            }
            if(board[0][0]=="X"&&board[1][1]=="X"&&board[2][2]=="X"){
               System.out.println("\033[H\033[2J");
                display();
                System.out.println("You won");
                System.out.println();
                continueNewGame();
            }
            if(board[0][2]=="X" && board[1][1]=="X" && board[2][0]=="X"){
               System.out.println("\033[H\033[2J");
                display();
                System.out.println("You won");
                System.out.println();
                continueNewGame();
            }
            
            
            for(int i=0;i<3;i++){
                
                if(board[i][0]=="O"&&board[i][1]=="O"&&board[i][2]=="O"){
                    System.out.println("\033[H\033[2J");
                    display();
                    System.out.println("Computer won");
                    System.out.println();
                    continueNewGame();
                }
                if(board[0][i]=="O"&&board[1][i]=="O"&&board[2][i]=="O"){
                    System.out.println("\033[H\033[2J");
                    display();
                    System.out.println("Computer won");
                    System.out.println();
                    continueNewGame();
                }
                
            }
            if(board[0][0]=="O"&&board[1][1]=="O"&&board[2][2]==")"){
                System.out.println("\033[H\033[2J");
                display();
                System.out.println("Computer won");
                System.out.println();
                continueNewGame();
            }
            if(board[0][2]=="O" && board[1][1]=="O" && board[2][0]=="O"){
                System.out.println("\033[H\033[2J");
                display();
                System.out.println("Computer won");
                System.out.println();
                continueNewGame();
            }

            
            if(board[0][0]!=null && board[0][1]!=null&& board[0][2]!=null&& board[1][0]!=null && board[1][1]!=null&& board[1][2]!=null&& board[2][0]!=null && board[2][1]!=null&& board[2][2]!=null){
                System.out.println("\033[H\033[2J");
                display();
                System.out.println("Match draw");
                try{
                    Thread.sleep(5000);
                    System.out.println();
                    continueNewGame();
                    
                }catch(InterruptedException e){}
            }


            
            
        }
        public void continueNewGame(){
            Scanner sc =new Scanner(System.in);
            System.out.println("Do you want to play again (Yes/No) ");
            String con = sc.next();
            if(con.equalsIgnoreCase("YES")==true){
                gameBoard();
                userInput();
            }else{
                System.out.println("Thanks for playing");
                System.exit(0);
            }
            sc.close();
        }
       
    public static void main(String[] args) {
        Tic_Tac_Toe tic = new Tic_Tac_Toe();
        tic.gameBoard();
        // tic.display();
        tic.userInput();
        // tic.display();
    }
}