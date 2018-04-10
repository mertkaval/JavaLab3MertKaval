package lab3;

public class Knight extends ChessPiece {
	
	private final static int KNIGHT_VALUE =2;
	/* (non-Javadoc)
	 * @see lab3.ChessPiece#move()
	 */
	@Override
	void move() {
		// TODO Auto-generated method stub
		System.out.println("like an L");
	}

/*
 * constructor of knight class.
 */
public Knight() {
	super(KNIGHT_VALUE);
	// TODO Auto-generated constructor stub
}


/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Knight [getHowImportant()=" + getHowImportant() + "]";
}



}
