package honay;


public class Hanoy_tower {
    public static void honay_tower(int n, String src, String helper, String destiny){
        if(n==1){
            System.out.println("Transfer disk "+n+" from "+src+" to "+destiny);
            return;
        }

        honay_tower(n-1, src, destiny, helper);
        System.out.println("Transfer disk "+n+" from "+src+" to "+destiny);
        honay_tower(n-1, helper, src, destiny);
    }
    public static void main(String arg[]){

       int n=3;
       honay_tower(n,"S" ,"H","D");
    }
}
