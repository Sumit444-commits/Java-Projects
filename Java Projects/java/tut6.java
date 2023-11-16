import java.util.Scanner;

public class tut6 {
    public static int calcpower(int n, int x){
        
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }

        //if n is even
        if(n%2==0){
            return calcpower(n/2, x)*calcpower(n/2, x);
        }else{//if n is odd
            return calcpower(n/2, x)*calcpower(n/2, x)*x;
        }
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int x = sc.nextInt();
        int total = calcpower(n, x);
        System.out.println(total);
    }
}
