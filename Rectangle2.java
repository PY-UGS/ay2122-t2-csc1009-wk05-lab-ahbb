public class Rectangle2 extends Shape
{

    public Rectangle2(double dim1, double dim2) 
    {
        super(dim1, dim2);
    }

    public double area()
    {
        System.out.println("Area of Rectangle:");
        return dim1 * dim2; 
    }
    
}
