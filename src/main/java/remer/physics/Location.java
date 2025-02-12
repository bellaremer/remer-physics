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

        public Location apply(Force f)
        {
            double angleRadians = Math.toRadians(f.getDegree());

            double deltaX = f.getMagnitude() * Math.cos(angleRadians);
            double deltaY = f.getMagnitude() * Math.sin(angleRadians);

            return new Location(this.x + deltaX, this.y + deltaY);
        }

        public double getX()
        {
            return x;
        }

        public double getY()
        {
            return y;
        }
}
