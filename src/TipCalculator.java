import java.text.DecimalFormat;
import java.util.Scanner;

public class TipCalculator {
    public static void main(String[]args){
        DecimalFormat formatter = new DecimalFormat("#.##");
        Scanner scan = new Scanner(System.in);



        //Initializing variables
        int numOfPeople;
        int tipPercentage = 0;
        double billBeforeTip = 0;
        double tempPrice = 0;
        double totalTip;














        //Printing lines - asking the user
        System.out.println("Welcome to the TipCalculator");
        System.out.print("How many people are in your group?: ");
        numOfPeople = scan.nextInt();
        scan.nextLine();
        System.out.print("What's the Tip Percentage? (0-100): ");
        tipPercentage = scan.nextInt();


        /*System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
        tempPrice = scan.nextDouble();
        scan.nextLine();
        */



        while (tempPrice != -1) {
            System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
            tempPrice = scan.nextDouble();
            scan.nextLine();

            billBeforeTip += tempPrice;
        }

        System.out.println("___________________________________");

        //Printing lines - doing the math operations
        totalTip = (double) tipPercentage/100 * billBeforeTip;
        System.out.println("Total Bill Before Tip: " + billBeforeTip);
        System.out.println("Tip Percentage: " + tipPercentage);
        System.out.println("Total Tip: " + totalTip);









    }

}
