package remer.physics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ForceTest
{
       @Test
        public void add()
        {
            // given - set up variables
            Force a = new Force(32, 10);
            Force b = new Force(105, 10);

            // when - run the test
            Force c = a.add(b);

            // then - check results of test
            assertEquals(68.5, c.getAngle(), 0.1);
            assertEquals(16.08, c.getMagnitude(), 0.1);

        }

        @Test
        public void scale()
        {
            Force originalForce = new Force(30, 15);
            double scalingFactor = 0.391;

            Force scaledForce = originalForce.scale(scalingFactor);

            assertEquals(30, scaledForce.getAngle(), 0.1);
            assertEquals(5.865, scaledForce.getMagnitude(), 0.1);
        }
}