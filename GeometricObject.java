import java.util.Date;

public class GeometricObject 
{
    private String color;
    private boolean filled;
    private Date datecreated = new Date();

    public GeometricObject()
    {
    }

    public GeometricObject(String color, boolean filled)
    {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() 
    {
        return this.color;
    }

    public void setColor(String color) 
    {
        this.color = color;
    }

    public boolean isFilled() 
    {
        return this.filled;
    }

    public void setFilled(boolean filled) 
    {
        this.filled = filled;
    }

    public Date getDatecreated() 
    {
        return this.datecreated;
    }
}
