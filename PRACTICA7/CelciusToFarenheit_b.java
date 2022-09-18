import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class CelciusToFarenheit_b extends JFrame implements ChangeListener {

    private JTextField celciusField, farenheitField;
    private JLabel celciusLabel, farenheitLabel;
    private JSlider slider;
    public static void main(String[] args) {
        CelciusToFarenheit_b frame = new CelciusToFarenheit_b();
        frame.setSize(600, 150);
        frame.createGUI();
        frame.setVisible(true);
    }
    private void createGUI() {

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());
        
        celciusField = new JTextField(7);
        window.add(celciusField);
        celciusLabel = new JLabel("oC");
        window.add(celciusLabel);

        slider = new JSlider( SwingConstants.HORIZONTAL, -100, 100, 0);
        window.add(slider);
        slider.addChangeListener(this);

        farenheitField = new JTextField(7);
        window.add(farenheitField);
        farenheitLabel = new JLabel("oF");
        window.add(farenheitLabel);
     
    }

    public void stateChanged(ChangeEvent event) {

        int celcius;
        double farenheit;

        celcius = slider.getValue();

        farenheit = (celcius * (9.0/5.0) ) + 32;

        celciusField.setText(Integer.toString(celcius));
        farenheitField.setText(Double.toString(farenheit));



    }
}