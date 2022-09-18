import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exercise3_3 extends JFrame implements ActionListener {
   
    private JButton boton1;
    private JPanel panel;

  /**
   * The main function creates a new frame, sets the size of the frame, creates the GUI, and makes the
   * frame visible
   * 
   * @param args This is the array of strings that are passed to the main method.
   */
    public static void main(String[]args) {
        
        Exercise3_3 frame = new Exercise3_3();
        frame.setSize(400, 300);
        frame.createGUI();
        frame.setVisible(true);
    }
/**
 * The function creates a new JPanel, sets its size and background color, and adds it to the window. It
 * also creates a new JButton, adds it to the window, and adds an action listener to it.
 */
    private void createGUI() {
    
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout() );
        
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(300, 220));
        panel.setBackground(Color.white);
        window.add(panel);
       
        boton1= new JButton("Press me");
        window.add(boton1);
        boton1.addActionListener(this);
    }

   /**
    * The function draws a tic-tac-toe board, a mouse, a cat, and a line indicating a winning move
    * 
    * @param event The event that triggered the action.
    */
    public void actionPerformed(ActionEvent event) {
        Graphics paper = panel.getGraphics();
        /*Lineas horizontales*/
        paper.drawLine(20,80,200,80);
        paper.drawLine(20,140,200,140);
        /*Lineas verticales */
        paper.drawLine(80,20,80,200);
        paper.drawLine(140,20,140,200);
        /*Raton */
        paper.drawOval(90,90,40,40);
        paper.fillOval(30,30,40,40);
        paper.drawOval(150,150,40,40);
        /*Gato*/
        /*Primera cruz */
        paper.drawLine(150,30,190,70);
        paper.drawLine(150,70,190,30);
        /*Segunda cruz */
        paper.drawLine(30,150,70,190);
        paper.drawLine(70,150,30,190);
        /*Linea indica jugada ganada */
        paper.drawLine(20,20,200,200);

        }
}