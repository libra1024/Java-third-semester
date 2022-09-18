import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

public class CirculoTresPuntos extends JFrame implements ChangeListener {

    private JPanel panel;
    private JSlider ySlider, xSlider, radioSlider;
    private JLabel xLabel, yLabel, radioLabel;
    private JTextField xField, yField, radioField;
  

    public static void main(String[] args) {
        CirculoTresPuntos frame = new CirculoTresPuntos();
        frame.setSize(500, 500);
        frame.createGUI();
        frame.setVisible(true);
    }
    private void createGUI() {

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        panel = new JPanel();

        panel.setPreferredSize(new Dimension(400, 400));
        panel.setBackground(Color.white);
        window.add(panel);
        
        xSlider = new JSlider( SwingConstants.VERTICAL, 0, 400, 0);
        window.add(xSlider);
        xSlider.addChangeListener(this);

        ySlider = new JSlider( SwingConstants.VERTICAL, 0, 400, 0);
        window.add(ySlider);
        ySlider.addChangeListener(this);

        radioSlider = new JSlider( SwingConstants.VERTICAL, 0, 200, 0);
        window.add(radioSlider);
        radioSlider.addChangeListener(this);

        
        xLabel = new  JLabel ("Coordenada x: ");
        window.add(xLabel);
        xField = new JTextField(7);
        window.add(xField);

        
        yLabel = new  JLabel ("Coordenada y: ");
        window.add(yLabel);
        yField = new JTextField(7);
        window.add(yField);

        radioLabel = new  JLabel ("Radio: ");
        window.add(radioLabel);
        radioField = new JTextField(7);
        window.add(radioField);

    }

    public void stateChanged(ChangeEvent event) {
      /**Crear la superficie donde de haran los cambios */
        Graphics paper = panel.getGraphics();

        paper.setColor(Color.white);
        paper.fillRect(0, 0, 500, 500);
       
         int x = xSlider.getValue();
         int y = ySlider.getValue();
         int r = radioSlider.getValue();

         paper.setColor(Color.black);
         paper.fillOval(100, 100, 10, 10);
         paper.fillOval(200, 200, 10, 10);
         paper.fillOval(200, 100, 10, 10);

        /**Circulo general */
        dibujarCirculo( paper, x, y, r);
   

         xField.setText(Integer.toString(x));
         yField.setText(Integer.toString(y));
         radioField.setText(Integer.toString(r));

        
    }

    private void dibujarCirculo(Graphics areaCirculo, int xCentro, int yCentro, int radio){

        int x = xCentro - radio;
        int y = yCentro - radio;
        areaCirculo.setColor(Color.black);
        areaCirculo.drawOval(x, y, radio*2, radio*2);
    }
}