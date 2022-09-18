import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AreaRectangulo extends JFrame implements ActionListener {

    private JTextField number1Field, number2Field, areaField;
    private JLabel equalsLabel, number1Label, number2Label;
    private JButton  multiplyButton;
    public static void main(String[] args) {
        AreaRectangulo frame = new AreaRectangulo();
        frame.setSize(600, 150);
        frame.createGUI();
        frame.setVisible(true);
    }
    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        
        number1Label = new  JLabel ("Numero 1: ");
        window.add(number1Label);
        number1Field = new JTextField(7);
        window.add(number1Field);


        multiplyButton = new JButton("*");
        window.add( multiplyButton);
        multiplyButton.addActionListener(this);

        number2Label = new  JLabel ("Numero 2: ");
        window.add(number2Label);
        number2Field = new JTextField(7);
        window.add(number2Field);

        equalsLabel = new JLabel("Area rectangulo = ");
        window.add(equalsLabel);

        areaField = new JTextField(7);
        window.add(areaField);
    }

    public void actionPerformed(ActionEvent event) {

        int number1 = Integer.parseInt(number1Field.getText());
        int number2 = Integer.parseInt(number2Field.getText());

        int area = number1 * number2;

        areaField.setText(Integer.toString(area));


    }
}