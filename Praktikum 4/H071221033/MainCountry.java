// live coding
class Country {
    String name;
    String capital;
    String headOFState;
    String population;
    String language;

    // constructor 1 tanpa parameter
    Country() {
    }
    
    // constructor 2 parameter atribut
    Country(String name, String capital, String headOFState, String population, String language) {
        this. name = name;
        this.capital = capital;
        this.headOFState = headOFState;
        this.population = population;
        this.language = language;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setCapital(String capital) {
        this.capital = capital;
    }
    public void setHeadOFState(String headOFState) {
        this.headOFState = headOFState;
    }
    public void setPopulation(String population) {
        this.population = population;
    }
    public void setLanguage(String language) {
        this.language = language;
    }
    public String getName() {
        return name;
    }
    public String getCapital() {
        return capital;
    }
    public String getHeadOFState() {
        return headOFState;
    }
    public String getPopulation() {
        return population;
    }
    public String getLanguage() {
        return language;
    }

    public void displayInfo() {
        System.out.println("Country         = " + name);
        System.out.println("Capital         = " + capital);
        System.out.println("Head of State   = " + headOFState);
        System.out.println("Population      = " + population);
        System.out.println("Language        = " + language);
    }
}


public class MainCountry {
    public static void main(String[] args) {

        // instance objek
        Country country1 = new Country();
        country1.setName("Indonesia");
        country1.setCapital("DKI Jakarta");
        country1.setHeadOFState("Jokowi");
        country1.setPopulation("234567");
        country1.setLanguage("Bahasa Indonesia");

        country1.displayInfo();

        Country country2 = new Country("Wakanda", "Capital of wakanda", "T'Challa", "12345", "African");
        country2.getName();
        country2.getCapital();
        country2.getHeadOFState();
        country2.getPopulation();
        country2.getLanguage();

        // memanggil method displaySelfData() dari class SelfUtils
        SelfUtils.displaySelfData();
    }
}
