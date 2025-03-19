package remer.physics;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;

public class PhysicsFrame extends JFrame
{
    private final PhysicsController controller;
    private JLabel angleLabel = new JLabel("Angle Slider: ");
    private JSlider angleSlider = new JSlider(JSlider.HORIZONTAL, 0, 90, 45);
    private JTextField magnitudeField = new JTextField("Magnitude");
    private JTextField timeField = new JTextField("Time");
    private JLabel resultLabel = new JLabel("(x, y)");

    public PhysicsFrame()
    {
    // all of these methods are coming from the JFrame class, we are inheriting them
    // all the methods need to go in each frame
        setTitle("Moving Projectile");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new GridLayout(4, 2));

        controller = new PhysicsController(angleSlider, magnitudeField, timeField, resultLabel);

        //JButton calculateButton = new JButton("Calculate");
        // given an angle, magnitude, and time
        // what is the (x, y) coordinate - projectile?

        add(angleLabel);
        add(angleSlider);
        add(magnitudeField);
        add(resultLabel);
        add(timeField);
        add(new Label());   //blank space
        add(new Label());   //blank space
        //add(calculateButton);

        angleSlider.addChangeListener(new ChangeListener() {
            //recalculate projectile location
            @Override
            public void stateChanged(ChangeEvent e) {
                controller.calculate();
            }
        });

        magnitudeField.getDocument().addDocumentListener(new DocumentListener() {

            public void insertUpdate(DocumentEvent e) {
                controller.calculate();
            }

            public void removeUpdate(DocumentEvent e) {
                controller.calculate();
            }

            public void changedUpdate(DocumentEvent e) {
                controller.calculate();

            }
        });

        timeField.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {
                controller.calculate();
            }
            public void insertUpdate(DocumentEvent e) {
                controller.calculate();
            }
            public void removeUpdate(DocumentEvent e) {
                controller.calculate();
            }
        });
    }

    public static void main(String[] args) {
        PhysicsFrame frame = new PhysicsFrame();
        frame.setVisible(true);
    }
}