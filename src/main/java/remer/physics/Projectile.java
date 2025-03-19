package remer.physics;
import static remer.physics.Force.GRAVITY;

public class Projectile
{

    /* methods for projectile class
        - add(force) --> does not return anything here, applying gravity
            - takes force and adds it to Force class
            - adding gravity to current force
        - move(time)
            - take Force class, scale it based on time, and then move the location based on that scaled force
            - scaled = force.scale(time)
            - location = location.move(scaled)
       write a test for projectile
     */

        private Location location;
        private Force force;
        private int radius;


        public Projectile(Location location, Force force, int radius){
            this.location = location;
            this.force = force;
            this.radius = radius;
        }

        public void  add(Force force)
        {
            //adding gravity to current force
            this.force = this.force.add(force);
            //updating the force
        }


        public void move(double time)
        {
            Force scaled = force.scale(time);
            //scaling it in order to get a small force
            location = location.move(scaled);
            //moving location based on scaled force
        }


        public Location getLocation()
        {
            return location;
        }

        public int getRadius()
        {
            return radius;
        }
}