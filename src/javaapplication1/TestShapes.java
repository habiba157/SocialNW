package javaapplication1;

public class TestShapes {

    public static void main(String[] args) 
    {
        Shape[] shapes = new Shape[6];

        shapes[0] = new Circle(1, Shape.RED);
        shapes[1] = new Circle(2, Shape.GREEN);
        shapes[2] = new Circle(3, Shape.BLUE);
        shapes[3] = new Rectangle(1, 2, Shape.RED);
        shapes[4] = new Square (5.2,Shape.RED);
        shapes[5] = new Square (6,Shape.GREEN);
        System.out.println(shapes[0].toString());
        System.out.println(shapes[1].toString());
        System.out.println(shapes[2].toString());
        System.out.println(shapes[3].toString());
        System.out.println(shapes[4].toString());
        System.out.println(shapes[5].toString());
        
        for (int i = 0; i < 6; i++) 
        {
            System.out.println("Shape number " + i + " is instance of "+ shapes[i].getClass()+ " and its area is "+ shapes[i].getArea());
            System.out.println(shapes[i].getClass().toString());
        }
        shapes[2] = new Rectangle(3, 4, Shape.RED);
    }

}
