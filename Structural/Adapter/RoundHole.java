package Structural.Adapter;

public class RoundHole {
    private int radious = 10;
    /** RoundHole class is only compatible with RoundPeg class */
    Boolean fits(RoundPeg peg) {
        return peg.getRadious() <= this.radious;
    }
}
