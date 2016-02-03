public class PositiveState implements IState {
	
	Ball ball;
	
	public PositiveState(Ball ball) {
		this.ball = ball;
	}

	@Override
	public String roll(int r) {
		switch(r) {
		case 1:
			return "It is certain";
		case 2:
			return "It is decidedly so";
		case 3:
			return "Without a doubt";
		case 4:
			return "Yes, definitely";
		case 5:
			return "You may rely on it";
		case 6:
			return "As I see it, yes";
		case 7:
			return "Most likely";
		case 8:
			return "Outlook good";
		case 9:
			return "Yes";
		case 10:
			return "Signs point to yes";
		}
		return null;
	}
}
