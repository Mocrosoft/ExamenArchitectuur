import java.util.ArrayList;
import java.util.Random;

public class Ball {
	//states
	IState positive;
	IState negative;
	IState neutral;
	IState currentState;
	
	int timesRolled;
	ArrayList<Integer> currentFortunes; //lijst van aantal gerolde fortunes
	
	private static Ball instance = new Ball(); //instance
	
	private Ball() {}

	
	public static Ball getInstance() { //singleton
		return instance;
	}
	
	public void init() { //init omdat we met een constructor werken
		positive = new PositiveState(instance);
		negative = new NegativeState(instance);
		neutral = new NeutralState(instance);
		setCurrentState(neutral);
		timesRolled = 0;
		currentFortunes = new ArrayList<Integer>();
	}
	
	public String makeFortune() {
		Random r = new Random();
		boolean duplicateFound;
		int choice;
		String result = "";
		do {
			duplicateFound = false; //we beginnen met false
			choice = 1 + r.nextInt(20); //genereer
			for(int value : currentFortunes) {
				if (value == choice) { //hebben we de waarde al?
					duplicateFound = true; //duplicate found dus repeat het generen
				}
			}
		} while(duplicateFound);
		
		if (choice >= 1 && choice <= 10) {
			currentState = positive;
			result = currentState.roll(choice);
		} else if (choice > 10 && choice <= 15)  {
			currentState = neutral;
			result = currentState.roll(choice);
		} else {
			currentState = negative;
			result = currentState.roll(choice);
		}
		if (timesRolled % 10 == 0) {
			currentFortunes.clear();
		} else {
			timesRolled++;
			currentFortunes.add(choice);
		}
		return result + "\t --> [" + currentState.getClass().getName() + "]";
	}

	public IState getCurrentState() {
		return currentState;
	}

	public void setCurrentState(IState currentState) {
		this.currentState = currentState;
	}
}
