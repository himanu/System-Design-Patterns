package Structural.Adapter;
/** SquarePeg is incompatible with RoundHole
 * RoundHole fits method needs an object to type RoundPeg only
 * Our goal is to check whether a square peg can fit in round hole using fit method
 * So we would basically extends RoundPeg class and override getRadiuos method
 * The method would use width of square to calculate minimum radius
 * Now we would pass SquarePegAdapter object to fit method of the RoundHole
 * With this pattern we are able to check whether a square peg fits in round hole or not.
 */
public class SquarePegAdapter extends RoundPeg {
    private SquarePeg squarePegObj;

    SquarePegAdapter() {
        this.squarePegObj = new SquarePeg();
    }

    int getRadious() {
        return (int)(squarePegObj.getWidth() * 2 / Math.sqrt(2));
    }
    
}
