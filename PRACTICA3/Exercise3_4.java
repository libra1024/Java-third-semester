import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exercise3_4 extends JFrame implements ActionListener {
   
    private JButton boton1;
    private JPanel panel;

    public static void main(String[]args) {
        
        Exercise3_4 frame = new Exercise3_4();
        frame.setSize(500, 400);
        frame.createGUI();
        frame.setVisible(true);
    }
    /**
     * This function creates a panel and a button and adds them to the window.
     */
    private void createGUI() {
    
   
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout() );
        
      // This is creating a panel and adding it to the window.
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(400, 300));
        panel.setBackground(Color.cyan);
        window.add(panel);
     // This is creating a button and adding it to the window.
       
        boton1= new JButton("Press me");
        window.add(boton1);
        boton1.addActionListener(this);
    }

   /**
    * The function actionPerformed() is called when the user clicks the button
    * 
    * @param event The event that triggered this method.
    */
    public void actionPerformed(ActionEvent event) {
       
        Graphics paper = panel.getGraphics();

       // Drawing the roof of the house.
        /*Techo */
        int[]  xTriangule={200,280,120};
        int[] yTriangule={20,60,60};
        paper.fillPolygon(xTriangule, yTriangule, 3);
       
       // Drawing the body of the house.
        /*Cuerpo inferior*/
        int[] xHouse={150,250,250,150,150};
        int[] yHouse={60,60,140,140,60};
        paper.fillPolygon(xHouse, yHouse, 4);

      // Drawing the door of the house.
        /*Puerta */
        int[] xDoor={180,210,210,180,180};
        int[] yDoor={100,100,140,140,100};
        paper.setColor(Color.white);
        paper.fillPolygon(xDoor,yDoor,4);

        /*Perilla */
    // Drawing a black circle with a radius of 15 pixels.
        paper.setColor(Color.black);
        paper.fillOval(195,122,15,15);

        /*Ventana */
       // Drawing a white circle with a radius of 20 pixels.
        paper.setColor(Color.white);
        paper.fillOval(190, 28, 20, 20);

        
    

    }
}