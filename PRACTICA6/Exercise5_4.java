/*
Titulo: Dibujar Circulo
Nombre: Roberto Hernandez Escobedo
Fecha: 2021/09/26

*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Exercise5_4 extends JFrame implements ActionListener {
    private JButton button;
    private JPanel panel;
    public static void main(String[] args) {
        Exercise5_4 frame = new Exercise5_4();
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
            
            int xCoordenate, yCoordenate, radioCirculo;
            String xCoordaneteString, yCoordaneteString, radioCirculoString;

            xCoordaneteString = JOptionPane.showInputDialog("Ingresa la coordenada x: ");
            xCoordenate = Integer.parseInt(xCoordaneteString);

            yCoordaneteString = JOptionPane.showInputDialog("Ingresa la coordenada y: ");
            yCoordenate = Integer.parseInt(yCoordaneteString);

            radioCirculoString = JOptionPane.showInputDialog("Ingresa el radio: ");
            radioCirculo = Integer.parseInt(radioCirculoString);
          
            dibujarCirculo(paper,xCoordenate,yCoordenate, radioCirculo);

        }

        private void dibujarCirculo(Graphics areaCirculo, int xCentro, int yCentro, int radio){

            int x = xCentro - radio;
            int y = yCentro - radio;

            areaCirculo.drawOval(x, y, radio*2, radio*2);



        }
        
}