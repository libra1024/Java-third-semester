import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exercise3_1_b extends JFrame implements ActionListener {
   
  // Declaring the variables.
    private JButton boton1;
    private JPanel panel;
/**
 * The main function creates a new frame, sets the size of the frame, creates the GUI, and makes the
 * frame visible.
 * 
 * @param args The command line arguments
 */

    public static void main(String[]args) {
        
        Exercise3_1_b frame = new Exercise3_1_b();
        frame.setSize(400, 300);
        frame.createGUI();
        frame.setVisible(true);
    }
   /**
    * The function creates a new JPanel, sets its size and background color, and adds it to the window.
    */
    private void createGUI() {
    
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout() );
        
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(300, 200));
        panel.setBackground(Color.white);
        window.add(panel);
       
        boton1= new JButton("Press me");
        window.add(boton1);
        boton1.addActionListener(this);
    }

   /**
    * The function draws a square on the panel
    * 
    * @param event The event that triggered the action.
    */
    public void actionPerformed(ActionEvent event) {
        Graphics paper = panel.getGraphics();
        paper.drawLine(10, 10, 110, 10);
        paper.drawLine(10,10,10,110);
        paper.drawLine(10,110,110,110);
        paper.drawLine(110,10,110,110);
        }
}