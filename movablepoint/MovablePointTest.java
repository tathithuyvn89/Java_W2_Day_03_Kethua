package Java_W2_Day_03_Kethua.movablepoint;

public class MovablePointTest {
    public static void main(String[] args) {
        MovablePoint movablePoint=new MovablePoint();
        System.out.println(movablePoint);
        movablePoint=new MovablePoint(50.34f,60.5f,2.1f,-4.5f);
        System.out.println(movablePoint);
        movablePoint.move();
        System.out.println(movablePoint);
    }
}
