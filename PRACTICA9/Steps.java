import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

public class Steps extends JFrame implements ActionListener {

    private JPanel panel;
    private JButton button;

    public static void main(String[] args) {

        Steps frame = new Steps();
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
        int x = 10;
        int y = 10;
        int width = 10;
        int height = 10;
        int counter = 1;
        for (int i = 1; i <= 7; i++) {

            int xSpace = 0;

            for (int j = 1; j <= counter; j++) {

                paper.setColor(Color.black);
                paper.drawRect(x + xSpace, y, width, height);
                xSpace += 20;

            }
            counter++;
            y += 20;

        }
    }

}