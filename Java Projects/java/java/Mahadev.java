import java.util.ArrayList;

class Continent {
    private String cName;
    private long area;
    private long pop;
    private ArrayList<Country> countrylist = new ArrayList<Country>();

    Continent(String[] cityName, String[] countryName, String con_Name) {
      
        this.cName = con_Name;
        for (int i = 0; i < countryName.length; i++) {
            this.countrylist.add(new Country(countryName[i], cityName));
        }
       
    }

    public void total_population() {
        for (Country c : countrylist) {
            pop += c.getpopulation();
        }
    }

    public long getTotalPopulation() {
        return this.pop;
    }

    public void addCountry(Country c) {
        countrylist.add(c);
    }

    public boolean search(String name) {
        for (Country c : countrylist) {

            if (c.searchcity(name)) {
                return true;
            }
        }
        return false;
    }

    public void display() {
        System.out.println("Continent name " + this.cName);
        for (int i = 0; i < countrylist.size(); i++) {
            System.out.println("Country name " + this.countrylist.get(i).getName());
            for (int j = 0; j < countrylist.get(i).getCities().size(); j++) {
                System.out.println("City name " + this.countrylist.get(i).getCities().get(j).getCityname());
            }
        }
    }
}

class Country {
    private String con_name;
    private long popul;
    private ArrayList<City> citylist = new ArrayList<City>();
    private Continent cont;
    private City capital;

    Country(String name, String[] cityname) {
        // citylist.add(c);
        this.con_name = name;

        for (int i = 0; i < cityname.length; i++) {
            addcit(new City(cityname[i]));
        }
    }

    public void addcit(City c) {
        citylist.add(c);
    }

    public void setpop(long popul) {
        this.popul = popul;

    }

    public long getpopulation() {
        return popul;
    }

    public void setname(String con_name) {
        this.con_name = con_name;

    }

    public String getName() {
        return this.con_name;
    }

    public void setCapital(City c) {
        this.capital = c;

    }

    public City getCapital() {
        return this.capital;
    }

    public void setCity(City c) {
        this.citylist.add(c);

    }

    public ArrayList<City> getCities() {
        return citylist;
    }

    public void setContinent(Continent c) {
        this.cont = c;

    }

    public Continent getContinent() {
        return cont;
    }

    public boolean searchcity(String name) {
        for (City city : citylist) {
            if (city.getCityname().equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }

}

class City {
    private String cityName;
    private Country count_name;

    public City(String cityname) {
        this.cityName = cityname;
    }

    public String getCityname() {
        return this.cityName;
    }

}

public class Mahadev {
    public static void main(String[] args) {

        String[] countrynames = { "pakistan", "India" };
        String[] citynames = { "Hyderabad", "tandojam", "Karachi", "Bombay" };

        Continent con = new Continent(citynames, countrynames, "asia");
        con.display();

        System.out.println(con.search("Hyderabad"));
        System.out.println(con.search("Hyd"));

    }
}