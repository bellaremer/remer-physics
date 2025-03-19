package remer.physics;

public class Location
{
        private double x;
        private double y;

        public Location(double x, double y)
        {
            this.x = x;
            this.y = y;
        }

    public Location move(Force f)
        {
            double angleRadians = Math.toRadians(f.getAngle());

            double deltaX = f.getMagnitude() * Math.cos(angleRadians);
            double deltaY = f.getMagnitude() * Math.sin(angleRadians);

            return new Location(this.x + deltaX, this.y + deltaY);
        }

        public java.lang.Object getX()
        {
            return x;
        }

        public java.lang.Object getY()
        {
            return y;
        }

    @Override
    public String toString() {
        return "Location{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
