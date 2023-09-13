import java.util.HashMap;

public class CityPopulationTraker {
    private HashMap<String,  City> cityPopulations;

    public CityPopulationTraker(){
        cityPopulations =  new HashMap<>();
    }


    public City getCity(String name){
        City city = new City(this.cityPopulations.get(name));
        return city;
    }

    public void setCity(City city){
        city =  new City(city);
        cityPopulations.put(city.getName(),city);
    }
    
    public void addCity(City city){
        city =  new City(city);
        cityPopulations.put(city.getName(),city);
    }

}
