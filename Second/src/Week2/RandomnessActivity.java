package Week2;
import java.util.Random;
import java.util.Scanner;


public class RandomnessActivity {
	public static void main(String[] args){
		Card[] cards = new Card[3];
		Random r = new Random();
		int ans = 1 + r.nextInt(3);
		
		for(int i = 1; i <= 3; i++){
			if(i == ans){
				cards[i - 1] = new Card(i, "AA");
			}else{
				cards[i - 1] = new Card(i, "##");
			}
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Which one is the ace?");
		System.out.println("##\t##\t##");
		System.out.println(" 1\t 2\t 3");
		System.out.println("Your guess: ");
		int guess = sc.nextInt();
		if(guess == ans){
			System.out.println("Awesome!");
		}else{
			System.out.println("Sorry...");
		}
		
		System.out.println(cards[0].getFace() + "\t" + cards[1].getFace() + "\t" + cards[2].getFace());
		System.out.println(" 1\t 2\t 3");
	}
}
