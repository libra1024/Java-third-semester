/*
    Titulo: Contador de tiempo
    Nombre: Hernandez Escobedo Roberto
    Fecha: 2021/09/14

*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exercise4_7 extends JFrame implements ActionListener {
    private JButton button;

    public static void main(String[] args) {
        Exercise4_7 frame = new Exercise4_7();
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
    * It takes a number of seconds and converts it to hours, minutes, and seconds
    * 
    * @param event The event that triggered the action.
    */
    public void actionPerformed(ActionEvent event) {

        int cantidad;
        int horas, minutos, segundos;
        String cantidadString;

        // Asking the user to input a number of seconds and then converting it to an integer.

        cantidadString = JOptionPane.showInputDialog("Ingresa los segundo : ");
        cantidad = Integer.parseInt(cantidadString);

        // Converting the number of seconds into hours, minutes, and seconds.
        horas = cantidad / 3600;
        minutos = (cantidad % 3600) / 60;
        segundos = cantidad % 60;

        // Showing the message dialog with the hours, minutes, and seconds.
        JOptionPane.showMessageDialog(null, "Horas: " + horas + "\n Minutos: " + minutos + "\n Segundos: " + segundos);
    }
}