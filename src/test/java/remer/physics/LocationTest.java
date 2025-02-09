package remer.physics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LocationTest
{
    @Test
    public void apply()
    {
        Location originalLocation = new Location(7, 3);
        Force force = new Force(36.87, 5);

        Location newLocation = originalLocation.apply(force);

        assertEquals(11, newLocation.getX(), 0.1);
        assertEquals(6, newLocation.getY(), 0.1);
    }
}
