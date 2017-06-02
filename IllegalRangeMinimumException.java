package net.hollowbit.vedi0boy.rangeindexer;

/**
 * Created by Nathanael on 6/2/2017.
 */
public class IllegalRangeMinimumException extends IllegalArgumentException {

    public IllegalRangeMinimumException() {
        super("The specified range minimum is illegal. It must be less than the first range limit.");
    }

}
