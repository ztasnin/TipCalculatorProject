import java.text.DecimalFormat;
import java.util.Scanner;

public class TipCalculator {
    public static void main(String[]args){
        DecimalFormat formatter = new DecimalFormat("#.##");
        Scanner scan = new Scanner(System.in);


        //Initializing variables
        int numOfPeople;
        double tipPercentage = 0;
        double billBeforeTip = 0;
        double tempPrice = 0;
        double totalTip;
        String name;


        //Printing lines - asking the user
        System.out.print("Please Enter Your Name: ");
        name = scan.nextLine();

        System.out.println(String.format("Welcome to the TipCalculator, %s!", name));
        System.out.print("How many people are in your group?: ");
        numOfPeople = scan.nextInt();
        scan.nextLine();
        System.out.print("What's the Tip Percentage? (0-100): ");
        tipPercentage = scan.nextInt();


        while (tempPrice != -1) {
            billBeforeTip += tempPrice;
            System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
            tempPrice = scan.nextDouble();
            scan.nextLine();
        }

        System.out.println("___________________________________");

        //Printing lines - doing the math operations
        totalTip = tipPercentage/100 * billBeforeTip;
        System.out.println("Total Bill Before Tip: " + (billBeforeTip));
        System.out.println("Tip Percentage: " + formatter.format(tipPercentage));
        System.out.println("Total Tip: " + formatter.format(totalTip));
        System.out.println("Total Bill With Tip: " + formatter.format(totalTip + billBeforeTip));
        System.out.println("Per person Cost Before Tip: " + formatter.format(billBeforeTip/numOfPeople));
        System.out.println("Tip Per Person: " + formatter.format(totalTip/numOfPeople));
        System.out.println("Total Cost Per Person: " + formatter.format((totalTip + billBeforeTip)/numOfPeople));









    }

}
