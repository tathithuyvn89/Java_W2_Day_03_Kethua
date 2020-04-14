package Java_W2_Day_03_Kethua.thuchanh;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        circle=new Circle(3.5);
        System.out.println(circle);
        circle=new Circle("indigo",false,3.5);
        System.out.println(circle);

    }
}
