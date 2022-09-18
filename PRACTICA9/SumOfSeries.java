import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.event.*;
import java.util.*;

public class SumOfSeries extends JFrame implements ActionListener {

    private JTextField textField;
    private JButton button;

    public static void main(String[] args) {

        SumOfSeries frame = new SumOfSeries();
        frame.setSize(300, 150);
        frame.createGUI();
        frame.setVisible(true);

    }

    private void createGUI() {

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        this.textField = new JTextField(10);
        window.add(this.textField);

        this.button = new JButton("Calculate");
        window.add(this.button);
        this.button.addActionListener(this);

    }

    public void actionPerformed(ActionEvent event) {

        double sum = 0.0;
        int n = 1;

        while ((1.0 / n) >= 0.0001) {

            if (n % 2 == 0) {

                sum = sum - (1.0 / n);
            } else {

                sum = sum + (1.0 / n);
            }

            n = n + 1;
        }
        DecimalFormat format = new DecimalFormat("#.#######");
        String formatString = format.format(sum);

        textField.setText(formatString);

        System.out.println(formatString);

    }

}