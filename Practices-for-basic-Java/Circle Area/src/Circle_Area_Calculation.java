import java.util.Scanner;

public class Circle_Area_Calculation {
    public static void main(String[] args) {
        double pi = 3.14, r, c_angle, area;
        Scanner input = new Scanner(System.in);
            System.out.print("Enter the radius of the circle : ");
            r = input.nextDouble();
            System.out.print("Enter the central angle of the circle : ");
            c_angle = input.nextDouble();
        area = ((r * r) * pi * c_angle) / 360;
        System.out.print("Area of the central angle: " + area);
    }
}

