package Area;

import java.util.ArrayList;
import java.util.Scanner;
class History{
    private String name;
    private float l;
    private float w;
    private float area;
    private Area a;
    Scanner sc =new Scanner(System.in);
    History(){
       
        System.out.println("Enter name : ");
        this.name = sc.nextLine();
        System.out.println("Enter length and width respectively");
        this.l=sc.nextFloat();
        this.w=sc.nextFloat();
       this.areaOfSquare();

        a=new Area(this);
        a.callhistory();
     
    }
        public void areaOfSquare(){
            area = l*w;
            System.out.println("Area of square is : "+ area);
        }
       
        public void display(){
            System.out.println("Name : "+this.name);
            System.out.println("area of your square : "+this.area);
        }
}
public class Area {
   ArrayList<History> hlist = new ArrayList<History>();
   Scanner sc =new Scanner(System.in);
   int ch;
   Area(History h){
    hlist.add(h);
   }
    public void callhistory(){
            System.out.println("check all data press 1");
             ch  =sc.nextInt();
            switch(ch){
                case 1:
                this.checkHistory();
                break;
            }

        }
   void checkHistory(){
    for(History h:hlist){
      h.display();
    }
   }
   public static void main(String[] args) {
    History h =new History();
    
   }
}
