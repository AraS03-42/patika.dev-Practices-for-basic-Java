import  java.util.Scanner;
public class grosery_checkout_program {
    public static void main(String[] args) {
        double total = 0;
        Scanner kg = new Scanner(System.in);
        System.out.print("How many kilograms of pear? : ");
        total += (kg.nextDouble() * 2.14);
        System.out.print("How many kilograms of apple? : ");
        total += (kg.nextDouble() * 3.67);
        System.out.print("How many kilograms of tomato? : ");
        total += (kg.nextDouble() * 1.11);
        System.out.print("How many kilograms of banana? : ");
        total += (kg.nextDouble() * 0.95);
        System.out.print("How many kilograms of eggplant? :");
        total += (kg.nextDouble() * 5.0);
        System.out.printf("Total Amount : %.2f",total);

    }
}
