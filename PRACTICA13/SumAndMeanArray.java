import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.text.*;

public class SumAndMeanArray extends JFrame implements ActionListener {

    private JButton button;
    private JLabel meanLabel, sumLabel, highestNumberLabel, lowestNumberLabel;
    private JTextField meanField, sumField, highestNumberField, lowestNumberField;
    private static final int MAX = 101;
    private double[] array = new double[MAX];
    private Random random = new Random();

    public static void main(String[] args) {

        SumAndMeanArray frame = new SumAndMeanArray();
        frame.setSize(250, 300);
        frame.createGUI();
        frame.setVisible(true);

    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        this.meanLabel = new JLabel("Mean: ");
        window.add(this.meanLabel);

        this.meanField = new JTextField(5);
        window.add(this.meanField);

        this.sumLabel = new JLabel("Sum: ");
        window.add(this.sumLabel);

        this.sumField = new JTextField(5);
        window.add(this.sumField);

        this.lowestNumberLabel = new JLabel("Lowest number: ");
        window.add(this.lowestNumberLabel);

        this.lowestNumberField = new JTextField(5);
        window.add(this.lowestNumberField);

        this.highestNumberLabel = new JLabel("Highest number: ");
        window.add(this.highestNumberLabel);

        this.highestNumberField = new JTextField(5);
        window.add(this.highestNumberField);

        this.button = new JButton("Press me");
        window.add(this.button);
        this.button.addActionListener(this);

    }

    public void actionPerformed(ActionEvent event) {

        fillArray(this.array);

        int sum = getSum(this.array);
        double mean = getMean(this.array);
        DecimalFormat df = new DecimalFormat("##.####");
        String meanString = df.format(mean);
        double highest = getHighestValue(this.array);
        double lowest = getLowestValue(this.array);

        this.sumField.setText(Integer.toString(sum));
        this.meanField.setText(meanString);
        this.highestNumberField.setText(Double.toString(highest));
        this.lowestNumberField.setText(Double.toString(lowest));
    }

    private void fillArray(double[] array) {

        int index;

        for (index = 0; index < array.length; index++) {
            int aux = random.nextInt(101);
            array[index] = aux;
        }

    }

    private String printArray(double[] array) {
        int i;
        String str = "";

        for (i = 0; i < array.length; i++) {
            str = str + array[i] + " ";
        }

        return str;
    }

    private int getSum(double[] array) {

        int sum = 0;
        int index;

        for (index = 0; index < array.length; index++) {
            sum += array[index];
        }

        return sum;
    }

    private double getMean(double[] array) {
        int index;
        int sum = 0;
        double mean = 0;

        for (index = 0; index < array.length; index++) {
            sum += array[index];
        }

        mean = (double) sum / (double) array.length;

        return mean;

    }

    private double getHighestValue(double[] array) {
        double number = array[0];

        for (int index = 0; index < array.length; index++) {

            if (number < array[index]) {
                number = array[index];

            }
        }

        return number;

    }

    private double getLowestValue(double[] array) {
        double number = array[0];

        for (int index = 0; index > array.length; index++) {

            if (number > array[index]) {
                number = array[index];

            }
        }

        return number;
    }

}
