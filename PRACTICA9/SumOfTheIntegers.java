import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

public class SumOfTheIntegers extends JFrame implements ActionListener {

    private JTextField field1, field2;
    private JButton button;

    public static void main(String[] args) {

        SumOfTheIntegers frame = new SumOfTheIntegers();
        frame.setSize(400, 120);
        frame.createGUI();
        frame.setVisible(true);

    }

    private void createGUI() {

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        this.button = new JButton("Press me");
        window.add(this.button);
        this.button.addActionListener(this);

        this.field1 = new JTextField(10);
        window.add(this.field1);

        this.field2 = new JTextField(10);
        window.add(this.field2);

    }

    public void actionPerformed(ActionEvent event) {

        int n = 39;
        int sum = (n * (n + 1) / 2);
        int sum2 = 0;

        for (int i = 0; i <= n; i++) {
            sum2 += i;
        }

        this.field1.setText("answer is: " + Integer.toString(sum));
        this.field2.setText("answer is: " + Integer.toString(sum2));

    }

}