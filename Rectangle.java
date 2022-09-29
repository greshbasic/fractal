import java.awt.Color;
public class Rectangle {
    private double xPos;
    private double yPos;
    private double width;
    private double height;
    private Color color;

    public Rectangle(double initXPos, double initYPos, double initHeight, double initWidth){
        this.xPos = initXPos;
        this.yPos = initYPos;
        this.height = initHeight;
        this.width = initWidth;
    }

    public double calculatePerimeter(){
        return (2*height) + (2*width);
    }

    public double calculateArea(){
        return height * width;
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