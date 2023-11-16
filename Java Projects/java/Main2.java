import java.util.*;

class Student{

    private String sname;

    private Department dept;

    public Student(String sname){

        this.sname=sname;

    }
        public String getSname(){

        return this.sname;
        }

       public void setdept(Department d) {
           dept = d;

       }
}

class Department{

    String dname;

    ArrayList<Student> students=new ArrayList<Student>();


    Department(String dname){
        this.dname=dname;

    }

    public String getDname(){
        return this.dname;

    }

    public void add_Students(Student s){

        students.add(s);

    }

   public void displayStudents(){

        for(Student student:this.students){
            System.out.println(student.getSname());

        }


   }



}


class University{

    String name;

    ArrayList<Student> students=new ArrayList<Student>();

    ArrayList<Department> depart=new ArrayList<Department>();


 University(String[] sname,String[] dname){

      for(int i=0;i< sname.length;i++){

          students.add(new Student(sname[i]));
      }
      for(int i=0;i<dname.length;i++){

          depart.add(new Department(dname[i]));
      }

    }






Student getStudent(String skey){

     for(int i=0;i< students.size();i++){

         if(students.get(i).getSname().equals(skey));

         return students.get(i);
     }
     return null;
}


public void enrollin(Department d,Student s){

     s.setdept(d);
     d.add_Students(s);


}

public void display(){

     for(int i=0;i< depart.size();i++){

         System.out.println("Department"+depart.get(i).getDname());
     }

    for(int i=0;i< students.size();i++){

        System.out.println("Students"+students.get(i).getSname());
    }
}


}
public class Main2 {
    public static void main(String[] args){

        String[] names={"ahmed","uzair","waqar","shadab"};
        String[] dept={"SW","civil","mechanical","industrial"};


        University muet =new University(names,dept);

        muet.enrollin(muet.getDepartment("SW"),muet.getStudent("ahmed"));

        muet.display();


    }


}