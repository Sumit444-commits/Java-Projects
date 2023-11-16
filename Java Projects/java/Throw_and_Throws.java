public class Throw_and_Throws {
        public static int divide(int a,int b) throws ArithmeticException {
            
           int c=a/b;
           return c;
        }
        public static void main(String[] args) {
            try{
            System.out.println(divide(5, 0));
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
