/*
    Titulo: Calculo de resistencias
    Nombre: Hernandez Escobedo Roberto
    Fecha: 2021/09/14

*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exercise4_8 extends JFrame implements ActionListener {
    private JButton button;

    public static void main(String[] args) {
        Exercise4_8 frame = new Exercise4_8();
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
   * It takes two resistances, adds them together, and then divides them by the sum of the two
   * resistances.
   * </code>
   * 
   * @param event The event that triggered this method.
   */
    public void actionPerformed(ActionEvent event) {

        int resistencia1, resistencia2;
        String resistencia1String, resistencia2String;
        double resistenciaEnSerie, resistenciaEnParalelo;

        // Asking the user to input two resistances and then converting them to integers.
        resistencia1String = JOptionPane.showInputDialog("Resistencia 1 : ");
        resistencia1 = Integer.parseInt(resistencia1String);
        resistencia2String = JOptionPane.showInputDialog("Resistencia 2 : ");
        resistencia2 = Integer.parseInt(resistencia2String);

      // It takes two resistances, adds them together, and then divides them by the sum of the two
      // resistances.
        //On series
        resistenciaEnSerie = resistencia1 + resistencia2;
        //On parell
        resistenciaEnParalelo = ((double) resistencia1 * (double) resistencia2)
                / ((double) resistencia1 + (double) resistencia2);

        JOptionPane.showMessageDialog(null, "Resistencias en serie: "
                + resistenciaEnSerie + "\n Resistencias en paralelo: " + resistenciaEnParalelo);
    }
}