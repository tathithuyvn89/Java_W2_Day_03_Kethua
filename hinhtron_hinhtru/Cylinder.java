package Java_W2_Day_03_Kethua.hinhtron_hinhtru;

public class Cylinder extends Circle {
    private double height=1;

    public Cylinder() {
    }
    public Cylinder(double height){
        this.height=height;
    }
    public Cylinder(double height,double radius, String color){
        super(radius,color);
        this.height=height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return height*getAre();
    }

    @Override
    public String toString() {
        return " Cylinder with height is "
                + getHeight()
                + ", the bottom as a subclass of "
                +super.toString();
    }
}
