package javaapplication1;



public class Rectangle extends Shape 
{

    private double length_, width_;

    Rectangle(double length, double width, int color) 
    {
        super(color);
        length_ = length;
        width_ = width;
    }

    /**
     *
     * @return area of rectangle
     */
    @Override
    public double getArea() 
    {
        return length_ * width_;
    }

    /**
     *
     * @return information about the rectangle
     */
    @Override
    public String toString() 
    {
        return "The Length of thectangle is " + this.length_ + " ,The width of the rectangle is " + this.width_ + " and the area of the rectangle is " + this.getArea();

    }

}
