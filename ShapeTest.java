public class ShapeTest 
{
    public static void main(String[] args) 
    {
        Rectangle2 r = new Rectangle2(9,5);
        Triangle t = new Triangle(10,8);
        Circle2 c = new Circle2(5,5);
        Ellipse e = new Ellipse(7,7);
        Square s = new Square(6,6);

        Shape shape;

        shape = r; //rectangle
        System.out.println("Area is "+shape.area());
        shape = t; //triangle
        System.out.println("Area is "+shape.area());
        shape = c; //circle
        System.out.println("Area is "+shape.area());
        shape = e; //ellipse
        System.out.println("Area is "+shape.area());
        shape = s; //square
        System.out.println("Area is "+shape.area());
    }
}
