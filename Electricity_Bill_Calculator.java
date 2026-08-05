import java.util.Scanner;

public class Electricity_Bill_Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Total Units: ");
        int units = sc.nextInt();

        double bill = 0;

        // First 100 Units
        if (units <= 100) {
            bill = units * 5;
        }

        // Next 100 Units
        else if (units <= 200) {
            bill = (100 * 5) + ((units - 100) * 6);
        }

        // Next 300 Units
        else if (units <= 500) {
            bill = (100 * 5) + (100 * 6) + ((units - 200) * 7);
        }

        // Above 500 Units
        else {
            bill = (100 * 5) + (100 * 6) + (300 * 7) + ((units - 500) * 10);
        }

        // 20% Surcharge
        if (bill > 2500) {
            bill = bill + (bill * 20 / 100);
        }

        System.out.println("Total Electricity Bill = ₹" + bill);

        sc.close();
    }
}
