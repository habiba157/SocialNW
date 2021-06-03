
package javaapplication1;


public class Circle extends Shape 
{

    private double radius_;
    protected static double PI = 3.14;

    Circle(double radius, int color) 
    {
        super(color);
        radius_ = radius;
    }

    /**
     *
     * @return area of circle
     */
    @Override
    public double getArea() 
    {
        return PI * radius_ * radius_;
    }
    
    /**
     *
     * @return information about the circle
     */
    @Override
    public String toString() 
    {

        return "The radius of the circle is " + this.radius_ + " The area of the circle is " + this.getArea();
    }

}
