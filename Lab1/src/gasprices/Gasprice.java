package gasprices;

import java.util.Scanner;
public class Gasprice {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = keyboard.nextLine();
        System.out.println("Hello " + name);
        System.out.println("How much does it cost to completely fill up your gas tank?");
        int fullTankPrice = Integer.parseInt(keyboard.nextLine());
        System.out.println("How many times every month do you fill up your gas tank?");
        double monthlyGasFillUps = Double.parseDouble(keyboard.nextLine());
        System.out.println("That will cost you $" + monthlyGasFillUps * fullTankPrice + "every month" );

    }
}
