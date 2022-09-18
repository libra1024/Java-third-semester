import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exercise3_6_a extends JFrame implements ActionListener {
   
    private JButton boton1;
    private JPanel panel;

    public static void main(String[]args) {
        
        Exercise3_6_a frame = new Exercise3_6_a();
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

    public void actionPerformed(ActionEvent event) {
        Graphics paper = panel.getGraphics();

        /*Plano */
        paper.drawLine(30,10,30,210);
        paper.drawLine(20,200,120,200);
         
        /*Barras de Xanadu */

        /*2005 */
        paper.setColor(Color.yellow);
        paper.fillRect(40, 25, 20, 175);

        /*2004 */
        paper.setColor(Color.green);
        paper.fillRect(60, 50, 20, 150);

        /*2006 */
        paper.setColor(Color.blue);
        paper.fillRect(80, 75, 20, 125);

        /*Titulo */
       /* paper.setFont(new Font("Comic Sans", Font.ITALIC,20));
        paper.setColor(Color.BLACK);
        pape.drawString("Rainfalls in Xanabu",100,100);*/

        }
}