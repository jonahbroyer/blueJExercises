/**
 * Class Square creates and draws squares.
 *
 * @author Jonah Broyer
 * @version 05/19/2020
 */
public class Square extends Rectangle
{
    private double length;

    /**
     * Constructor for objects of class Square
     */
    public Square(double length)
    {
        super(length, length);
        this.length = length;
        setType("Square");
    }
    
    /**
     * Get the length of a Square.
     */
    public double getLength()
    {
        return length;
    }
    
    /**
     * Draw a square.
     */
    @Override
    public void draw()
    {
        System.out.println("Drawing " + getType() + " squareTest");
    }
    
    /**
     * toString method.
     */
    @Override
    public String toString()
    {
        return baseString() + "\tlength: " + getLength() + "\n";
    }
}