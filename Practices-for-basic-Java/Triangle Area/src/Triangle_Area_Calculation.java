import java.util.Scanner;
import java.lang.Math;

public class Triangle_Area_Calculation {
    public static void main(String[] args) {
        int  a,b,c;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the length of the 1th side: ");
        a = input.nextInt();;
        System.out.print("Please enter the length of the 2nd side: ");
        b = input.nextInt();;
        System.out.print("Please enter the length of the 3th side: ");
        c = input.nextInt();;
        int s = (a + b + c) / 2;
        int area =(int) Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.print("Area = " + area + " sq units");
    }
}
