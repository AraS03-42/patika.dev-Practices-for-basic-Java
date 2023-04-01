import java.util.Scanner;
public class Body_Mass_Index_Calculation {
    public static void main(String[] args) {
        Scanner inp =new Scanner(System.in);
        System.out.print("Please enter your height (in meters) : ");
        double height = inp.nextDouble();
        System.out.print("Please enter your weight : ");
        double weight = inp.nextDouble();
        double b_ındex = weight / (height * height);
        System.out.print("Your Body Mass Index : " + b_ındex);

    }
}
