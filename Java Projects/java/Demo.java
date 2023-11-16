import java.util.*;


class University{
    private String uname;
    private ArrayList<Student> studentlist =new ArrayList<Student>();
    private ArrayList<Department> departmentlist =new ArrayList<Department>();

    public University(String[] sname, String[] dname){
        for(int i=0;i<sname.length;i++){
            studentlist.add(new Student(sname[i]));
        }
        for(int i=0;i<dname.length;i++){
            departmentlist.add(new Department(dname[i]));
        }
    }
    public Department getDepartment(String dkey){
        for(int i=0;i<departmentlist.size();i++){
            if(departmentlist.get(i).getDname().equals(dkey))
                return departmentlist.get(i);
      }
                return null;

        }

    public Student getStudent(String skey){
        for(int i=0;i<studentlist.size();i++){
            if(studentlist.get(i).getSname().equals(skey))
                return studentlist.get(i);
            }
                return null;

    }
    
    public void enrollsIn(Department d,Student s){
        s.setDept(d);
        d.addStudents(s);
}

    public void display(){
        // for(int i=0;i<departmentlist.size();i++){
        //     System.out.println("Department : " + departmentlist.get(i).getDname());
        // }
        System.out.println("Department : " + departmentlist.get(0).getDname());
        departmentlist.get(0).display();
            // for(int i=0;i<studentlist.size();i++){
            //     System.out.println("Student name : " + studentlist.get(i).getSname());
            // }
        }
}

class Student{
    private String sname;
    private Department dept;

    public Student(String sname){
        this.sname = sname;
    }
    public String getSname(){
        return this.sname;
    }
    public void setDept(Department d){
        dept = d;
    }
}



class Department{
private String dname;
private ArrayList<Student> student = new ArrayList<Student>();

public Department(String dname){
    this.dname =dname;
}

public String getDname(){
    return dname;
}
public void addStudents(Student s){
    student.add(s);
}
public void display(){
    for(int i=0;i<student.size();i++){
        System.out.println(student.get(i).getSname());
    }
}
}



public class Demo {
    public static void main(String[] args) {
        String[] names ={"Ahmed","Gohor","Zulfi"};
        String[] dept ={"CS","Software"};

        University muet =new University(names, dept);
        muet.enrollsIn(muet.getDepartment("CS"),muet.getStudent("Ahmed"));
        muet.enrollsIn(muet.getDepartment("Software"),muet.getStudent("Gohor"));
        muet.enrollsIn(muet.getDepartment("CS"),muet.getStudent(names[2]));

        muet.display();

    //     String[] nednames ={"Ahmed","Gohor","Zulfi","Kamran","Parkash","Ali","Faizan","Uzair","Sumit","Sharma"};
    //     String[] neddept ={"CS","Software","Mechanical","Electrical"};

    //     University ned =new University(nednames, neddept);
    //     ned.enrollsIn(ned.getDepartment(neddept[0]),ned.getStudent(nednames[0]));
    //     ned.enrollsIn(ned.getDepartment(neddept[1]),ned.getStudent("Faizan"));
    //     ned.enrollsIn(ned.getDepartment(neddept[2]),ned.getStudent(nednames[2]));
    //     ned.enrollsIn(ned.getDepartment(neddept[3]),ned.getStudent(nednames[3]));
    //     ned.enrollsIn(ned.getDepartment(neddept[0]),ned.getStudent(nednames[4]));
    //     ned.enrollsIn(ned.getDepartment(neddept[1]),ned.getStudent(nednames[5]));
    //     ned.enrollsIn(ned.getDepartment(neddept[2]),ned.getStudent(nednames[6]));
    //     ned.enrollsIn(ned.getDepartment(neddept[3]),ned.getStudent(nednames[7]));
    //     ned.enrollsIn(ned.getDepartment(neddept[0]),ned.getStudent(nednames[8]));
    //     ned.enrollsIn(ned.getDepartment(neddept[1]),ned.getStudent(nednames[9]));
        
    //    ned.display();




    //     String[] questnames ={"Ahmed","Gohor","Zulfi","Kamran","Parkash","Ali","Faizan","Uzair","Sumit","Sharma"};
    //     String[] questdept ={"CS","Software","Mechanical","Electrical"};

    //     University quest =new University(questdept, questdept);
    //     quest.enrollsIn(quest.getDepartment(questdept[0]),quest.getStudent(questnames[0]));
    //     quest.enrollsIn(quest.getDepartment(questdept[1]),quest.getStudent(questnames[1]));
    //     quest.enrollsIn(quest.getDepartment(questdept[2]),quest.getStudent(questnames[2]));
    //     quest.enrollsIn(quest.getDepartment(questdept[3]),quest.getStudent(questnames[3]));
    //     quest.enrollsIn(quest.getDepartment(questdept[0]),quest.getStudent(questnames[4]));
    //     quest.enrollsIn(quest.getDepartment(questdept[1]),quest.getStudent(questnames[5]));
    //     quest.enrollsIn(quest.getDepartment(questdept[2]),quest.getStudent(questnames[6]));
    //     quest.enrollsIn(quest.getDepartment(questdept[3]),quest.getStudent(questnames[7]));
    //     quest.enrollsIn(quest.getDepartment(questdept[0]),quest.getStudent(questnames[8]));
    //     quest.enrollsIn(quest.getDepartment(questdept[1]),quest.getStudent(questnames[9]));
        
    //    quest.display();

    
    }
    }
