/*
    Titulo: Maquina de cambio
    Nombre: Hernandez Escobedo Roberto
    Fecha: 2021/09/14

*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exercise4_9 extends JFrame implements ActionListener {
    private JButton button;

    public static void main(String[] args) {
        Exercise4_9 frame = new Exercise4_9();
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

 // Calculating the change for a purchase.
    public void actionPerformed(ActionEvent event) {

        int dinero, cambio;
        int cincuenta = 0, veinte = 0, diez = 0, cinco = 0, dos = 0, uno = 0;
        String dineroString;

        dineroString = JOptionPane.showInputDialog("Ingresa dinero : ");
        dinero = Integer.parseInt(dineroString);

        // Calculating the change that the user should receive.
        cambio = 100 - dinero;

        if (cambio >= 50) {
            cincuenta = cambio / 50;
            cambio = cambio % 50;
        }
        if (cambio >= 20) {
            veinte = cambio / 20;
            cambio = cambio % 20;
        }
        if (cambio >= 10) {
            diez = cambio / 10;
            cambio = cambio % 10;
        }
        if (cambio >= 5) {
            cinco = cambio / 5;
            cambio = cambio % 5;
        }
        if (cambio >= 2) {
            dos = cambio / 2;

            cambio = cambio % 2;
        }
        if (cambio >= 1) {
            uno = cambio / 1;

        }

        JOptionPane.showMessageDialog(null, "Cincuenta: " + cincuenta + "\nVeinte: " + veinte + "\nDiez: " + diez
                + "\nCinco: " + cinco + "\nDos: " + dos + "\n Uno" + 1);
    }
}