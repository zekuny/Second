package Week2;
import java.util.Random;
import java.util.Scanner;


public class Bet {
	public static void main(String[] args){
		Card[] cards = new Card[3];
		int amount1 = 100;
		int amount2 = 100;
		boolean player1 = true;
		String str = "yes";
		Scanner sc = new Scanner(System.in);
		
		while(!str.equalsIgnoreCase("no")){		
			Random r = new Random();
			int ans = 1 + r.nextInt(3);		
			for(int i = 1; i <= 3; i++){
				if(i == ans){
					cards[i - 1] = new Card(i, "AA");
				}else{
					cards[i - 1] = new Card(i, "##");
				}
			}
			
			int tmp = 0;
			if(player1){
				System.out.println("Hello Player 1");
				tmp = amount1;
			}else{
				System.out.println("Hello Player 2");
				tmp = amount2;
			}
			System.out.println("Player 1 balance: " + amount1);
			System.out.println("Player 2 balance: " + amount2);
			System.out.println("Which one is the ace?");
			System.out.println("##\t##\t##");
			System.out.println(" 1\t 2\t 3");
			System.out.println("Your guess: (plase enter a number between 1 and 3)");
			int guess = sc.nextInt();
			if(guess < 1 || guess > 3){
				System.out.println("plase enter a number between 1 and 3");
				guess = sc.nextInt();
			}
			System.out.println("Your bet: (please enter a number between 5 and " + tmp + ")");
			int bet = sc.nextInt();
			if(bet < 5 || bet > tmp){
				System.out.println("please enter a number between 5 and " + tmp);
				bet = sc.nextInt();
			}
			if(guess == ans){
				System.out.println("Awesome!");
				tmp += bet;
			}else{
				System.out.println("Sorry...");
				tmp -= bet;
			}
			
			System.out.println(cards[0].getFace() + "\t" + cards[1].getFace() + "\t" + cards[2].getFace());
			System.out.println(" 1\t 2\t 3");
			
			if(player1){
				amount1 = tmp;
			}else{
				amount2 = tmp;
			}
			if(tmp >= 500 || tmp <= 0){
				break;
			}
			player1 = !player1;
			System.out.println("Continue? yes or no");
			str = sc.next();
		}
		System.out.println();
		if(amount1 >= 500 || amount2 <= 0){
			System.out.println("Player1 win!");
		}else if(amount2 >= 500 || amount1 <= 0){
			System.out.println("Player2 win.");
		}else{
			System.out.println("You exist the game.");
		}
		System.out.println("Player1 balance is: " + amount1);
		System.out.println("Player2 balance is: " + amount2);
		sc.close();
	}
}
