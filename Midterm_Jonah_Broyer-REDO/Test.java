import java.util.*;

/**
 * Tester class
 *
 * @author Jonah Broyer
 * @version 05/19/2020
 * 
 * Starting with positive 15, divide 15 by 2 and write its remainders in reverse.
 * 0000 1111 (8-bit)
 * 
 * To make 15 negative, flip the bits and add a 1.
 * 
 * So, 1111 0001 is -15 in two's complement with 8 bits.
 */
public class Test
{
    public static void main(String[] args)
    {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(4.0));
        shapes.add(new Square(3.0));
        shapes.add(new Rectangle(1.2, 5.6));
        
        for(Shape s : shapes) {
            System.out.println(s);
        }
        
        shapes.forEach(shape -> shape.draw());
        
        System.out.println("\n==== Sort by Perimeter ====");
        shapes.stream()
            .sorted((x, y) -> x.compare(x, y))
            .forEach(System.out::println);
        
        shapes.add(0, new Square(23));
        
        System.out.println("\n==== Sort by Area ====");
        Collections.sort(shapes);
        shapes.forEach(System.out::println);
        
        filterPrint(shapes, "Circle");
    }
    
    /**
     * Print only one type of shape.
     */
    public static void filterPrint(List<Shape> shapes, String type)
    {
        System.out.println("\n==== Filtered: " + type + " ====");
        
        shapes.stream()
            .filter(shape -> shape.getType().equals(type))
            .forEach(System.out::println);
    }
}