package lab3;

public abstract class ChessPiece {

	private int howImportant;

	/**
	 * @return the howImportant
	 */
	public int getHowImportant() {
		return howImportant;
	}

	/*
	 * default constructor.
	 */
	public ChessPiece() {

	}

	/**
	 * This is the constructor
	 * @param howImportant points of each piece
	 **/
	public ChessPiece(int howImportant) {
		this.howImportant = howImportant;
	}

	/**
	 * @param howImportant
	 *            the howImportant to set
	 */
	public void setHowImportant(int howImportant) {
		this.howImportant = howImportant;
	}

	abstract void move();

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */

	@Override
	public String toString() {
		return "ChessPiece [howImportant=" + howImportant + "]";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + howImportant;
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChessPiece other = (ChessPiece) obj;
		if (howImportant != other.howImportant)
			return false;
		return true;
	}

}
