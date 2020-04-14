package Java_W2_Day_03_Kethua.thuchanh;

import java.util.Scanner;

public class SquareTest {
    public static void main(String[] args) {
        Square square= new Square();
        System.out.println(square);
        square=new Square(2.3);
        System.out.println(square);
        square=new Square("yellow",true,5.8);
        System.out.println(square);
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());

    }
}
