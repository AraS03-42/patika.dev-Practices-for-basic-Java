import java.util.Scanner;
public class VAT_Calculation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your salary: ");
        double price = input.nextDouble();
        double vat = (price < 1000) ? 0.18 : 0.08;
        int vat_rate = (int) (vat*100);
        double vat_amount = vat * price;
        int total =(int) (price + vat_amount);
        System.out.println("VAT rate %" + vat_rate);
        System.out.println("VAT amount : " + vat_amount);
        System.out.println("Total amount including VAT : "+ total);
    }
}
