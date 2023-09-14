public class Microscope extends  LabEquipment{
    private int magnification;  
    private static final int MIN_ZOOM =  1;

    public Microscope(String manufacturer, String model,  int year, int magnification){
        super(manufacturer, model, year);
        this.magnification =  magnification;
    }
    public int getMagnification() {
        return this.magnification;
    }

    public void setMagnification(int magnification) {
        if(magnification < MIN_ZOOM){
            throw new IllegalArgumentException("You cannot go below the value of 1");
        }
        this.magnification = magnification;
    }

    @Override
    public String performMaintenance(){
        return  "Microscope maintenance:  Clean the lenses and check the light source.";
    }
    
}
