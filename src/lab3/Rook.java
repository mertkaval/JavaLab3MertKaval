package lab3;

public class Rook extends ChessPiece{

	private final static int ROOK_VALUE =5;
	/* (non-Javadoc)
	 * @see lab3.ChessPiece#move()
	 */
	@Override
	void move() {
		// TODO Auto-generated method stub
		System.out.println("like a bishop or a rook");
	}

/*
 * constructor of rook class.
 */
public 	Rook() {
	super(ROOK_VALUE);
	// TODO Auto-generated constructor stub
}


/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Rook [toString()=" + super.toString() + "]";
}


}
