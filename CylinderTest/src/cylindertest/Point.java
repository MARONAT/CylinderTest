
package cylindertest;

public class Point {
    private int x;
    private int y;
    
    
    
    
public Point (int xValue, int yValue){
 x = xValue;
 y = yValue;}




public void setX(int xValue){
  x = xValue;  }


public int getX(){
return x;}


public void setY(int yValue){
  y = yValue;  }


public int getY(){
return y;}



    @Override
    public String toString(){
return "[" + getX() +"," + getY() +"]";}
}//Class end
