import java.util.*;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your annual income: ");
        double income = sc.nextDouble();

        double tax;

        if (income <= 300000) {
            tax = 0;
        } else if (income <= 600000) {
            tax = income * 0.05;
        } else if (income <= 900000) {
            tax = income * 0.10;
        } else if (income <= 1200000) {
            tax = income * 0.15;
        } else {
            tax = income * 0.20;
        }

        System.out.println("Annual Income: " + income);
        System.out.println("Income Tax: " + tax);

        sc.close();
    }
}
