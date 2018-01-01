package convert;

public class InvalidInputByUser extends RuntimeException {
	
	private static final long serialVersionUID = 8729102756L;
	
	public InvalidInputByUser(String input) {
		super(input);
	}

}
