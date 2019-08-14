package geometry;

import java.util.Date;

public class GeometricObject {
    private String color;
    private boolean filled;
    private Date dateCreated;
    public GeometricObject()
    {
        dateCreated = new java.util.Date();
        color="white";
        filled=true;
    }

    public GeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color=color;
        this.filled=filled;
    }
    public String getColor()
    {
        return color;
    }
    public void setColor(String color)
    {
        this.color=color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public String toString()
    {
        return "created on "+dateCreated+"\ncolor:"+color+"and filled:"+filled;
    }
}
