package Java_W2_Day_03_Kethua.demo;

public class Geometric {
    private String color = "white";
    private String filled = null;
    public Geometric(){

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFilled() {
        return filled;
    }

    public void setFilled(String filled) {
        this.filled = filled;
    }
    public String toString(){
        return "created with\""+color+"\"color and "+(filled==null?"no fill":"filled with\""+filled+"\"color");
    }

}
