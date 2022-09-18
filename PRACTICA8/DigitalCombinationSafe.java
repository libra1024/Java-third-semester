import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

public class DigitalCombinationSafe extends JFrame implements ActionListener {

    private int counter = 0;
    private String codeString = "", myCode = "123321";
    private JButton number1Button, number2Button, number3Button, resetButton;
    private JTextField messageField, codeField;

    public static void main(String[] args) {
        DigitalCombinationSafe frame = new DigitalCombinationSafe();
        frame.setSize(200, 200);
        frame.createGUI();
        frame.setVisible(true);

    }

    private void createGUI() {

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        /* Show a message if you unlocked or not */
        this.messageField = new JTextField(10);
        window.add(this.messageField);

        /* Button number 1 */
        this.number1Button = new JButton(" 1 ");
        window.add(this.number1Button);
        this.number1Button.addActionListener(this);

        /* Button number 2 */
        this.number2Button = new JButton(" 2 ");
        window.add(this.number2Button);
        this.number2Button.addActionListener(this);

        /* Button number 3 */
        this.number3Button = new JButton(" 3 ");
        window.add(this.number3Button);
        this.number3Button.addActionListener(this);

        /* Reset button */
        this.resetButton = new JButton("reset");
        window.add(this.resetButton);
        this.resetButton.addActionListener(this);

        /* Show my code */
        this.codeField = new JTextField(6);
        window.add(this.codeField);

    }

    public void actionPerformed(ActionEvent event) {

        Object source = event.getSource();

        if ((counter >= 0) && (counter <= 5)) {

            if (source == number1Button) {

                codeString += "1";
                codeField.setText(codeString);
                counter++;

            } else if (source == number2Button) {

                codeString += "2";
                codeField.setText(codeString);
                counter++;

            } else if (source == number3Button) {

                codeString += "3";
                codeField.setText(codeString);
                counter++;
            }

        }

        if (codeString.equals(myCode)) {

            messageField.setText("Unlocked");

        } else if (counter == 6) {
            messageField.setText("Locked");
        }

        if (source == resetButton) {

            counter = 0;
            codeString = "";
            messageField.setText("");
            codeField.setText("");
        }

    }
}