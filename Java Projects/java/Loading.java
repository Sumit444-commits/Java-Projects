
import java.io.*;
import java.lang.Thread;
public class Loading {
   static void loding(){
		for(int k=0;k<3;k++){
		for(int i=0;i<3;i++){
            // try{
            //     Thread.sleep(1000);
            // }catch(InterruptedException e){

            // }
			
			System.out.println("\033[H\033[2J");
		
			System.out.print("\n\n\t\t\t\tloading");
			for(int j=0;j<=i;j++){
				System.out.print(".");
			}
		}			
	}
		}
    public static void main(String[] args) {
        loding();
		System.out.println("\033[H\033[2J");
	
    }
}
