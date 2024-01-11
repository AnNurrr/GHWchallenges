import java.util.Scanner;

public class areaCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the length of rectangle: ");
        double length = sc.nextDouble();

        System.out.print("Please enter the width of rectangle: ");
        double width = sc.nextDouble();

        double area = length*width;
        System.out.print("The area of rectangle is: " + area);

        sc.close();


    }
}
