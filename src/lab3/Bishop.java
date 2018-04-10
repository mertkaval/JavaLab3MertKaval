package lab3;

public class Bishop extends ChessPiece {
	private final static int BISHOP_VALUE=3;



	@Override
	void move() {
		// TODO Auto-generated method stub
		System.out.println("diagonally");
	}
	
	
	/*
	 * constructor of bishop class.
	 */
	public Bishop() {
		super(BISHOP_VALUE);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Bishop [getHowImportant()=" + getHowImportant() + "]";
	}
	
	
}



