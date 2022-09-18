
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.event.*;
import java.util.*;

public class Bank extends JFrame implements ActionListener {

    private JButton depositButton, withdrawButton;
    private JTextField balanceField, billingAccountField, amountField;
    private JLabel label;
    private Account account = new Account();

    public static void main(String[] args) {
        Bank frame = new Bank();
        frame.setSize(150, 300);
        frame.createGUI();
        frame.setVisible(true);

    }

    private void createGUI() {

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        this.label = new JLabel("Balance:");
        window.add(this.label);

        this.balanceField = new JTextField(5);
        window.add(this.balanceField);

        this.billingAccountField = new JTextField(10);
        window.add(this.billingAccountField);

        this.depositButton = new JButton("Deposit");
        window.add(this.depositButton);
        this.depositButton.addActionListener(this);

        this.withdrawButton = new JButton("Withdraw");
        window.add(this.withdrawButton);
        this.withdrawButton.addActionListener(this);

        this.amountField = new JTextField(5);
        window.add(this.amountField);

    }

    public void actionPerformed(ActionEvent event) {

        int amount = Integer.parseInt(amountField.getText());

        if (event.getSource() == depositButton) {
            account.deposit(amount);
        } else if (event.getSource() == withdrawButton) {
            account.withdraw(amount);
        }

        int currentValue = account.getCurrentBalance();
        account.setCurrentBalance(currentValue);
        this.balanceField.setText(Integer.toString(currentValue));

        if (currentValue < 0) {
            this.billingAccountField.setText("Overdraw");
        } else if (currentValue > 0) {
            this.billingAccountField.setText("Ok");
        }
    }
}
