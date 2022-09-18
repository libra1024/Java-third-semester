import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CelciusToFarenheit_a extends JFrame implements ActionListener {

    private JTextField celciusField, farenheitField;
    private JLabel celciusLabel, farenheitLabel;
    private JButton  convertirButton;
    public static void main(String[] args) {
        CelciusToFarenheit_a frame = new CelciusToFarenheit_a();
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

       convertirButton = new JButton("Convertir");
        window.add(convertirButton);
        convertirButton.addActionListener(this);

        farenheitField = new JTextField(7);
        window.add(farenheitField);
        farenheitLabel = new JLabel("oF");
        window.add(farenheitLabel);
     
    }

    public void actionPerformed(ActionEvent event) {

        double celciusGrades;
        celciusGrades = Double.parseDouble(celciusField.getText());

        double farenheit;

        farenheit = (celciusGrades * 9.0) / 5.0 + 32.0;


        farenheitField.setText(Double.toString(farenheit));


    }
}