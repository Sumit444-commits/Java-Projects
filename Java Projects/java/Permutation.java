public class Permutation {
    public static void print_permutation(String str,String permutation){
        if(str.length()==0){
            System.out.println(permutation);
            return;
        }

        for(int i=0;i<str.length() ;i++){
            char currchar = str.charAt(i);
            String newstr = str.substring(0,i)+str.substring(i+1);
            print_permutation(newstr, permutation + currchar);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        print_permutation(str,"");
         

    }
    
}
