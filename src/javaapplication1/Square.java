package javaapplication1;

public class Square extends Shape 
{

    private double side;

    public Square(int color) 
    {
        
        super(color);
        this.side = 0.0;
    }

    public Square(double side,int color) 
    {
        super(color);
        this.side = side;
    }

    public void setSide(double side) 
    {
        this.side = side;
    }

    public double getSide() 
    {
        return side;
    }

    /**
     *
     * @return area of square
     */
    @Override
    public double getArea() 
    {
        return side * side;
    }

    /**
     *
     * @return information about square
     */
    @Override
    public String toString() 
    {

        return "The side length of the square = " + this.getSide() + " The area of the square is " + this.getArea();
    }

}
