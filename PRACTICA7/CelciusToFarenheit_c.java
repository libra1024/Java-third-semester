import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

public class CelciusToFarenheit_c extends JFrame implements ChangeListener {

    private JPanel panel;
    private JSlider slider;
    public static void main(String[] args) {
        CelciusToFarenheit_c frame = new CelciusToFarenheit_c();
        frame.setSize(600, 500);
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
        
       

        slider = new JSlider( SwingConstants.HORIZONTAL, 0, 100, 0);
        window.add(slider);
        slider.addChangeListener(this);

    }

    public void stateChanged(ChangeEvent event) {
      /**Crear la superficie donde de haran los cambios */
        Graphics paper = panel.getGraphics();
/**Mis variables para modificar el tamnio de las barras */
        int celcius;
        double farenheit;
/**Valor que va a cambiar */
        celcius = slider.getValue();

        farenheit = (celcius * (9.0/5.0) ) + 32.0;

    paper.setColor(Color.white);
    paper.fillRect(0, 0, 400, 400);

    paper.setColor(Color.black);
    paper.drawString( celcius + "oC", celcius + 10, 25);

    paper.setColor(new Color(255, 215, 0));
    paper.fillRect(0, 0, celcius, 50);

    paper.setColor(Color.black);
    paper.drawString(farenheit + "oF", (int)farenheit + 10, 124);

    paper.setColor(new Color(75, 0, 130));
    paper.fillRect(0, 100, (int)farenheit, 50);




    }
}