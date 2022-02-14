public class Circle2 extends Shape
{
    public Circle2(double dim1, double dim2) 
    {
        super(dim1, dim2);
    }

    public double area()
    {
        System.out.println("Area of Circle:");
        return PI * dim1 * dim1;
    }
}
