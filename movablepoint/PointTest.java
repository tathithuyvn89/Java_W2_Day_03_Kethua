package Java_W2_Day_03_Kethua.movablepoint;

import java.util.Arrays;

public class PointTest {
    public static void main(String[] args) {
        Point point=new Point();
        System.out.println(point);
        point=new Point(8.9f,6.78f);
        System.out.println(point);
        System.out.println(Arrays.toString(point.getXY()));
        point.setX(7.8f);
        System.out.println(point);
        point.setXY(2.34f,5.67f);
        System.out.println(point);
        System.out.println(Arrays.toString(point.getXY()));
    }
}
