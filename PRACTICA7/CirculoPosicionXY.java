import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

public class CirculoPosicionXY extends JFrame implements ChangeListener {

    private JPanel panel;
    private JSlider ySlider, xSlider;
    private JLabel xLabel, yLabel;
    private JTextField xField, yField;
    public static void main(String[] args) {
        CirculoPosicionXY frame = new CirculoPosicionXY();
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

        
        xLabel = new  JLabel ("Coordenada x: ");
        window.add(xLabel);
        xField = new JTextField(7);
        window.add(xField);

        
        yLabel = new  JLabel ("Coordenada y: ");
        window.add(yLabel);
        yField = new JTextField(7);
        window.add(yField);

    }

    public void stateChanged(ChangeEvent event) {
      /**Crear la superficie donde de haran los cambios */
        Graphics paper = panel.getGraphics();

        paper.setColor(Color.black);
        paper.fillRect(0, 0, 500, 500);
       
         int x = xSlider.getValue();
         int y = ySlider.getValue();

         xField.setText(Integer.toString(x));
         yField.setText(Integer.toString(y));

        dibujarCirculo( paper, x, y, 100);
    }

    private void dibujarCirculo(Graphics areaCirculo, int xCentro, int yCentro, int radio){

        int x = xCentro - radio;
        int y = yCentro - radio;
        areaCirculo.setColor(Color.white);
        areaCirculo.drawOval(x, y, radio*2, radio*2);
    }
}