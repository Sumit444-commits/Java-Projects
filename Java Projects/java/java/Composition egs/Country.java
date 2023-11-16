import java.util.ArrayList;

public class Country {
    String countryName;
    ArrayList <City> cityList = new ArrayList<>();
    Continent continent;

    Country(String countryName,String[] cityNames){
        this.countryName = countryName;
        for(int i=0;i<cityNames.length;i++){
            cityList.add(new City(cityNames[i]));
        }
    }
    City getCity(String citykey){
        for(int i=0;i<cityList.size();i++){
            if(cityList.get(i).getCityName().equalsIgnoreCase(citykey)){
                return cityList.get(i);
            }
        }
        return null;
    }

    void setCity(City c){
        cityList.add(c);
    }

    String getcountryName(){
        return this.countryName;
    }

    void setCountient(Continent con){
        this.continent = con;
        }
        Continent getContinent(){
            return continent;
        }

        void displaycity(){
            for(int i=0;i<cityList.size();i++){
                System.out.println("City : "+cityList.get(i).getCityName());
            }
        }


        boolean search(String cityName){
            for(int i=0;i<cityList.size();i++){
                if(cityList.get(i).getCityName().equalsIgnoreCase(cityName)){
                    return true;
                }
            }
            return false;
        }

}
