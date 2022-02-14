public class Circle extends GeometricObject 
{
    private double radius;

    public Circle()
    {
    }

    public Circle(double radius)
    {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled)
    {
        super(color,filled);
        this.radius = radius;
    }

    public double getRadius() 
    {
        return this.radius;
    }

    public void setRadius(double radius) 
    {
        this.radius = radius;
    }

    public double getArea()
    {
        return Math.PI*Math.pow(this.radius, 2);
    }

    public double getDiameter()
    {
        return this.radius*2;
    }

    public double getPerimeter()
    {
        return Math.PI*getDiameter();
    }

    public void printCircle()
    {
        System.out.println("color: "+this.getColor()+" and filled: "+this.isFilled());
    }

    public String toString()
    {
        return ("created on "+this.getDatecreated());
    }

}
