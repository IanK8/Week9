import java.util.Random;
import java.util.Scanner;

public class Game21 {
    public static void main(String[] args) {
        int card1 = (int)(10*Math.random()+1);
        int card2 = (int)(10*Math.random()+1);
        int sum = card1 + card2;
        System.out.println("You have a " + card1 + " and a " + card2 + " for a total of " + sum);
        System.out.println("Enter a 1 if you want another or any other number for no card.");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        int card3 = 0;
        if (choice == 1) {
            card3 = (int)(10*Math.random()+1);
            sum += card3;
            System.out.println("You got a " + card3 + " for a total of " + sum);
            if (sum > 21) {
                System.out.println("You lose");
            }
        }
        int dealerCard1 = (int)(10*Math.random()+1);
        int dealerCard2 = (int)(10*Math.random()+1);
        int dealerCard3 = (int)(10*Math.random()+1);
        int dealerTotal = dealerCard1 + dealerCard2 + dealerCard3;
        System.out.println("The dealer has: " + dealerCard1 + ", " + dealerCard2 + ", and " + dealerCard3 + ", for a total of " + dealerTotal);
        if (dealerTotal > 21 || (sum <= 21 && sum > dealerTotal)) {
            System.out.println("You win");
        } else if (sum == dealerTotal) {
            System.out.println("Tie");
        } else {
            System.out.println("You lose");
        }
    }
}