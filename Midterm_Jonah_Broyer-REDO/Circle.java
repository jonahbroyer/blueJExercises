/**
 * Class Circle creates and draws circles.
 *
 * @author Jonah Broyer
 * @version 05/19/2020
 */
public class Circle extends Shape
{
    private double radius;

    /**
     * Constructor for objects of class Circle
     */
    public Circle(double radius)
    {
        setType("Circle");
        this.radius = radius;
        setArea(Math.PI * radius * radius);
        setPerimeter(2 * Math.PI * radius);
    }
   
    /**
     * Get the radius of a circle.
     */
    public double getRadius()
    {
        return radius;
    }
    
    /**
     * Draw a circle.
     */
    @Override
    public void draw()
    {
        System.out.println("Drawing " + getType() + " circleTest");
    }

    /**
     * toString method.
     */
    @Override
    public String toString()
    {
        return super.toString() + "\tradius: " + getRadius() + "\n";
    }
}