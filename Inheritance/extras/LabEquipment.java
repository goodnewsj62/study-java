public abstract class LabEquipment{
    private String manufacturer; 
    private String model;
    private int year; 
    public static final int  MIN_YEAR =  1950;

    public LabEquipment( String manufacturer, String model,  int year){
        setManufacturer(manufacturer);
        setModel(model);
        setYear(year);
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        stringCheck(manufacturer, "Manufawcturer cannot be null or empty");
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        stringCheck(model, "Model cannot be null or empty");
        this.model = model;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        if( year <  MIN_YEAR){
            throw new IllegalArgumentException("Year must be greater than" +  MIN_YEAR);
        }
        this.year = year;
    }
    


    public static void stringCheck(String str,  String message ){
        message =  message ==  null?  "empty string or null is not accepted " :  message;
        if( str ==  null || str.isBlank()){
            throw new IllegalArgumentException(message);
        }
    }


    public abstract String performMaintenance();
}