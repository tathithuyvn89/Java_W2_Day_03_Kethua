package Java_W2_Day_03_Kethua.thuchanh;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        rectangle= new Rectangle(2.3,5.8);
        System.out.println(rectangle);
        rectangle= new Rectangle("orange",false,2.5,3.8);
        System.out.println(rectangle);
    }
}
