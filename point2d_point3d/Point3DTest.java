package Java_W2_Day_03_Kethua.point2d_point3d;

import java.util.Arrays;

public class Point3DTest {
    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        System.out.println(point3D);
        point3D=new Point3D(4.5f);
        System.out.println(point3D);
        point3D=new Point3D(4.59f,6.56f,4.5f);
        System.out.println(point3D);
        point3D.setXYZ(6.89f,7.80f,4.5f);
        System.out.println(point3D);
        point3D.setXY(5.00f,6.00f);
        System.out.println(point3D);
        System.out.println(Arrays.toString(point3D.getXYZ()));
    }

}
