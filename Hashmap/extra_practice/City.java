public class City{
    private String name;  
    private String country;
    private long population;

    public City(String name,  String country, long population){
        setCountry(country);
        setName(name);
        setPopulation(population);
    }


    public City(City source){
        this.name =  source.name;
        this.country = source.country;
        this.population =  source.population;
    }


    public String getName(){
        return this.name;
    }

    public String getCountry(){
        return this.country;
    }

    public long getPopulation(){
        return this.population;
    }


    public void setName(String name){
        performCheck(name);
        this.name =  name;
    }
    
    public void setCountry(String country){
        performCheck(country);
        this.country =  country;
    }

    public void setPopulation(long num){
        if(num < 1){
            throw new IllegalArgumentException("Population must be greater than 0");
        }
        this.population  =  num;  
    }

    private static void performCheck(String arg){
        if(arg == null ||  arg.isEmpty()){
            throw new IllegalArgumentException("This field cannot be null or left blank");
        }
    }
}