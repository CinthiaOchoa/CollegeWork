/**
 * A class that represents a 2D circle.
 * @author Cinthia Mariana Ochoa Torre
 * @version 1.0
 * @since 23 April 2023
 */
public class Circle2D {

    private double x;
    private double y;
    private double radius;

    /**
     * Constructs a default circle with (0, 0) for (x, y) and 1 for radius.
     */
    public Circle2D() {
        this(0, 0, 1);
    }

    /**
     * Constructs a circle with the specified x, y, and radius.
     * @param x the x-coordinate of the center
     * @param y the y-coordinate of the center
     * @param radius the radius of the circle
     */
    public Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    /**
     * Returns the x-coordinate of the center.
     * @return the x-coordinate of the center
     */
    public double getX() {
        return x;
    }

    /**
     * Returns the y-coordinate of the center.
     * @return the y-coordinate of the center
     */
    public double getY() {
        return y;
    }

    /**
     * Returns the radius of the circle.
     * @return the radius of the circle
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Returns the area of the circle.
     * @return the area of the circle
     */
    public double getArea() {
        return Math.PI * radius * radius;
    }

    /**
     * Returns the perimeter of the circle.
     * @return the perimeter of the circle
     */
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    /**
     * Returns true if the specified point (x, y) is inside this circle.
     * @param x the x-coordinate of the point
     * @param y the y-coordinate of the point
     * @return true if the point is inside this circle, false otherwise
     */
    public boolean contains(double x, double y) {
        return Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y)) < radius;
    }

    /**
     * Returns true if the specified circle is inside this circle.
     * @param circle the circle to check
     * @return true if the specified circle is inside this circle, false otherwise
     */
    public boolean contains(Circle2D circle) {
        double distance = Math.sqrt((circle.x - x) * (circle.x - x) + (circle.y - y) * (circle.y - y));
        return distance + circle.radius <= radius;
    }

    /**
     * Returns true if the specified circle overlaps with this circle.
     * @param circle the circle to check
     * @return true if the specified circle overlaps with this circle, false otherwise
     */
    public boolean overlaps(Circle2D circle) {
        double distance = Math.sqrt((circle.x - x) * (circle.x - x) + (circle.y - y) * (circle.y - y));
        return distance < radius + circle.radius;
    }
}
