import java.util.*;
// import honay;

public class Practice {
    public static void factorial(int n){
            int fact = 1;
        int x=n;
        for(int i=n;i>=1;i--){
            fact*=x;
            x--;
        }
        System.out.println(n+"! = "+fact);
        
    }

    public static void fabonacci_series(int n){
      
        int a= 0;
        int b= 1;
        int c;
            if(n>=1)
            {
            System.out.print(a+" ");
            }else
            {
          
            System.out.print("Invalid no:");
            }
            if(n>=2)
            {
            System.out.print(b+" ");
            } 
        for(int i=2; i<n; i++)
        {
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }

    public static void area(int r){
        System.out.println("The Area of circle of Radius "+r+" is "+(3.14)*r*r);
    }
    public static void main(String[] args) {
        honay.Hanoy_tower h1 = new honay.Hanoy_tower();
        // h1.honay_tower(5, "S", "H", "D");
        int n = 5;
        int r=1;
        factorial(n);
        fabonacci_series(n);
        System.out.println();
        area(r);
    }
}
