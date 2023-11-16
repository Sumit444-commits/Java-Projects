public class Recursion {
    public static void reverse(String str, int idx){
        if(idx==0){
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        reverse(str, idx-1);
    }
    static int first = -1;
    static int last = -1;

    public static void first_last(String str, int idx,char element){
        if(idx==str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        
        char currchar = str.charAt(idx);
        if(currchar==element){
            if(first == -1){
                first = idx;
            }else{
                last= idx;
            }
        }
        first_last(str, idx+1, element);
    }

     static boolean sorted(int arr[], int idx){
        if(idx == arr.length-1){
           
            return true;
        }
        if(arr[idx]<arr[idx+1]){
          return sorted(arr, idx+1);
        }else{
            return false;
        }
     }
     static int count =0;
     static void setx(String str, String newstr,int idx, char element){
       
        if(idx == str.length()){
            for(int i=0;i<count;i++){
                newstr+=element;
            }
            System.out.print(newstr);
            return;
        }
        char currchar = str.charAt(idx);
        if(currchar !=element){
            newstr+=currchar;
        }else{
            count++;
        }
        setx(str, newstr, idx+1, element);
     }
    public static void main(String[] args) {
        String str = "hello";
        // reverse(str, str.length()-1);
        String str2 = "abaaacdefa";
        // first_last(str2, 0, 'a');
        int[] arr = {1,2,3,4,4,5};
        // System.out.println("is sorted "+sorted(arr,0));
        String str3="axbxcxxd";
        setx(str3, "", 0,'x');
    }
}
