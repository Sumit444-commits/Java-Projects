import java.util.*;

public class tut4{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
    //   int n = 5;
    //   int pos = 4;
    //   int bitMask = 1<<pos;
    //  if(( bitMask & n) == 0){
    //      System.out.println("Bit was zero");
    //  }else{
    //     System.out.println("bit was one");
    //  }
    int bit =     01011;
    int pos = 4;
    int bitMask = 10101;
    //00001       11111
    System.out.println(bit | bitMask);
    }
}