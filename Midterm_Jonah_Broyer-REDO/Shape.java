import java.text.DecimalFormat;
import java.util.Comparator;

/**
 * Class Shape is an abstract class intended as a superclass for various shapes.
 *
 * @author Jonah Broyer
 * @version 05/19/2020
 */

public abstract class Shape
    implements Drawable<Shape>, Comparable<Shape>, Comparator<Shape>
{
    private double area;
    private double perimeter;
    private String type;
    protected static final DecimalFormat df =
        new DecimalFormat("#,##0.##");

    /**
     * Constructor for objects of class Shape
     */
    public Shape()
    {
        // no code
    }
    
    /**
     * Set the type of a Shape object.
     */
    protected void setType(String type)
    {
        this.type = type;
    }
    
    /**
     * Set the area of a Shape object.
     */    
    protected void setArea(double area)
    {
        this.area = area;
    }
    
    /**
     * Set the perimeter of a Shape object.
     */
    protected void setPerimeter(double perimeter)
    {
        this.perimeter = perimeter;
    }

    /**
     * Draw a Shape object.
     */
    public abstract void draw();
    
    /**
     * Compare different Shape objects.
     */
    @Override
    public int compareTo(Shape other)
    {
        return new Double(this.getArea())
            .compareTo(new Double(other.getArea()));
    }
    
    /**
     * Get the area of a Shape object.
     */
    public double getArea()
    {
        return area;
    }
    
    /**
     * Get the perimeter of a Shape object.
     */
    public double getPerimeter()
    {
        return perimeter;
    }
    
    /**
     * Get the type of a Shape object.
     */
    public String getType()
    {
        return type;
    }
    
    /**
     * A baseString method.
     */
    public String baseString()
    {
        return "Shape type: " + getType() + "\n" +
               "\t" + "area: " + df.format(getArea()) + "\n" +
               "\t" + "perimeter: " + df.format(getPerimeter()) + "\n";
    }
    
    /**
     * A toString method.
     */
    @Override
    public String toString()
    {
        return baseString();
    }
    
    /**
     * Implement a Comparator.
     */
    @Override
    public int compare(Shape x, Shape y)
    {
        Double xP = new Double(x.getPerimeter());
        Double yP = new Double(y.getPerimeter());
        return xP.compareTo(yP);
    }
}