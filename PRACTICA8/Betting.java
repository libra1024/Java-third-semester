import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

public class Betting extends JFrame implements ActionListener {

    private Random random =  new Random();
    private JLabel numbersLabel, decisionLabel;
    private JTextField numbersField, decisionField;
    private JButton button;
    

    public static void main(String[] args) {
        Betting frame = new Betting();
        frame.setSize(200, 200);
        frame.createGUI();
        frame.setVisible(true);

    }

    private void createGUI() {

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        /*Show numbers */
        this.numbersLabel = new JLabel("Numbers: ");
        window.add(this.numbersLabel);

        this.numbersField = new JTextField(7);
        window.add(this.numbersField);

    	/*Show the prize if win a condition */
        this.decisionLabel = new JLabel("Prize: ");
        window.add(this.decisionLabel);

        this.decisionField = new JTextField(7);
        window.add(this.decisionField);

        this.button = new JButton("Press me");
        window.add(this.button);
        this.button.addActionListener(this);

    }

    public void actionPerformed(ActionEvent event){

        int number1 = random.nextInt(6) + 1;
        int number2 = random.nextInt(6) + 1;
        int number3 = random.nextInt(6) + 1;

        if((number1%6==0) && (number2%6==0) && (number3%6==0) ){
            numbersField.setText(number1+" "+number2+" "+number3);
            decisionField.setText("You win $20");
        }else if(number1==number2 && number1==number3 && number2==number3){

            numbersField.setText(number1+" "+number2+" "+number3);
            decisionField.setText("You win $10");

        }else if( (number1==number2 || number1==number3 || number2==number3) ){
            numbersField.setText(number1+" "+number2+" "+number3);
            decisionField.setText("You win $5");
        }else{
            numbersField.setText(number1+" "+number2+" "+number3);
            decisionField.setText("You lose");
        }

    }
}