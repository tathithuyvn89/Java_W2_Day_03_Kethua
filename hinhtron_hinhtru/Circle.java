package Java_W2_Day_03_Kethua.hinhtron_hinhtru;

public class Circle {
   private double radius=1;
    private String color="red";
    public Circle(){

    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getAre(){
        return radius*radius*Math.PI;
    }
    public String toString(){
        return " A circle with radius "
                +getRadius()
                +", with color "+getColor();
    }

}
