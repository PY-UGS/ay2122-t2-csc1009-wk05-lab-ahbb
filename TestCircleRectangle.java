public class TestCircleRectangle 
{
   public static void main(String[] args) 
   {
       Circle circle = new Circle(1);
       System.out.println("A circle "+circle.toString());
       circle.setColor("white");
       circle.setFilled(false);
       circle.printCircle();
       System.out.println("The color is "+circle.getColor());
       System.out.println("The radius is "+circle.getRadius());
       System.out.println("The area is "+circle.getArea());
       System.out.println("The diameter is "+circle.getDiameter());

       Rectangle rectangle = new Rectangle(2,4);
       System.out.println("\nA rectangle "+rectangle.toString());
       rectangle.setColor("white");
       rectangle.setFilled(false);
       rectangle.printRectangle();
       System.out.println("The area is "+rectangle.getArea());
       System.out.println("The perimeter is "+rectangle.getPerimeter());
   } 
}
