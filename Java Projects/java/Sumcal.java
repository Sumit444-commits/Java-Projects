public class Sumcal {
    int sum = 0;
     void sum(int n,int ...num){
        for(int i=0;i<n;i++){
            this.sum+=num[i];
        }
        System.out.println("Total is "+this.sum);
        System.out.println("average is "+ this.sum/n);
     }
    
    
    
    public static void main(String[] args) {
        Sumcal s = new Sumcal();
        s.sum(5,2,5,6,5,4);
    }
}
