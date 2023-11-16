public class City {
     String cityName;
    Country countryname;

    City(String cName){
        this.cityName =cName;
    }
    String getCityName(){
        return cityName;
    }

    void setCountry(Country c){
        this.countryname = c;
    }

}
