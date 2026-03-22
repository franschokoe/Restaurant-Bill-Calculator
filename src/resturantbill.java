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

        double tipPercent;
        String ratingLabel;

        //deciding
        if (serverRating == 1 ){
            tipPercent  = 0.05;
            ratingLabel = "Poor (5%)";
        }
        else if (serverRating == 2){
            tipPercent  = 0.10;
            ratingLabel = "Below Average (10%)";
        }
        else if (serverRating == 3){
            tipPercent  = 0.15;
            ratingLabel = "Average (15%)";
        }
        else if (serverRating == 4){
            tipPercent  = 0.18;
            ratingLabel = "Good (18%)";
        }
        else{
            //for 5 and more
            tipPercent  = 0.20;
            ratingLabel = "Excellent (20%)";
        }
        //calculation

        final double TAX_RATE = 0.085;          // 8.5%

        double taxAmount    = mealCost * TAX_RATE;
        double tipAmount    = mealCost * tipPercent;
        double totalBill    = mealCost + taxAmount + tipAmount;
        double costPerPerson = totalBill / numPeople;

        String divider = "__________________________________________";
        String thinDiv = "------------------------------------------";

        System.out.println();
        System.out.println(divider);
        System.out.println("RESTAURANT BILL RECEIPT");
        System.out.println(divider);
        System.out.printf("  %-28s%s%n", "Server Rating:", ratingLabel);
        System.out.printf("  %-28s%d%n", "Party Size:", numPeople);
        System.out.println(thinDiv);
        System.out.printf("  %-28sR%8.2f%n", "Meal Cost:",   mealCost);
        System.out.printf("  %-28sR%8.2f%n", "Tax (8.5%):",  taxAmount);
        System.out.printf("  %-28sR%8.2f%n", "Tip:",         tipAmount);
        System.out.println(thinDiv);
        System.out.printf("  %-28sR%8.2f%n", "TOTAL BILL:",  totalBill);
        System.out.println(thinDiv);
        System.out.printf("  %-28sR%8.2f%n", "Cost Per Person:", costPerPerson);
        System.out.println(divider);
        System.out.println("Thank you for dining with us!😊😊");
        System.out.println(divider);
    }
}
