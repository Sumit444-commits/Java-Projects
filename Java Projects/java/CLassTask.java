public class CLassTask {
    public static void main(String arg[]){
        int x = 10;
        int result = x>>2;
        System.out.println(result);

        result = x>>>2;
        System.out.println(result);

        x=-10;
         result = x>>2;
        System.out.println(result);

        result = x>>>2;
        System.out.println(result);
    }
}

// 00001010
// 00000010
// 00000010

// 11111010
// 11111110