import java.util.Scanner;

public class GpaCalculator {
   static Scanner sc = new Scanner(System.in);

    public static void gpacheck(byte n){
        float gpa_in_sub;
        byte credit_hour;
        float total= 0;
        System.out.println("Enter Gpa of Subject for \"A+\" = 4 , \"A\" = 3.5 , \"B+\" = 3 , \"B\" = 2.5 , \"C+\" = 2 , \"C\" = 1");
        for(int i = 1; i<= n ;i++){
            System.out.println("Gpa in subject "+ i);
            gpa_in_sub = sc.nextFloat();
            System.out.println("Credit hour subject (1,2,3)");
            credit_hour = sc.nextByte();
            if(credit_hour > 0 && credit_hour < 4 ){
                gpa_in_sub *= credit_hour;
                total +=gpa_in_sub; 
            }
            
            }
            total/=16;
            System.out.println("Your Gpa is "+ total);
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte numOfSubjects;
        System.out.println("Enter total Number of Subject : ");
        numOfSubjects = sc.nextByte();
        gpacheck(numOfSubjects);

    }
}