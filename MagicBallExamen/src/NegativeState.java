
public class NegativeState implements IState {

	Ball ball;
	
	public NegativeState(Ball ball) {
		this.ball = ball;
	}
	
	@Override
	public String roll(int r) {
		switch(r) {
			case 16:
				return "Don't count on it";
			case 17:
				return "My reply is no";
			case 18:
				return "My sources say no";
			case 19:
				return "Outlook not so good";
			case 20:
				return "Very doubtful";
		}
		return null;
	}

}
