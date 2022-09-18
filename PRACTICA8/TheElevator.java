import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

public class TheElevator extends JFrame implements ActionListener {

    private JPanel panel;
    private JLabel flatLabel;
    private JTextField flatField;
    private JButton upButton, downButton;
/*Varaibles para ir aumentando o disminuyendo la posicion del piso */
    private int counter=1;
    private int yFlat = 60;
    private int xFlat = 110;
    private int yRect = 0;
    private int yInicio = 520;
    private int xInicio = 110;
    private int subir = 0;


    public static void main(String[] args) {
        TheElevator frame = new TheElevator();
        frame.setSize(350, 700);
        frame.createGUI();
        frame.setVisible(true);

    }

    private void createGUI() {

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        panel = new JPanel();

        panel.setPreferredSize(new Dimension(300, 600) );
        panel.setBackground(Color.white);
        window.add(panel);

        this.flatLabel = new JLabel("Flat: ");
        window.add(this.flatLabel);
        this.flatField = new JTextField(7);
        window.add(this.flatField);
        
        this.upButton = new JButton("Up");
        window.add(this.upButton);
        this.upButton.addActionListener(this);

        this.downButton = new JButton("Down");
        window.add(this.downButton);
        this.downButton.addActionListener(this);
        
    }

    public void actionPerformed(ActionEvent event) {

        Graphics paper = panel.getGraphics();
    	Object source = event.getSource();
        

        if(source == upButton){

    	    for(int i = 0; i < 24; i++){

                paper.setColor(Color.black);
                paper.drawRect(100, 50, 100, 500);

                paper.setColor(Color.black);
                paper.drawRect(xFlat, yFlat + yRect  , 80, 10);
                yRect += 20;
            }
        /*Si esta en una determinada posicion, cumple la conidic */
            if((counter >= 1 && counter<=24) || (yInicio<=520 && yInicio>=110)){
                subir-=20;
                paper.setColor(Color.black);
                paper.fillRect(xInicio, yInicio + subir, 80, 10);
                counter++;
            }
            
            flatField.setText(Integer.toString(counter));

        }else if(source == downButton){

            
    	    for(int i = 0; i < 24; i++){

                paper.setColor(Color.black);
                paper.drawRect(100, 50, 100, 500);

                paper.setColor(Color.black);
                paper.drawRect(xFlat, yFlat + yRect  , 80, 10);
                yRect += 20;
            }

            if((counter>=1 && counter<=24) &&  (yInicio<=520 && yInicio>=110)){
                subir+=20;
                paper.setColor(Color.gray);
                paper.fillRect(xInicio, yInicio + subir, 80, 10);
                counter--;
            }
            
            flatField.setText(Integer.toString(counter));
        }

        
    }

}
