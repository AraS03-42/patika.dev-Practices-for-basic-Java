import java.util.Scanner;

public class Grade_Point_Average {
    public static void main(String[] args) {
        double turkish,math,physics,chemistry,history,music,total;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your Math grade : ");
        math =input.nextDouble();

        System.out.print("Please enter your Physics grade : ");
        physics =input.nextDouble();

        System.out.print("Please enter your Chemistry grade : ");
        chemistry =input.nextDouble();

        System.out.print("Please enter your Turkish grade : ");
        turkish =input.nextDouble();

        System.out.print("Please enter your History grade : ");
        history =input.nextDouble();

        System.out.print("Please enter your Music grade : ");
        music =input.nextDouble();
        total = (history + math + music + chemistry + turkish + physics)/6;
        String str = (total >= 60) ? "Passed the Class" : "Failed the Class";
        System.out.println(str);
    }
}
