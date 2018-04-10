package lab3;

public class Pawn extends ChessPiece {
private final static int PAWN_VALUE=1;
	private boolean hasBeenPromoted;
	private ChessPiece newPiece;
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Pawn [getHowImportant()=" + getHowImportant() + " new piece : "+newPiece+"]";
	}

	@Override
	 void move() {
		
		System.out.println("Forward 1");
	}



	/**
	 * @return the hasBeenPromoted
	 */
	public boolean getHasBeenPromoted() {
		return hasBeenPromoted;
	}

	/**
	 * @return the newPiece
	 */
	public ChessPiece getNewPiece() {
		return newPiece;
	}

	/**
	 * use super method to provide relation between parent and child class.
	 */
	public Pawn() {
		super(PAWN_VALUE);
		// TODO Auto-generated constructor stub
	}

	
	public void promote(ChessPiece newPiece) {
		
		if(!(newPiece instanceof King)&&!(newPiece instanceof Pawn)) {
		
		this.hasBeenPromoted =true;
		this.newPiece =newPiece;
		}
		
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (hasBeenPromoted ? 1231 : 1237);
		result = prime * result + ((newPiece == null) ? 0 : newPiece.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pawn other = (Pawn) obj;
		if (hasBeenPromoted != other.hasBeenPromoted)
			return false;
		if (newPiece == null) {
			if (other.newPiece != null)
				return false;
		} else if (!newPiece.equals(other.newPiece))
			return false;
		return true;
	}
	
	
}
