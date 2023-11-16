import java.util.Scanner;

public class Area{
private float l;
private float w;
private float r;
private float area;
    Scanner sc =new Scanner(System.in);

    
    public Area(){
        System.out.println("Want to enter values or want to use default values");
        System.out.println("1. press one for default");
        System.out.println("2. press two for your own values");
        int ch = sc.nextInt();
        switch(ch){
            case 1:
                this.l=1.0f;
                this.w=1.0f;
                this.r=1.0f;
                break;
            case 2:
            System.out.println("enter value of length ");
            this.l =sc.nextFloat();
            System.out.println("enter value of width ");
            this.w =sc.nextFloat();
            System.out.println("enter value of radius ");
            this.r =sc.nextFloat();
            break;
            default : System.out.println("Wrong choice");
        }

        mainmenu();
        
    }
    public void mainmenu(){
       
        System.out.println("1. press one to calculate area of rectangle");
        System.out.println("2. press two to calculate area of cicle");
        System.out.println("3. press three to calculate area of triangle");
        System.out.println("4. press four to calculate area of parallelogram");
        
        int ch = sc.nextInt();
        switch(ch){
            case 1:
                this.rectangleArea();
                break;
            case 2:
          this.circleArea();
            break;
            case 3:
          this.triangleArea();
            break;
            case 4:
          this.parallelogramArea();
            break;
            default : System.out.println("Wrong choice");
        }
    }

    public void rectangleArea(){
        this.area = l*w;
        System.out.println("Area of rectange is "+area);
    }
    public void circleArea(){
        this.area = (float)3.14*r*r;
        System.out.println("Area of circle is "+area);
    }
    public void triangleArea(){
        this.area = (l*w)/2;
        System.out.println("Area of triangle is "+area);
    }
    public void parallelogramArea(){
        this.area = (l*w);
        System.out.println("Area of parallelogram is "+area);
    }
public static void main(String[] args) {
    Area a = new Area();
}
}