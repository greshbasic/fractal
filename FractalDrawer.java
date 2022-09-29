// FractalDrawer class draws a fractal of a shape indicated by user input
import java.awt.Color;
import java.util.Scanner;


public class FractalDrawer {
    private double totalArea=0;  // member variable for tracking the total area

    public FractalDrawer() {}  // contructor


    //TODO:
    // drawFractal creates a new Canvas object
    // and determines which shapes to draw a fractal by calling appropriate helper function
    // drawFractal returns the area of the fractal
    public double drawFractal(String type) {
        Canvas drawing = new Canvas(800,800); 
        if (type.equals("Triangle")){
            drawTriangleFractal(250,200,300,200,Color.BLUE, drawing, 0);
        }

        if (type.equals("Rectangle")){
            drawRectangleFractal(250,250,300,200,Color.BLUE, drawing, 0);
        }

        if (type.equals("Circle")){
            drawCircleFractal(100,400,400,Color.BLUE, drawing, 0);
        }
        return totalArea;
    }


    //TODO:
    // drawTriangleFractal draws a triangle fractal using recursive techniques
    public void drawTriangleFractal(double width, double height, double x, double y, Color c, Canvas can, int level){
        if (c.equals(Color.BLUE)){
             c = Color.RED;
        }else if (c.equals(Color.RED)){
            c = Color.GREEN;
        }else if (c.equals(Color.GREEN)){
            c = Color.BLUE;
        }
        Triangle myTriangleA = new Triangle((x-0.25*width),(y-0.5*height),0.5 * width, 0.5 * height);
        myTriangleA.setColor(c);
        can.drawShape(myTriangleA);

        Triangle myTriangleB = new Triangle((x+0.75*width),(y-0.5*height),0.5 * width, 0.5 * height);
        myTriangleB.setColor(c);
        can.drawShape(myTriangleB);

        Triangle myTriangleC = new Triangle((x+0.25*width),(y+0.5*height),0.5 * width, 0.5 * height);
        myTriangleC.setColor(c);
        can.drawShape(myTriangleC);

        totalArea += (myTriangleA.calculateArea() * 3);
        
        if (level < 7){
        // for triangle A:
        drawTriangleFractal(width/2,height/2,(x-0.25*width),(y-0.5*height),c,can, level + 1);
        // for triangle B:
        drawTriangleFractal(width/2,height/2,(x+0.75*width),(y-0.5*height),c,can, level + 1);
        // for triangle C:
        drawTriangleFractal(width/2,height/2,(x+0.25*width),(y+0.5*height),c,can, level + 1);
        }
    }


    // TODO:
    // drawCircleFractal draws a circle fractal using recursive techniques
    public void drawCircleFractal(double radius, double x, double y, Color c, Canvas can, int level) {
        if (c.equals(Color.BLUE)){
            c = Color.RED;
        }else if (c.equals(Color.RED)){
            c = Color.GREEN;
        }else if (c.equals(Color.GREEN)){
            c = Color.BLUE;
        }

        
        Circle myCircle1 = new Circle(x+radius,y,radius);
        Circle myCircle2 = new Circle(x-radius,y,radius);
        Circle myCircle3 = new Circle(x,y+radius,radius);
        Circle myCircle4 = new Circle(x,y-radius,radius);

        myCircle1.setColor(c);
        myCircle2.setColor(c);
        myCircle3.setColor(c);
        myCircle4.setColor(c);

        can.drawShape(myCircle1);
        can.drawShape(myCircle2);
        can.drawShape(myCircle3);
        can.drawShape(myCircle4);

        totalArea += (myCircle1.calculateArea() * 4);

        if (level < 7){
            drawCircleFractal(radius/2, x-radius, y,c,can,level +1);
            drawCircleFractal(radius/2, x+radius, y,c,can,level +1);
            drawCircleFractal(radius/2, x, y+radius,c,can,level +1);
            drawCircleFractal(radius/2, x, y-radius,c,can,level +1);
        }
    }


    //TODO:
    // drawRectangleFractal draws a rectangle fractal using recursive techniques
    public void drawRectangleFractal(double width, double height, double x, double y, Color c, Canvas can, int level) {
        
        if (c.equals(Color.BLUE)){
            c = Color.RED;
        }else if (c.equals(Color.RED)){
            c = Color.GREEN;
        }else if (c.equals(Color.GREEN)){
            c = Color.BLUE;
        }
        
        Rectangle myRectangle1 = new Rectangle((x-0.25*width),(y+0.75*height),height/2,width/2);
        myRectangle1.setColor(c);
        can.drawShape(myRectangle1);

        Rectangle myRectangle2 = new Rectangle((x+0.75*width),(y+0.75*height),height/2,width/2);
        myRectangle1.setColor(c);
        can.drawShape(myRectangle2);

        Rectangle myRectangle3 = new Rectangle((x-0.25*width),(y-0.25*height),height/2,width/2);
        myRectangle1.setColor(c);
        can.drawShape(myRectangle3);

        Rectangle myRectangle4 = new Rectangle((x+0.75*width),(y-0.25*height),height/2,width/2);
        myRectangle1.setColor(c);
        can.drawShape(myRectangle4);

        totalArea += (myRectangle1.calculateArea() * 4);


        if (level < 7){
            drawRectangleFractal(width/2, height/2, (x-0.25*width), (y+0.75*height), c, can, level + 1);

            drawRectangleFractal(width/2, height/2, (x+0.75*width), (y+0.75*height), c, can, level + 1);

            drawRectangleFractal(width/2, height/2, (x-0.25*width), (y-0.25*height), c, can, level + 1);

            drawRectangleFractal(width/2, height/2, (x+0.75*width), (y-0.25*height), c, can, level + 1);
        }
    
    }

    //TODO:
    // main should ask user for shape input, and then draw the corresponding fractal.
    // should print area of fractal
    public static void main(String[] args){
        FractalDrawer fractal = new FractalDrawer();
        System.out.println("Please select a shape - Circle, Triangle, or Rectangle: ");
        Scanner shapeScanner = new Scanner(System.in);
        String shape = shapeScanner.nextLine();
        fractal.drawFractal(shape);
        System.out.println(fractal.totalArea);
        
        }
    }

