import java.util.Scanner;

public class IT24103855Lab5Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of new members: ");
        int members = input.nextInt();

        String prize;
        if (members < 0) {
            prize = "Invalid input";
        } else if (members == 0) {
            prize = "No Prize";
        } else if (members == 1) {
            prize = "Pen";
        } else if (members == 2) {
            prize = "Umbrella";
        } else if (members == 3) {
            prize = "Bag";
        } else if (members == 4) {
            prize = "Travelling Chair";
        } else {
            prize = "Headphone";
        }

        System.out.println("Prize: " + prize);

        input.close();
    }
}