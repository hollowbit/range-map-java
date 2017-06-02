package net.hollowbit.vedi0boy.rangeindexer;

public class IllegalNextRangeLimitException extends IllegalArgumentException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IllegalNextRangeLimitException() {
		super("The given next range limit value cannot be smaller than or equal to the previously specified range limit.");
	}
	
}
