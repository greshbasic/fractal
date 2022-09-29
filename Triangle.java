import java.awt.Color;
import java.lang.Math;

public class Triangle {
    private double xPos;
    private double yPos;
    private double width;
    private double height;
    private Color color;

    public Triangle(double initXPos, double initYPos, double initWidth, double initHeight){
        this.xPos = initXPos;
        this.yPos = initYPos;
        this.width = initWidth;
        this.height = initHeight;
    }

    public static void main(String[] args){
        Triangle myTriangle = new Triangle(5,5,20,30);
        myTriangle.calculatePerimeter();
    }

    public double calculatePerimeter(){
        double aSquared = (width/2) * (width/2);
        double bSquared = height * height;
        double c = Math.sqrt(aSquared + bSquared);
        double perimeter = width + (2 * c);
        return perimeter;
    }

    public double calculateArea(){
        return 0.5 * width * height;
    }
    
    public void setColor(Color newColor){
        color = newColor;
    }

    public void setPos(double newXPos, double newYPos){
        xPos = newXPos;
        yPos = newYPos;
    }

    public void setHeight(double newHeight){
        height = newHeight;
    }

    public void setWidth(double newWidth){
        width = newWidth;
    }

    public Color getColor(){
        return color;
    }

    public double getXPos(){
        return xPos;
    }

    public double getYPos(){
        return yPos;

    }

    public double getHeight(){
        return height;
    }

    public double getWidth(){
        return width;
    }
}



