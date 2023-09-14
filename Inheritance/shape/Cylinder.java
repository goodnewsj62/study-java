package shape;
import static java.lang.Math.PI;

public class Cylinder extends Shape{

    private double height;

    public Cylinder(double height,  double radius ){
        super(radius);
        this.height =  height;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea(){
        
        return 2 * (PI *  Math.pow(this.getRadius(), 2)) +  2 * (PI *  this.getRadius()) *  height;
    }

    @Override
    public double getVolume(){
        return (PI *  Math.pow(this.getRadius(), 2) ) *  this.height;
    }

}