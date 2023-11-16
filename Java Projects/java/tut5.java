import java.util.*;
public class tut5 {
    public static void fabonacci_series( int n, int a ,int b){

        if(n==1){
            System.out.print(a);
            return;
        }
        int c = a+b;
          System.out.print(a+ " ");
        fabonacci_series(n-1, b,c);
    }
        
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
      int a=0;
      int b=1;
      if(n<0){
        System.out.println("invalid number");
      }else{
          fabonacci_series(n, a, b);
      }
    }    
}
