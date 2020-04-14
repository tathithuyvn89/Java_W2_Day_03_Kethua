package Java_W2_Day_03_Kethua.movablepoint;

import java.util.Arrays;

public class Point {
    private float x;
    private float y;

    public Point() {
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y){
        this.x=x;
        this.y=y;
    }
    public float [] getXY(){
        float []arr={getX(),getY()};
        return arr;
    }
    public String toString(){
        return " At position at coordinates x ="
                + getX()
                +", coordinates y = "
                + getY();

    }

}
