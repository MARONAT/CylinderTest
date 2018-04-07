package cylindertest;

public class Circle extends Point {// the begining of circle class
    private double r;
    
    public Circle(int xValue, int yValue, double radius) {
        super(xValue, yValue);
        setRadius(radius);}

    public void setRadius(double radius) {
     r = (radius <0.0 ? 0.0 : radius);  }
    
    public double getRadius(){return r;}

    public double getDiameter(){ return 2 * getRadius();}
    
    public double getCircumference(){ return Math.PI * getDiameter();}
    
    public double getArea(){ return Math.PI * getRadius() *getRadius(); }
    
    @Override
    public String toString () { return "Center = " + super.toString() + "; Radius = " + getRadius();}
    
    
}//class circlr End
