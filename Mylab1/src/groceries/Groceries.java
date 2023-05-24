package groceries;

import java.util.Scanner;
public class Groceries {
    public static void main(String[] args) {
//my question that I posted
        System.out.println("How much money do you spend annually at the grocery store?");

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = keyboard.nextLine();
        System.out.println("Hello " + name);
        System.out.println("How many times do you go to the grocery store a week?");
        int storeTripsAWeek = Integer.parseInt(keyboard.nextLine());
        System.out.println("How much do you spend each time at the grocery store?");
        double costEveryTrip = Double.parseDouble(keyboard.nextLine());
        System.out.println("That will cost you $" + costEveryTrip * storeTripsAWeek * 52 + "annually");
    }
}
