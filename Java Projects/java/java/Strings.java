import java.util.StringJoiner;

public class Strings {
    public static void main(String[] args) {
    //     String s = new String("hello");
        // String s2 = "hello";
    //     String s3 = "wello";
    //     String s4 = "hello world";


    // //   System.out.println(s==s2);
    // //   System.out.println(s2==s3);
    // //   System.out.println(s.equals(s2));
    // //   System.out.println(s4.contains(s));
    // //   System.out.println(s2.compareTo(s3));
    // //  String a="a";
    // //     System.out.println(a.compareTo("y"));
    //     System.out.println(s.substring(0,4));
    //     // System.out.println(s.codePointBefore(3));
    //     System.out.println(s.codePointAt(3));
      
    //    s= s.replace("h","p");
        
    //     System.out.println(s);

        StringBuilder sb = new StringBuilder("hello");
        sb.delete(0, 3);
    //     sb.append(" world");
        

        System.out.println(sb.hashCode());





        StringJoiner sj = new StringJoiner("-", "{", "}");
        sj.add("I").add("Love").add("Muet");
        System.out.println(sj);

        String desiredString = sj.toString();
        System.out.println(desiredString);






    }
}
