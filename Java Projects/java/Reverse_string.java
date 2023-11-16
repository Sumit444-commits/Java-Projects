import java.util.Scanner;

public class Reverse_string {

    public static void reverse(String s1 , int idx){
        if(idx==0){
            System.out.print(s1.charAt(idx));
            return;
        }
        
        System.out.print(s1.charAt(idx));
        reverse(s1, idx-1);

    }


    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String s1 = input.next();
        int idx = s1.length()-1;
        reverse(s1, idx);
    }
}
