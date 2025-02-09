package remer.physics;

public class Forces
{
    public static void main(String[] args)
    {
        Force force1 = new Force(32, 10);
        Force force2 = new Force(105, 10);

        Force resultForce = force1.add(force2);

        System.out.println("Resultant Force is: ");
        System.out.println("Degree: " + resultForce.getDegree());
        System.out.println("Magnitude: " + resultForce.getMagnitude());

        double scalingFactor = 0.391;
        Force scaledForce = force1.scale(scalingFactor);

        System.out.println("Scaled Force is: ");
        System.out.println("Degree: " + scaledForce.getDegree());
        System.out.println("Magnitude: " + scaledForce.getMagnitude());

        Location initialLocation = new Location(7, 3);
        System.out.println("Initial Location: ");
        System.out.println("X: " + initialLocation.getX());
        System.out.println("Y: " + initialLocation.getY());

        Location newLocation = initialLocation.apply(scaledForce);
        System.out.println("New location after applying scaled force: ");
        System.out.println("X: " + newLocation.getX());
        System.out.println("Y: " + newLocation.getY());
    }
}


