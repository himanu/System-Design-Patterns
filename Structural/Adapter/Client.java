package Structural.Adapter;

public class Client {

    public static void main(String[] args) {
        /** Without adpater it would threw error */
        // SquarePeg squarePeg = new SquarePeg();
        RoundHole roundHole = new RoundHole();
        // boolean fits = roundHole.fits(squarePeg);
        // System.out.println("Fits value " + fits);

        SquarePegAdapter squarePegAdapter = new SquarePegAdapter();
        boolean fits = roundHole.fits(squarePegAdapter);
        System.out.println("Fits value " + fits);
    }
}
