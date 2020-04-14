package Java_W2_Day_03_Kethua.triangle;

import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
        Triangle triangle=new Triangle();
        System.out.println(triangle);
        triangle=new Triangle("pink",false,2.2,4.5,5.6);
        System.out.println(triangle);
        System.out.println("The area of triangle is "+(float)(triangle.getArea()));
        System.out.println("The perimeter of triangle is "+(float)(triangle.getPerimeter()));
        //Build triangle information from user:
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter color of triangle : ");
        String color = scanner.nextLine();
        System.out.print("Enter 1st of triangle :  ");
        double side1=scanner.nextDouble();
        System.out.print("Enter 2nd of triangle : ");
        double side2=scanner.nextDouble();
        System.out.print("Enter 3nd st of triangle : ");
        double side3=scanner.nextDouble();
        System.out.println("Would you like filled for triangle \"true or fale\"");
        boolean filled= scanner.nextBoolean();
        triangle=new Triangle(color,filled,side1,side2,side3);
        System.out.println(triangle);
        System.out.println("The area of triangle is "+(float)(triangle.getArea()));
        System.out.println("The perimeter of triangle is "+(float)(triangle.getPerimeter()));

    }
}
