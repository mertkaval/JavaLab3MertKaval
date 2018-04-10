package lab3;

public class King extends ChessPiece {
private final static int KING_VALUE =1000;
	/* (non-Javadoc)
	 * @see lab3.ChessPiece#move()
	 */
	@Override
	void move() {
		// TODO Auto-generated method stub
		System.out.println("one square");
	}

/*
 * constructor of king class
 */
public King() {
	super(KING_VALUE);
	// TODO Auto-generated constructor stub
}


/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "King [getHowImportant()=" + getHowImportant() + "]";
}
	
	
	
	

}
