import java.awt.Color;
public class Circle {
    private double xPos;
    private double yPos;
    private double radius;
    private Color color;

    public Circle(double initXPos, double initYPos, double initRadius){
        this.xPos = initXPos;
        this.yPos = initYPos;
        this.radius = initRadius;
    }


    public static void main(String[] args){
        Circle myCircle = new Circle(5,10,3);
        myCircle.setColor(Color.BLUE);
        myCircle.getColor();
    }

    public double calculatePerimeter(){
        return(2 * 3.14 * radius);
    }

    public double calculateArea(){
        return(3.14 * radius * radius);
    }


    public void setColor(Color newColor){
        color = newColor;
    }

    public void setPos(double newXPos, double newYPos){
        xPos = newXPos;
        yPos = newYPos;
    }

    public void setRadius(double newRadius){
        radius = newRadius;
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

    public double getRadius(){
        return radius;
    }
}
