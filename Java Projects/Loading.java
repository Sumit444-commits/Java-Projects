public class Loading {
    public static void main(String[] args) {
        for(int i=0;i<3;i++){
            System.out.println("\033[H\033[2J");
            System.out.print("Loading ");
            for(int j=0;j<3;j++){
                System.out.print(".");
                try{
                    Thread.sleep(1000);
                }catch(InterruptedException e){
                }
            }
    }
    }
}
