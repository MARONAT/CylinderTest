package cylindertest;

public class Cylinder extends Circle {
    private double h; //height varriable
public Cylinder (int xValue, int yValue, double radius, double height){ 
    super(xValue, yValue, radius);
    setHeight(height);}
    
    
    public void setHeight (double height){ h = (height < 0.0 ?0.0 : height);}
    public double getHeight(){return h;}

    
    
    /**
     *
     * @return
     */
    @Override
    public double getArea(){return 2 * super.getArea() + getCircumference() * getHeight();}
    public double getVolume(){return super.getArea() * getHeight();}
    @Override
    public String toString(){return super.toString() + "; Height = " + getHeight();}
    

}//End of culinder class

