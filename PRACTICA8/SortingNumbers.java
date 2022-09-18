import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

public class SortingNumbers extends JFrame implements ChangeListener {

    private JSlider Number1Slider, Number2Slider, Number3Slider ;
    private JTextField field,  Number1Field,  Number2Field, Number3Field ;
    private JLabel label, Number1Label,  Number2Label, Number3Label;
    public static void main(String[] args) {
        SortingNumbers frame = new SortingNumbers();
        frame.setSize(250, 300);
        frame.createGUI();
        frame.setVisible(true);
    }
    private void createGUI() {

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());
      
        /*Number 1 */
    
        this.Number1Label = new JLabel("Number 1: ");
        window.add(this.Number1Label);

        this.Number1Field = new JTextField(7);
        window.add(this.Number1Field);

        this.Number1Slider = new JSlider( SwingConstants.HORIZONTAL, 0, 100, 0);
        window.add( this.Number1Slider);
        this.Number1Slider.addChangeListener(this);

        /*Number 2 */

        this.Number2Label = new JLabel("Number 2: ");
        window.add(this.Number2Label);

        this.Number2Field = new JTextField(7);
        window.add(this.Number2Field);

        this.Number2Slider = new JSlider( SwingConstants.HORIZONTAL, 0, 100, 0);
        window.add( this.Number2Slider);
        this.Number2Slider.addChangeListener(this);

         /*Number 3 */

         this.Number3Label = new JLabel("Number 3: ");
         window.add(this.Number3Label);
 
         this.Number3Field = new JTextField(7);
         window.add(this.Number3Field);
 
         this.Number3Slider = new JSlider( SwingConstants.HORIZONTAL, 0, 100, 0);
         window.add( this.Number3Slider);
         this.Number3Slider.addChangeListener(this);

         /* Sorting number */
         this.label = new JLabel("Order: ");
         window.add(this.label);

         this.field = new JTextField(7);
         window.add(this.field);

    }

    public void stateChanged(ChangeEvent event) {

       int number1 = Number1Slider.getValue();
       int number2 = Number2Slider.getValue();
       int number3 = Number3Slider.getValue();

       int lowest;
       int middle;
       int highest;

       if (number1>number2) {

		    middle=number1;    
		    lowest=number2;   

	    } else {

		    middle=number2;  
		    lowest=number1; 

	    } if (middle>number3) { 

		        highest=middle;   

		        if(lowest>number3){ 

			        middle=lowest;                
			        lowest=number3;

		        }else {
                    
			        middle=number3;  
                    
		        }         
	        }else highest=number3; 
    
    Number1Field.setText(Integer.toString(number1));
    Number2Field.setText(Integer.toString(number2));
    Number3Field.setText(Integer.toString(number3));

    field.setText(lowest+" "+middle+" "+highest);

    }
}