public abstract class Shape
{
    protected double dim1,dim2,PI;

    public Shape(double dim1, double dim2)
    {
        this.dim1 = dim1;
        this.dim2 = dim2;
        this.PI = 3.14;
    }

    public abstract double area();
}
