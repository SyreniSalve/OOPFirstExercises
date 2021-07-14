package Task02;

public class Circle {
    private double radius;
    private String colour;

    public Circle(){
        radius = 1.0;
        colour = "red";
    }
    public Circle(double radius){
        this.radius = radius;
        colour = "red";
    }
    public Circle(double radius, String colour){
        this.radius = radius;
        this.colour = colour;
    }
    public double getRadius(){return  radius;}
    public double getArea(){
        return radius * radius * Math.PI;
    }
    public String getColour(){return colour;}

    public void setRadius (double radius){
        this.radius = radius;
    }
    public void setColour (String colour){
        this.colour = colour;
    }
    public String toString(){
        return "Circle radius = " + radius + ", colour = " + colour;
    }
}
