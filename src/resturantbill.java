import java.util.Scanner;
public class resturantbill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //declaring the inputs
        System.out.print("Enter meal cost (R): ");
        double mealCost = scanner.nextDouble();

        System.out.print("Enter number of people in party: ");
        int numPeople = scanner.nextInt();

        //validate
        int serverRating = 0;
        do {
            System.out.print("Enter server rating (1-5): ");
            serverRating = scanner.nextInt();
            if (serverRating < 1 || serverRating > 5) {
                System.out.println("  Invalid rating. Please enter a value between 1 and 5.");
            }
        } while (serverRating < 1 || serverRating > 5);

        scanner.close();
    }
}
