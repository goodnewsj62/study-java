package shape;
import static java.lang.Math.PI;

public class Sphere  extends Shape {

    public Sphere(double radius){
        super(radius);
    }   


    public double getVolume(){
        return (4/3)  *  (PI *  Math.pow(this.getRadius(),  3));
    }


    public double getArea(){
        return 4  *  (PI *  Math.pow(this.getRadius(),  2));
    }
}