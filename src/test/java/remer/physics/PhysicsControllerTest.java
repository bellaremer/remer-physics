package remer.physics;

import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.mockito.Mockito.*;


public class PhysicsControllerTest
{
    @Test
    public void calculate()
    {
        //given
        JSlider angleSlider = mock();
        doReturn(52).when(angleSlider).getValue();

        JTextField magnitudeField = mock();
        doReturn("80").when(magnitudeField).getText();

        JTextField timeField = mock();
        doReturn("10").when(timeField).getText();

        JLabel locationLabel = mock();

        // set up the dependencies using mocks
        PhysicsController controller = new PhysicsController(
                angleSlider, magnitudeField, timeField, locationLabel);

        //when
        controller.calculate();

        //then
        verify(locationLabel).setText("(565.69, 565.69)");
    }


}
