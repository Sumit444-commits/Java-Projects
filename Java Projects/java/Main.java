import java.util.*;
class City{
   private String name;
   private int population;
   public City(String name,int poupulation){
       this.name =name;
       this.population=poupulation;
   }
   public String getName(){
       return name;
   }
   public int getPopulation(){
       return population;
   }
}




 class Country{
  private  String country_name;
  private City capital;
 private  ArrayList<City> city =new ArrayList<City>();
   public Country(String name,ArrayList<City> c){
    this.country_name=name;
    this.city=c;
   }
   public void capitalCity(City cp){
    city.add(cp);
    this.capital =cp;
   }
   public String getName(){
       return country_name;
   }
   public City getCapital(){
       return capital;
   }
   public ArrayList<City> getCity(){
       return city;
   }
 }


public class Main {
 public static void main(String[] args) {
    ArrayList<City> cities =new ArrayList<City>();
    cities.add(new City("City A",10000));
    cities.add(new City("City B",20000));
    cities.add(new City("City C",30000));
    Country country =new Country("My Country", cities);
    country.capitalCity(new City("City Capital",500000));
    System.out.println("Country : "+country.getName());
    System.out.println("Cities in : "+country.getName()+" : "); 
    for(City city:country.getCity()){
        if(city!=country.getCapital()){
        System.out.println("- "+city.getName()+", Population : "+city.getPopulation());
        }
        else {
        System.out.println("- "+city.getName()+", Population : "+city.getPopulation());
        }
    }
 }   
}
