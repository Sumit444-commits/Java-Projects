import java.util.ArrayList;

class Continent{
    String conName;
    Country co;
    City c;
    ArrayList<Country> countryList =new ArrayList<Country>();
    Continent(Country country,String conName){
        countryList.add(country);
        this.co=country;
        this.conName=conName;
    }
    // void setCountry(){

    // }

    Country getCoun(){
        return co;
    }
    public String getContenientName(){
        return this.conName;
    }

    void display(){
        System.out.println("Continent "+getContenientName());
        System.out.println("Country : "+co.get());
        System.out.println("City : "+co.displayCity());
    }
}
class Country{
    City c;
    String name;
    ArrayList<City> cityList =new ArrayList<City>();
    Country(City c,String na){
        cityList.add(c);
        name =na;
    }
    String get(){
        return  name;
    }
    City getCo(){
        return c;
    }
  public  void displayCity(){
        System.out.println(c.getCity());
    }
}
class City{

    String Cname;

    City(String Cname){

        this.Cname=Cname;
    }
    String getCity(){
        return this.Cname;
    }



}
public class Main{
    public static void main(String[] args) {
//          Continent asia =new Continent(new Country(new City("hyd"),"pakistan"),"Asia");
//         //  Country coun = asia.getCoun();
// //         City co=asia.getCo();

        Continent asia =new Continent(new Country(new City("Hyderabad"), "Pakistan"), "Asia");
    asia.display();
    }
}