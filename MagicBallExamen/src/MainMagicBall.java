
import java.io.IOException;
import java.util.Scanner;

public class MainMagicBall {

	public static void main(String[] args) throws IOException {
		Ball fortuneBall = Ball.getInstance();
		fortuneBall.init();//initialize your ball
		boolean quit = false;
		String input = "";
		Scanner scan; //input
		while (!quit) {
			
			System.out.println("Please type your fortune :");
			scan = new Scanner(System.in); //in scan opgeslagen, kan je later nog iets mee doen indoen nodig
			input = scan.nextLine();
			if (input.equalsIgnoreCase("quit")) //extra punten aub
				quit = true;
			else
			System.out.println(fortuneBall.makeFortune());
		}
		System.out.println("Thanks for playing!");
	}
}
