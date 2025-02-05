public class forces
{
    public static void main(String[] args)
    {
        double force1 = 10;
        double angle1degrees = 32;

        double force2 = 10;
        double angle2degrees = 105;

        double angle1 = Math.toRadians(angle1degrees);
        double angle2 = Math.toRadians(angle2degrees);

        double force1X = force1 * Math.cos(angle1);
        double force1Y = force1 * Math.sin(angle1);

        double force2X = force2 * Math.cos(angle2);
        double force2Y = force2 * Math.sin(angle2);

        double forceX = force1X + force2X;
        double forceY = force1Y + force2Y;

        double totalMagnitude = Math.sqrt(forceX * forceX + forceY * forceY);

        double resultAngleRadian = Math.atan2(forceX, forceY);
        double resultAngleDegrees = Math.toDegrees(resultAngleRadian);

        System.out.println("The resulting force magnitude is: " + totalMagnitude);
        System.out.println("The resulting force angle is: " + resultAngleDegrees);

    }
}
