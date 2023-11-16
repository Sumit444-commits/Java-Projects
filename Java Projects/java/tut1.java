import java.util.*;

public class tut1{
public static void main(String[] arg){
    Scanner sc = new Scanner(System.in);
    
    
    int ch = 1;

    while(ch == 1 ){
    int n = sc.nextInt();
    System.out.println("enter case no: ");
    int ca = sc.nextInt();
        switch(ca){
    case 1:
        for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        for(int j=1;j<=2*(n-i);j++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
       for(int i=n;i>=1;i--){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        for(int j=1;j<=2*(n-i);j++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    break;
    case 2:
        for(int i=1;i<=n;i++){
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        break;
    case 3:
        for(int i=1;i<=n;i++){
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
        break;
    case 4:
        for(int i=1;i<=n;i++){
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            int a=i;
            for(int j=1;j<=i;j++){
                System.out.print(a);
                a=a-1;
            }
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        break;
    case 5:
         for(int i=1;i<=n;i++){
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
             }
            for(int j=2;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
             }
            for(int j=2;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        break;
    default: System.out.println("try again");
    }
    System.out.println("Want to continue press 1 :");
 ch = sc.nextInt();   
}
    
}
}