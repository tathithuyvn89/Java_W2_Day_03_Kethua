package Java_W2_Day_03_Kethua.movablepoint;

public class MovablePoint extends Point {
    private float xSpeed;
    private float ySpeed;
    public MovablePoint(){
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed,float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public float [] getSpeed(){
        float[]arr={getxSpeed(),getySpeed()};
        return arr;
    }

    public MovablePoint move(){
        float x= super.getX();
        float y=super.getY();
        x+=getxSpeed();
        y+=getySpeed();
        super.setX(x);
        super.setY(y);
        return this;
    }
    @Override
    public String toString() {
        return "Speed at x is "
                + getxSpeed()
                +", speed at y is "
                + getySpeed()
                +super.toString();

    }
}
