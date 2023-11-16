public class Demo {
    public static void main(String[] args) {
        String[] countryNAme = {"Pakistan","India"};
        String[] cityNAme = {"Hyderabad","Tandojam","Jaipur","Karachi","Mumbai"};

        Continent asia = new Continent(countryNAme,cityNAme,"asia");

        asia.enrollCountry(asia.getCountry("Pakistan"), asia.getCity("Hyderabad"));
        asia.enrollCountry(asia.getCountry("India"), asia.getCity("Jaipur"));
        asia.enrollCountry(asia.getCountry("India"), asia.getCity("Mumbai"));
        asia.enrollCountry(asia.getCountry("Pakistan"), asia.getCity("Tandojam"));
        asia.enrollCountry(asia.getCountry("Pakistan"), asia.getCity("Karachi"));

        asia.display();
        // System.out.println(asia.searchCity("Hyderab"));

    }
}
