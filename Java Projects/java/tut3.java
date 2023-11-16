import java.util.*;

public class tut3{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[]= new int[n];
        for(int i=0;i<n;i++){
            array[i] = sc.nextInt();
        }
        int a=0,b=0,c=0;
        for(int i=0;i<n;i++){
            if(array[i] > 0 ){
                a = a+1;
            }else if(array[i] < 0){
                 b = b + 1;
            }else{
                c = c + 1;
            }
        }

        System.out.println("You enter positive number "+ a +" times");
        System.out.println("You enter negative number "+ b +" times");
        System.out.println("You enter zeros "+ c +" times");

    }
}