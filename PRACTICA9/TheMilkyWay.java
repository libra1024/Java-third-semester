import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

public class TheMilkyWay extends JFrame implements ActionListener {

    private Random random1 = new Random();
    private Random random2 = new Random();
    private Random random3 = new Random();
    private JPanel panel;
    private JButton button;

    public static void main(String[] args) {

        TheMilkyWay frame = new TheMilkyWay();
        frame.setSize(400, 400);
        frame.createGUI();
        frame.setVisible(true);

    }

    private void createGUI() {

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        this.panel = new JPanel();
        this.panel.setPreferredSize(new Dimension(300, 300));
        this.panel.setBackground(Color.white);
        window.add(this.panel);

        this.button = new JButton("Press me");
        window.add(this.button);
        this.button.addActionListener(this);

    }

    public void actionPerformed(ActionEvent event) {

        Graphics paper = panel.getGraphics();

        for (int i = 0; i < 100; i++) {

            int xValue = random1.nextInt(300);
            int yValue = random2.nextInt(300);
            int radioValue = random3.nextInt(10) + 1;
            drawCircle(paper, xValue, yValue, radioValue);

        }
    }

    private void drawCircle(Graphics areaCircle, int xCentre, int yCentre, int radio) {

        int x = xCentre - radio;
        int y = yCentre - radio;
        areaCircle.setColor(Color.black);
        areaCircle.drawOval(x, y, radio * 2, radio * 2);
    }
}