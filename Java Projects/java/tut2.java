import java.util.*;
public class tut2 {
    // public  static int Average (int a,int b,int c){
    //     int avg = (a+b+c)/3;
    //     return 3;
    // }
    public static int sum_odd(int n){
        int sum=0;
        for(int i=1; i<=2*n ;i++){
            if(i%2==1){
                sum = sum + i;
            }
        }
        return sum;
    }
    public static void greater_one(int a, int b){
        if(a>b){
            System.out.println(a+" is greater than "+b);
        }
        else if(b>a){
            System.out.println(b + " is greater than " + a);
        }else{
            System.out.println("both number are equal");
        }
    }
    public static double circumference(double r){
        return 2*(3.14)*r;
    }
    public static int power(int n,int x){
        int power = 1;
        for(int i=1;i<=n;i++){
            power = power * x;
        }
        return power;
    }
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
    // int n = sc.nextInt();
    // int x = sc.nextInt();
    // // double r = sc.nextFloat();
    // // System.out.println("Circumference of circle of radius "+r+" is "+ circumference(r));
    //     // System.out.println("The average of the three is : " + Average(a, b, c));
    //     // System.out.println("The sum of first " + n + " odd numbers is " + sum_odd(n));
    //     // greater_one(a, b);
    //    System.out.println(x + "^" + n + " = " + power(n, x));
}
}