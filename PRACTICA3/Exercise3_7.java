import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exercise3_7 extends JFrame implements ActionListener {
   
    private JButton boton1;
    private JPanel panel;

    public static void main(String[]args) {
        
        Exercise3_7 frame = new Exercise3_7();
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
        panel.setBackground(Color.black);
        window.add(panel);
       
        boton1= new JButton("Press me");
        window.add(boton1);
        boton1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent event) {
        Graphics paper = panel.getGraphics();


        /*Circulo 60 */
        paper.setColor(Color.red);
        paper.fillOval(120,70,150,150);
        paper.setColor(Color.black);
        paper.drawString("60",190,85 );

        /*Circulo 70 */
        paper.setColor(Color.orange);
        paper.fillOval(135,85,120,120);
        paper.setColor(Color.black);
        paper.drawString("70",190,100 );

        /*Circulo 80 */
        paper.setColor(Color.yellow);
        paper.fillOval(150,100,90,90);
        paper.setColor(Color.black);
        paper.drawString("80",190,115 );

         /*Circulo 90 */
         paper.setColor(Color.gray);
         paper.fillOval(165,115,60,60);
         paper.setColor(Color.black);
        paper.drawString("90",190,130 );

        /*Circulo 100*/
        paper.setColor(Color.white);
        paper.fillOval(180,130,30,30);
        paper.setColor(Color.black);
        paper.drawString("100",185,150 );

      
        }
}