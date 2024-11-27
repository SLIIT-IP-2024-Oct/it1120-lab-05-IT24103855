import java.util.Scanner;

public class IT24103855Lab5Q3 {

    public static final int ROOM_CHARGE_PER_DAY = 48000;
    public static final int MAX_DAYS_IN_MONTH = 31;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Start Date (1-31): ");
        int startDate = scanner.nextInt();

        System.out.print("Enter End Date (1-31): ");
        int endDate = scanner.nextInt();

        scanner.close();

        if (startDate < 1 || startDate > MAX_DAYS_IN_MONTH || endDate < 1 || endDate > MAX_DAYS_IN_MONTH) {
            System.out.println("Error: Days must be between 1 and " + MAX_DAYS_IN_MONTH);
            return;
        }

        if (startDate >= endDate) {
            System.out.println("Error: Start Date must be less than End Date");
            return;
        }

        int daysReserved = endDate - startDate + 1;
        double discountRate = 0;

        if (daysReserved >= 3 && daysReserved <= 4) {
            discountRate = 10;
        } else if (daysReserved >= 5) {
            discountRate = 20;
        }

        double totalAmount = ROOM_CHARGE_PER_DAY * daysReserved * (1 - discountRate / 100);

        System.out.println("Room Charge Per Day: Rs. " + ROOM_CHARGE_PER_DAY + ".0/");
        System.out.println("Number of Days Reserved: " + daysReserved);
        System.out.println("Total Amount to be Paid: " + totalAmount);
    }
}