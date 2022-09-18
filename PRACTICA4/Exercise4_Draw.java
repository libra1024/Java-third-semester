
/* 
    Nombre: Hernandez Escobedo Roberto
    Titulo: Practica 4
    Fecha: 2021/09/12
    Version: 0.6
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exercise4_Draw extends JFrame implements ActionListener {
   
    private JButton boton1;
    private JPanel panel;

    public static void main(String[]args) {
        
        Exercise4_Draw frame = new Exercise4_Draw();
        frame.setSize(600, 500);
        frame.createGUI();
        frame.setVisible(true);
    }
    private void createGUI() {
    
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout() );
        
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(500, 400));
        panel.setBackground(new Color(249, 231, 159));
        window.add(panel);
       
        boton1= new JButton("Press me");
        window.add(boton1);
        boton1.addActionListener(this);
    }

   /**
    * The function draws a picture of a character from a Japanese anime called "Jujutsu Kaisen"
    * 
    * @param event The event that triggered this method.
    */
    public void actionPerformed(ActionEvent event) {
        Graphics paper = panel.getGraphics();


        /*Banda de Goujou Satoru */
        /*Black band */
        int[] xBanda={130,180,218,240,262,300,350,350,260,230,175,130,130};
        int[] yBanda={180,177,174,172,174,177,180,230,240,230,240,230,180};
        paper.setColor(Color.black);
        paper.fillPolygon(xBanda, yBanda, 12);

        /*Cabello */
        /*Hair */
        int[] xCabello={130,100,132,106,148,126,186,168,222,232,250,300,342,320,372,320,372,360,400,350,300,262,240,218,180,130};
        int[] yCabello={180,150,158,94,132,50,102,20,80,22,100,16,100,36,140,84,150,150,180,177,174,172,174,177,180};
        paper.setColor(new  Color(232, 218, 239));
        paper.fillPolygon(xCabello, yCabello, 24);

        /*Cara */
        /*Face */
        int[] xCara={130,130,140,153,175,205,255,284,310,325,335,340,345,350,350,260,230,175,130};
        int[] yCara={230,290,320,343,367,385,385,380,370,355,340,320,300,285,230,240,230,240,230};
        paper.setColor(new  Color(255, 219, 172));
        paper.fillPolygon(xCara, yCara, 18);

        /*Sonrisa */
        /*Smile */
        int[] xSonrisa={200,200,230,260,260,256,256,230,204,204,200};
        int[] ySonrisa={308,320,328,320,308,308,316,322,316,308,308};
        paper.setColor(Color.black);
        paper.fillPolygon(xSonrisa,ySonrisa,10);

      // Drawing the text "弱い も" in the top left corner of the panel.
        paper.setFont(new Font("Yu Gothic UI Semibold",Font.BOLD,50));
        paper.setColor(Color.black);
        paper.drawString("弱い も", 50, 50);


    }
}