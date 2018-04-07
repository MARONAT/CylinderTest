
package cylindertest;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;


public class CylinderTest {
    public static void main(String[] args){
        
        
        Cylinder c1 = new Cylinder (12, 23, 2.5, 5.7);
        String output = "X coordinate is" + c1.getX() +
                "\n Y coordinate is" + c1.getY() + "\n Radius is:" + 
                c1.getRadius() + "\n Height is :" + c1.getHeight();
        c1.setX(35);
        c1.setY(20);
        c1.setRadius(4.25);
        c1.setHeight(10.75);
        //new output
        output+= "\n \n The new Location ,Radius and height of cylinder are:" + c1.toString();
        
        DecimalFormat twoDigits = new DecimalFormat( "0.00" );
        output +="\n \n Diameter is " + twoDigits.format(c1.getDiameter());
        output += "\n \n Circumference is" +twoDigits.format(c1.getCircumference());
        output += "\n \n Area is" +twoDigits.format(c1.getArea());
        output += "\n \n Volume is" +twoDigits.format(c1.getVolume());
        JOptionPane.showMessageDialog(null, output);
    //new cylinder c2
        Cylinder c2 = new Cylinder (10, 20, 42.5, 85.5);
        String output2 = "X coordinate is" + c2.getX() + "\n Y coordinate is" + 
                c2.getY() + "\n Radius is:" + c2.getRadius() + 
                "\n Height is :" + c2.getHeight();
        JOptionPane.showMessageDialog(null, output2);
    
    
    
    }//end main
    
}//end class
