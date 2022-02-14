public class Rectangle extends GeometricObject 
{
    private double width;
    private double height;

    public Rectangle()
    {
    }

    public Rectangle(double width, double height)
    {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String color, boolean filled)
    {
        super(color,filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() 
    {
        return this.width;
    }

    public void setWidth(double width) 
    {
        this.width = width;
    }

    public double getHeight() 
    {
        return this.height;
    }

    public void setHeight(double height) 
    {
        this.height = height;
    }

    public double getArea()
    {
        return this.width*this.height;
    }

    public double getPerimeter()
    {
        return this.height*2 + this.width*2;
    }

    public void printRectangle()
    {
        System.out.println("color: "+this.getColor()+" and filled: "+this.isFilled());
    }

    public String toString()
    {
        return ("created on "+this.getDatecreated());
    }
}
