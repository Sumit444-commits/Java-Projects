import java.util.Scanner;


public class Start {
  int a=1,b=2,c=3;


 void swap(int a,int b, int c){
        int temp =a;
        this.a=b;
        this.b=c;
        this.c=temp;
        System.out.println(a+" "+b+" "+c);
    }
//  void swap(int a,int b, int c){
//         int temp =a;
//         a=b;
//         b=c;
//         c=temp;
//         System.out.println(a+" "+b+" "+c);
//     }
    public static void main(String[] arg){
        Scanner input =new Scanner(System.in);
        Start s = new Start();
    //   String n = input.nextLine();
    //     System.out.println(n);
    // int a=0,b=1,c=2;
    // s.a=1;
    // s.b=2;
    // s.c=3;

    System.out.println(s.a+" "+s.b+" "+s.c);
    s.swap(s.a,s.b,s.c);
    }
}
