import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exercise3_1_a extends JFrame implements ActionListener {
   
   // Declaring the variables.
    private JButton boton1;
    private JPanel panel;

    /**
     * The main function creates a new frame, sets the size of the frame, creates the GUI, and makes
     * the frame visible.
     * 
     * @param args This is the parameter that is passed to the main method. It is an array of String
     * objects.
     */
    public static void main(String[]args) {
        
        Exercise3_1_a frame = new Exercise3_1_a();
        frame.setSize(400, 300);
        frame.createGUI();
        frame.setVisible(true);
    }
    /**
     * The function creates a new JPanel, sets its size and background color, and adds it to the
     * window.
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

// Drawing a rectangle on the panel.
    public void actionPerformed(ActionEvent event) {
        Graphics paper = panel.getGraphics();
        paper.drawRect(10,10,100,100);
        }
}