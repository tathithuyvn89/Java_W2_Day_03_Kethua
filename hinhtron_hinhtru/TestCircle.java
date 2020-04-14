package Java_W2_Day_03_Kethua.hinhtron_hinhtru;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle=new Circle();
        System.out.println(circle);
        circle=new Circle(4.5,"bule");
        System.out.println(circle);
        circle.setRadius(5.5);
        System.out.println(circle);

    }
}
