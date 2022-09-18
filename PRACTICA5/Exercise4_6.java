
/*
    Titulo: Convertidor de grados Fahrenheit a Celcius
    Nombre: Hernandez Escobedo Roberto
    Fecha: 2021/09/14

*/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exercise4_6 extends JFrame implements ActionListener {
    private JButton button;

    public static void main(String[] args) {
        Exercise4_6 frame = new Exercise4_6();
        frame.setSize(400, 300);
        frame.createGUI();
        frame.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());
        button = new JButton("Press me");
        window.add(button);
        button.addActionListener(this);
    }

  /**
   * The function takes the input from the user, converts it to an integer, and then calculates the
   * conversion from Fahrenheit to Celsius
   * 
   * @param event The event that triggered this method.
   */
    public void actionPerformed(ActionEvent event) {

        int fahrenheit;
        String fahrenheitString;
        double c;

        fahrenheitString = JOptionPane.showInputDialog("Ingresa grados Fahrenheit : ");
        fahrenheit = Integer.parseInt(fahrenheitString);

        c = ((double) fahrenheit - 32) * (5.0 / 9.0);

        JOptionPane.showMessageDialog(null, "Los grados celcius son: " + c);
    }
}