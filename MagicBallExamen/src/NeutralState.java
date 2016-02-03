
public class NeutralState implements IState {

	Ball ball;
	
	public NeutralState(Ball ball) {
		this.ball = ball;
	}
	
	@Override
	public String roll(int r) {
		switch(r) {
			case 11:
				return "Reply hazy try again";
			case 12:
				return "Ask again later";
			case 13:
				return "Better not tell you now";
			case 14:
				return "Cannot predict now";
			case 15:
				return "Concentrate and ask again";
		}
		return null;
	}

}
