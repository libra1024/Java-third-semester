/*
Titulo: Calculador de tiempo en segundos usando sobrecarga
Nombre: Roberto Hernandez Escobedo
Fecha: 2021/09/26

*/


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Exercise5_15 extends JFrame implements ActionListener {
    private JButton button;
    private JPanel panel;
    public static void main(String[] args) {
        Exercise5_15 frame = new Exercise5_15();
        frame.setSize(350, 300);
        frame.createGUI();
        frame.setVisible(true);
    }
    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout() );
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(300, 200));
        panel.setBackground(Color.white);
        window.add(panel);
        button = new JButton("Press me");
        window.add(button);
        button.addActionListener(this);
        }
        public void actionPerformed(ActionEvent event) {
            Graphics paper = panel.getGraphics();
            
            int horas, minutos, segundos;
            String horasString, minutosString, segundosString;

            horasString = JOptionPane.showInputDialog("Ingresa las horas: ");
            horas = Integer.parseInt(horasString);

            minutosString = JOptionPane.showInputDialog("Ingrese los minutos: ");
            minutos = Integer.parseInt(minutosString);

            segundosString = JOptionPane.showInputDialog("Ingrese los segundos: ");
            segundos = Integer.parseInt(segundosString);

            int totalSegs = segsEn(horas, minutos, segundos);

            JOptionPane.showMessageDialog(null, "Tiempor total: " + totalSegs );

        }

        private int segsEn(int horas, int  minutos, int segundos) {

            int sumaTotal = 0;

            sumaTotal = (horas*3600) + segsEn(minutos, segundos) ;




            return sumaTotal;

        }

        private int segsEn(int minutosV, int segundosV){

            int sumaTiempo = (minutosV * 60) + segundosV; 

            return sumaTiempo;
        }
        
}