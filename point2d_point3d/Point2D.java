package Java_W2_Day_03_Kethua.point2d_point3d;

public class Point2D {
    private float x=0.0f;
    private float y=0.0f;
    public Point2D(){

    }

    public Point2D(float x, float y) {
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
    public void setXY(float x,float y){
      this.x=x;
      this.y=y;
    }
    public float[] getXY(){
        float[] arr={getX(),getY()};
       return arr;
    }
    public String toString(){
        return "In 2D have 1st length is "
                + getX()
                +", 2nd length is "
                + getY();
    }

}
