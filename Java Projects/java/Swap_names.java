
class Student{
    int age;
    String name;
    public void swap_names(Student obj1, Student obj2){
        String temp = this.name;
        this.name = obj1.name;
        obj1.name = obj2.name;
        obj2.name = temp;
    }
public void display(){
    System.out.println("Name = "+this.name);
}
}

public class Swap_names {
    public static void main(String[] args) {
        Student S1 = new Student();
        Student S2 = new Student();
        Student S3 = new Student();
        S1.name = "Sumit";
        S2.name = "Sharma";
        S3.name = "Love";
        S1.display();
        S2.display();
        S3.display();
        System.out.println("After swap");

        S1.swap_names(S2, S3);
        S1.display();
        S2.display();
        S3.display();
        // S2 = S1;
        // System.out.println(S2.name);
        // S2.name= "alpha";
        // System.out.println(S1.name);

    }
}
