package Java_W2_Day_03_Kethua.point2d_point3d;

import java.util.Arrays;

public class Point2DTest {
    public static void main(String[] args) {
        Point2D point2D= new Point2D();
        System.out.println(point2D);
        point2D = new Point2D(5.64f,7.88f);
        System.out.println(point2D);
        System.out.println(Arrays.toString(point2D.getXY()));
        point2D.setXY(7.89f,9.67f);
        System.out.println(point2D);
    }
}
