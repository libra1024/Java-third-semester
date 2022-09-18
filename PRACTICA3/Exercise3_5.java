import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exercise3_5 extends JFrame implements ActionListener {
   
    private JButton boton1;
    private JPanel panel;

    public static void main(String[]args) {
        
        Exercise3_5 frame = new Exercise3_5();
        frame.setSize(500, 400);
        frame.createGUI();
        frame.setVisible(true);
    }
    private void createGUI() {
    
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout() );
        
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(400, 300));
        panel.setBackground(Color.white);
        window.add(panel);
       
        boton1= new JButton("Press me");
        window.add(boton1);
        boton1.addActionListener(this);
    }

   // Creating a table of colors.
    public void actionPerformed(ActionEvent event) {
        Graphics paper = panel.getGraphics();
     
        /*Tabla de colores */
     // Drawing a polygon.
        int[] xPoints={50,250,250,50,50};
        int[] yPoints={50,50,200,200,50};
        paper.drawPolygon(xPoints, yPoints, 4);

    // Creating a table of colors.

        /*Color 1 negro */
        paper.setColor(Color.black);
        paper.fillRect(60,60,20,20);

        /*Color 2 azul */
        paper.setColor(Color.blue);
        paper.fillRect(90,60,20,20);

        /*Color 3 amarillo */
        paper.setColor(Color.yellow);
        paper.fillRect(120,60,20,20);

        /*Color 4 anaranjado */
        paper.setColor(Color.orange);
        paper.fillRect(150,60,20,20);

        /*Color 5 Verde */
        paper.setColor(Color.green);
        paper.fillRect(180,60,20,20);

        /*Color 6 rosa */
        paper.setColor(Color.pink);
        paper.fillRect(60,100,20,20);

        /*Color 7 magenta */
        paper.setColor(Color.magenta);
        paper.fillRect(90,100,20,20);

        /*Color 8 cafe */
        paper.setColor(new Color(153,76,0));
        paper.fillRect(120,100,20,20);

        /*Color 9 carmesi*/
        paper.setColor(new Color(204,0,0));
        paper.fillRect(150,100,20,20);

        /*Color 10 oliva */
        paper.setColor(new Color(128,128,0));
        paper.fillRect(180, 100, 20, 20);

        /*Color 11 cyan */
        paper.setColor(Color.cyan);
        paper.fillRect(60, 140, 20, 20);

        /*Color 12 rojo */
        paper.setColor(Color.red);
        paper.fillRect(90, 140, 20, 20);

        /*Color 13  purpura*/
        paper.setColor(new Color(128,0,128));
        paper.fillRect(120, 140, 20, 20);



    }
}