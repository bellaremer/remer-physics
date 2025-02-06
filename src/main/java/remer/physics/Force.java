package remer.physics;

public class Force
{
        /*Force
        degree
        magnitude
        Force add(Force f)
         */

        private double degree;
        private double magnitude;

        public Force(double degree, double magnitude)
        {
            this.degree = degree;
            this.magnitude = magnitude;
        }

        public Force add(Force force)
        {
                double angle1 = Math.toRadians(this.degree);
                double angle2 = Math.toRadians(force.degree);

                double x1 = this.magnitude * Math.cos(angle1);
                double y1 = this.magnitude * Math.sin(angle1);
                double x2 = force.magnitude * Math.cos(angle2);
                double y2 = force.magnitude * Math.sin(angle2);

                double xResult = x1 + x2;
                double yResult = y1 + y2;

                double resultMagnitude = Math.sqrt(xResult * xResult + yResult * yResult);
                double resultDegree = Math.toDegrees(Math.atan2(yResult, xResult));

                return new Force(resultDegree, resultMagnitude);
        }

        public double getDegree()
        {
                return degree;
        }

        public double getMagnitude()
        {
                return magnitude;
        }
}
