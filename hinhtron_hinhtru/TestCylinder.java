package Java_W2_Day_03_Kethua.hinhtron_hinhtru;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder=new Cylinder();
        System.out.println(cylinder);
        cylinder=new Cylinder(3);
        System.out.printf("Volume of cylinder is %5.3f",cylinder.getVolume());
        System.out.println();
        System.out.println(cylinder);
        System.out.println();
        cylinder=new Cylinder(3,2,"blue");
        System.out.printf("Volume of cylinder is %5.3f",cylinder.getVolume());
        System.out.println();
        System.out.println(cylinder);
    }
}
