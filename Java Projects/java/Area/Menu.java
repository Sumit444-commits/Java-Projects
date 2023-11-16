package Area;

import java.util.*;

class History {
    private String name;
    private float area;
    History(String n,float a){
        this.name = n;
        this.area =a;
    }

    public void display() {
        System.out.println("Name : " + this.name);
        System.out.println("area of your square : " + this.area);
    }
}

class Area {
    private String name;
    private float l;
    private float w;
    private float area;
    ArrayList<History> hlist = new ArrayList<History>();

    Scanner sc = new Scanner(System.in);

    Area() {
        char ch;
          do {
            System.out.println("Enter name : ");
            this.name = sc.next();
            System.out.println("Enter length and width respectively");
            this.l = sc.nextFloat();
            this.w = sc.nextFloat();
            this.areaOfSquare();
            hlist.add(new History(name,area));
            this.callhistory();
            System.out.println("Want to run again the program(y/n)");
             ch = sc.next().charAt(0);
        } while (ch == 'y'||ch=='Y');
    }
    
    public void areaOfSquare() {
        area = l * w;
        System.out.println("Area of square is : " + area);
    }

    public void callhistory() {
        
        System.out.println("check all data (y/n)");
        char ch = sc.next().charAt(0);
        switch (ch) {
            case 'y':
                this.checkHistory();
                break;
            case 'Y':
                this.checkHistory();
                break;
        }
        return;
    }

    void checkHistory() {
        for(History h : hlist) {
            h.display();
        }
    }
}

public class Menu {
   public static void main(String[] args) {
    Area a =new Area();
   
   }
}
