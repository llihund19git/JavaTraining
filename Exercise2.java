import java.util.Scanner;

/**
 * Created by Xyxon on 5/24/2017.
 */
public class Exercise2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of Circle: ");
        int radius = scanner.nextInt();
        System.out.println("The Area of Circle is " + radius*radius);
        System.out.println("-------------------------------------------");
        System.out.print("Enter the base of Triangle: ");
        int base = scanner.nextInt();
        System.out.print("Enter the height of Triangle: ");
        int height = scanner.nextInt();
        double triangle = (float)(base*height) / 2;
        System.out.println("The Area of Triangle is " + triangle);
        System.out.println("-------------------------------------------");
        System.out.print("Enter the height of Rectangle: ");
        int height2 = scanner.nextInt();
        System.out.print("Enter the width of Rectangle: ");
        int width = scanner.nextInt();
        System.out.println("The Area of Rectangle is " + height2*width);
    }
}
