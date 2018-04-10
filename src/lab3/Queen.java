package lab3;

public class Queen extends ChessPiece {

	private final static int QUEEN_VALUE =9;
	/* (non-Javadoc)
	 * @see lab3.ChessPiece#move()
	 */
	@Override
	void move() {
		// TODO Auto-generated method stub
		System.out.println("like a bishop or a rook");
	}

/*
 * constructor of queen class.
 */
public 	Queen() {
	super(QUEEN_VALUE);
	// TODO Auto-generated constructor stub
}


/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Queen [getHowImportant()=" + getHowImportant() + "]";
}
	
	
	
}
