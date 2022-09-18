import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

public class TheCalculator extends JFrame implements ActionListener {

    private JButton number0, number1, number2, number3, number4, number5;
    private JButton number6, number7, number8, number9, number10;
    private JButton operatorAddition, operatorSubtract, operatorMultiply;
    private JButton operatorDivide, operatorEquals, clearButton;
    private JTextField displayField;
    private double numberA = 0, numberB, numberC = 0;
    private String number_A = "", number_B = "", number_C = "";

    public static void main(String[] args) {
        TheCalculator frame = new TheCalculator();
        frame.setSize(200, 250);
        frame.createGUI();
        frame.setVisible(true);

    }

    private void createGUI() {

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        this.displayField = new JTextField(10);
        window.add(this.displayField);

        /** Number 1 button */
        this.number1 = new JButton("1");
        window.add(this.number1);
        this.number1.addActionListener(this);

        /** Number 2 button */
        this.number2 = new JButton("2");
        window.add(this.number2);
        this.number2.addActionListener(this);

        /** Number 3 button */
        this.number3 = new JButton("3");
        window.add(this.number3);
        this.number3.addActionListener(this);

        /** Number 4 button */
        this.number4 = new JButton("4");
        window.add(this.number4);
        this.number4.addActionListener(this);

        /** Number 5 button */
        this.number5 = new JButton("5");
        window.add(this.number5);
        this.number5.addActionListener(this);

        /** Number 6 button */
        this.number6 = new JButton("6");
        window.add(this.number6);
        this.number6.addActionListener(this);

        /** Number 7 button */
        this.number7 = new JButton("7");
        window.add(this.number7);
        this.number7.addActionListener(this);

        /** Number 8 button */
        this.number8 = new JButton("8");
        window.add(this.number8);
        this.number8.addActionListener(this);

        /** Number 9 button */
        this.number9 = new JButton("9");
        window.add(this.number9);
        this.number9.addActionListener(this);

        /** Number 0 button */
        this.number0 = new JButton("0");
        window.add(this.number0);
        this.number0.addActionListener(this);

        /** Addition button */
        this.operatorAddition = new JButton("+");
        window.add(this.operatorAddition);
        this.operatorAddition.addActionListener(this);

        /** Subtraction button */
        this.operatorSubtract = new JButton("-");
        window.add(this.operatorSubtract);
        this.operatorSubtract.addActionListener(this);

        /** Equals button */
        this.operatorEquals = new JButton("=");
        window.add(this.operatorEquals);
        this.operatorEquals.addActionListener(this);

        /** Clear */
        this.clearButton = new JButton("CE");
        window.add(this.clearButton);
        this.clearButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent event) {

        Object source = event.getSource();

        if (isNumber(source)) {
            number_A = putNumber(source, number_A);
        }
        numberA = Double.parseDouble(number_A);
        displayField.setText(Double.toString(numberA));

        if (isNumber(source)) {
            number_B = putNumber(source, number_B);
        }
        numberB = Double.parseDouble(number_B);
        displayField.setText(Double.toString(numberB));

        numberC = operate(source, numberA, numberB);

        displayField.setText(Double.toString(numberC));

    }

    public boolean isNumber(Object s) {

        if (s == number0) {
            return true;
        } else if (s == number1) {
            return true;
        } else if (s == number2) {
            return true;
        } else if (s == number3) {
            return true;
        } else if (s == number4) {
            return true;
        } else if (s == number5) {
            return true;
        } else if (s == number6) {
            return true;
        } else if (s == number7) {
            return true;
        } else if (s == number8) {
            return true;
        } else if (s == number9) {
            return true;
        } else {
            return false;
        }

    }

    public boolean isOperator(Object s) {

        if (s == operatorAddition) {
            return true;
        } else if (s == operatorSubtract) {
            return true;
        } else if (s == operatorMultiply) {
            return true;
        } else if (s == operatorDivide) {
            return true;
        } else {
            return false;
        }
    }

    public String putNumber(Object s, String number) {

        if (isNumber(s)) {

            if (s == number0) {
                number += "0";
            } else if (s == number1) {
                number += "1";
            } else if (s == number2) {
                number += "2";
            } else if (s == number3) {
                number += "3";
            } else if (s == number4) {
                number += "4";
            } else if (s == number5) {
                number += "5";
            } else if (s == number6) {
                number += "6";
            } else if (s == number7) {
                number += "7";
            } else if (s == number8) {
                number += "8";
            } else if (s == number9) {
                number += "9";
            }
        }

        return number;
    }

    public Double operate(Object source, Double number1, Double number2) {

        double number3 = 0;

        if (isOperator(source))

            if (source == operatorAddition) {
                number3 = number1 + number2;

            } else if (source == operatorSubtract) {

                number3 = number1 - number2;

            } else if (source == operatorMultiply) {

                number3 = number1 * number2;

            } else if (source == operatorDivide) {

                number3 = number1 / number2;
            }

        return number3;
    }

}