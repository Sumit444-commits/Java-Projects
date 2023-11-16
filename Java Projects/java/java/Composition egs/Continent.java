import java.lang.reflect.Array;
import java.util.ArrayList;

public class Continent {
    String continentName;
    ArrayList <Country> countryList = new ArrayList<>();

    Continent(String[] countryName,String[] cityName,String conName){
        for(int i=0;i<countryName.length;i++){
            countryList.add(new Country(countryName[i],cityName));
        
        }
        this.continentName= conName;
    }

    Country getCountry(String countkey){
        for(int i=0;i<countryList.size();i++){
            if(countryList.get(i).getcountryName().equalsIgnoreCase(countkey)){
                return countryList.get(i);
            }
        }
        return null;
    }
     City getCity(String citykey){
        for(int i=0;i<countryList.size();i++){
            if(countryList.get(i).getCity(citykey)!=null){
                return countryList.get(i).getCity(citykey);
            }
        }
        return null;
     }

    void enrollCountry(Country count,City city){
        count.setCity(city);
        city.setCountry(count);
    }

    void display(){
        // System.out.println("Country : "+ countryList.get(0).getcountryName());
        // countryList.get(0).displaycity();
        // // System.out.println("Country : "+ countryList.get(1).getcountryName());
        // // countryList.get(1).displaycity();
        for(int i=0;i<countryList.size();i++){
        System.out.println("Country : "+ countryList.get(i).getcountryName());
       
        }
        for(int i=0;i<countryList.size();i++){
       countryList.get(i).displaycity();
       
        }

    }

    boolean searchCity(String cityname){
        for(int i=0;i<countryList.size();i++){
            if(countryList.get(i).search(cityname)==true){
                return true;
            }
        }
        return false;
    }

    
}
