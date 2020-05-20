/**
 * Class Rectangle creates and draws rectangles.
 *
 * @author Jonah Broyer
 * @version 05/19/2020
 */
public class Rectangle extends Shape
{
    private double length;
    private double width;

    /**
     * Constructor for objects of class Rectangle
     */
    public Rectangle(double length, double width)
    {
        setType("Rectangle");
        this.length = length;
        this.width = width;
        setArea(length * width);
        setPerimeter(2 * (length + width));
    }
   
    /**
     * Get the length of a Rectangle.
     */
    public double getLength()
    {
        return length;
    }
    
    /**
     * Get the width of a Rectangle.
     */
    public double getWidth()
    {
        return width;
    }    
    
    /**
     * Draw a rectangle.
     */
    @Override
    public void draw()
    {
        System.out.println("Drawing " + getType() + " rectangleTest");
    }
    
    /**
     * toString method.
     */
    @Override
    public String toString()
    {
        return super.toString() + "\tlength: " + getLength() + "\n" +
            "\twidth: " + getWidth() + "\n";
    }    
}