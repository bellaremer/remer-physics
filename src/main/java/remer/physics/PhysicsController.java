package remer.physics;

import javax.swing.*;

public class PhysicsController
{
    // looking for the UI classes that change
    // member variable - outside method or constructor
    private final JSlider slider;
    private final JTextField magnitudeField;
    private final JTextField timeField;
    private final JLabel locationLabel;

    public PhysicsController(JSlider slider, JTextField magnitudeField, JTextField timeField, JLabel locationLabel) {
        this.slider = slider;
        this.magnitudeField = magnitudeField;
        this.timeField = timeField;
        this.locationLabel = locationLabel;
    }

    public void calculate()
    {
        double angle = slider.getValue();
        double magnitude = Double.parseDouble(magnitudeField.getText());

        String magnitudeText = magnitudeField.getText();
        if (magnitudeText.isEmpty() || !magnitudeText.matches("\\d+")) {
            return;
        }

        Projectile p = new Projectile(new Location(0, 0), new Force(new Angle(angle), magnitude), 10 );

        String timeText = timeField.getText();
        if (timeText.isEmpty() || !timeText.matches("\\d+")) {
            return;
        }

        double time = Double.parseDouble(timeField.getText());
        for (int i = 0; i < time; i++)
        {
            p.move(1);
        }

        Location location = p.getLocation();
        String formatX = String.format("%.2f", location.getX());
        String formatY = String.format("%.2f", location.getY());
        locationLabel.setText("(" + formatX + ", " + formatY + ")");
    }
}
