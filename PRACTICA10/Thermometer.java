import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

public class Thermometer extends JFrame implements ChangeListener {

    private JSlider slider;
    private JLabel maxLabel, minLabel;
    private JTextField maxField, minField;
    public Memory memory;

    public static void main(String[] args) {
        Thermometer frame = new Thermometer();
        frame.setSize(600, 500);
        frame.createGUI();
        frame.setVisible(true);
    }

    private void createGUI() {

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        slider = new JSlider(SwingConstants.VERTICAL, 0, 100, 50);
        window.add(slider);
        slider.addChangeListener(this);

        this.maxLabel = new JLabel("Max:");
        window.add(this.maxLabel);

        this.maxField = new JTextField(4);
        window.add(this.maxField);

        this.minLabel = new JLabel("Min:");
        window.add(this.minLabel);

        this.minField = new JTextField(4);
        window.add(this.minField);

        this.memory = new Memory();

    }

    public void stateChanged(ChangeEvent event) {

        int thermometerValue = slider.getValue();

        memory.setValue(thermometerValue);

        int min = memory.getLowestValue();
        int max = memory.getHighestValue();

        this.minField.setText(Integer.toString(min));
        this.maxField.setText(Integer.toString(max));

    }

}