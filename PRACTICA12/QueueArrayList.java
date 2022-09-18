import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class QueueArrayList extends JFrame implements ActionListener {
    private JTextField textField;
    private JButton addButton, removeButton;
    private JTextArea textArea;
    private ArrayList<String> list = new ArrayList<String>();

    public static void main(String[] args) {
        QueueArrayList frame = new QueueArrayList();
        frame.setSize(300, 300);
        frame.createGUI();
        frame.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        this.textField = new JTextField(6);
        window.add(this.textField);

        this.addButton = new JButton("Add");
        window.add(this.addButton);
        this.addButton.addActionListener(this);

        this.removeButton = new JButton("Remove");
        window.add(this.removeButton);
        this.removeButton.addActionListener(this);

        this.textArea = new JTextArea(10, 10);
        JScrollPane scrollPane = new JScrollPane(this.textArea);
        window.add(scrollPane);

    }

    public void actionPerformed(ActionEvent event) {

        if (event.getSource() == addButton) {
            addItem(list);
        } else if (event.getSource() == this.removeButton) {
            removeItem(list);
        }
        show(list);

    }

    private void show(ArrayList<String> list) {

        final String newLine = "\n";

        int numberOfItems = list.size();
        this.textArea.setText("Item numbers: " + numberOfItems + newLine);

        for (String elementList : list) {

            textArea.append(elementList + newLine);

        }
    }

    private void addItem(ArrayList<String> list) {
        list.add(textField.getText());
        this.textField.setText("");
    }

    private void removeItem(ArrayList<String> list) {
        list.remove(0);
        this.textField.setText("");
    }

}
