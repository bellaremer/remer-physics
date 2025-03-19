package remer.physics;

public class Force
{
        public static final Force GRAVITY = new Force(0, -9.8);

        private double x;
        private double y;

        public Force(Angle angle, double magnitude)
        {
                x = magnitude * Math.cos(angle.toRadians());
                y = magnitude * Math.sin(angle.toRadians());
        }

        public Force(double x, double y)
        {
                this.x = x;
                this.y = y;
        }

        public double getAngle()
        {
            return Math.toDegrees(Math.atan2(y, x));
        }

        public double getMagnitude()
        {
            return Math.hypot(x, y);
        }

        public double getX()
        {
                return x;
        }

        public double getY()
        {
                return y;
        }

        public Force add(Force force)
        {
                return new Force(x + force.x, y + force.y);
        }

        public Force scale(double t)
        {
                double scaledMagnitude = this.y * t;
                return new Force(this.x, scaledMagnitude);
        }
}
