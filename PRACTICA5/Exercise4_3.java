/*
    Titulo: Promedio de tres calificaciones
    Nombre: Hernandez Escobedo Roberto
    Fecha: 2021/09/14

*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exercise4_3 extends JFrame implements ActionListener {
    private JButton button;

    public static void main(String[] args) {
        Exercise4_3 frame = new Exercise4_3();
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
    * The function takes in three integers, adds them together, and then divides the sum by three, finally give us 
    * a score
    * 
    * @param event The event that triggered this method.
    */
    public void actionPerformed(ActionEvent event) {

       // Declaring the variables that will be used in the program.
        int nota1, nota2, nota3;

        String nota1String, nota2String, nota3String;

        double promedio, suma;

       // Asking the user to input three different grades, then it adds them together and divides them
       // by three to get the average.
        nota1String = JOptionPane.showInputDialog("Nota 1: ");
        nota1 = Integer.parseInt(nota1String);
        nota2String = JOptionPane.showInputDialog("Nota 2: ");
        nota2 = Integer.parseInt(nota2String);
        nota3String = JOptionPane.showInputDialog("Nota 3: ");
        nota3 = Integer.parseInt(nota3String);
        suma = nota1 + nota2 + nota3;
        promedio = suma / 3;

        JOptionPane.showMessageDialog(null, "Promedio es: " + promedio);
    }
}