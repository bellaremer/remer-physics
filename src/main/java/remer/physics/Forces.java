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
    }

}


