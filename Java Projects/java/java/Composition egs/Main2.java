import java.lang.reflect.Array;
import java.util.ArrayList;

class Employee{
private String name;
// private ArrayList<AdressInfo> adressList =new ArrayList<AdressInfo>();
private AdressInfo a;
private ArrayList<InsurranceInfo> insuranceList =new ArrayList<InsurranceInfo>();

Employee(String name,String street,String city, String state,String postalcode){
    this.name = name;
    AdressInfo a = new AdressInfo();
    a.setStreet(street);
    a.setcity(city);
    a.setstate(state);
    a.setpostalcode(postalcode);
    this.a=a;
}

 String getName(){
    return name;
 }

void display(){
    System.out.println("Employee name : "+this.getName());
    // System.out.println("Adress : "+adressList.get(0).getStreet()+" "+adressList.get(0).getcity()+" "+adressList.get(0).getstate()+" "+adressList.get(0).getpostalcode());
    System.out.println(a.getStreet()+" "+a.getcity()+" "+a.getstate()+" "+a.getpostalcode());
}

}

class AdressInfo{
private String street;
private String city;
private String state;
private String postalcode;
 void setStreet(String street){
    this.street =street;
 }
 void setcity(String city){
    this.city =city;
 }
 void setstate(String state){
    this.state =state;
 }
 void setpostalcode(String postalcode){
    this.postalcode =postalcode;
 }
 String getStreet(){
    return street;
 }
 String getstate(){
    return state;
 }
 String getcity(){
    return city;
 }
 String getpostalcode(){
    return postalcode;
 }

}

class InsurranceInfo{
private String policyName;
private String policyId;

}



public class Main2 {
    public static void main(String[] args) {
        Employee e =new Employee("sumit", "wahduwah", "Hyderabad", "Sindh", "71000");
        InsurranceInfo i = new InsurranceInfo();
        e.display();
    }
}
