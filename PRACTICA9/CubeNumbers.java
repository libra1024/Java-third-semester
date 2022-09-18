
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.event.*;
import java.util.*;

public class CubeNumbers extends JFrame implements ActionListener {

    private JButton button;
    private JPanel panel;

    public static void main(String[] args) {

        CubeNumbers frame = new CubeNumbers();
        frame.setSize(300, 300);
        frame.createGUI();
        frame.setVisible(true);

    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        this.panel = new JPanel();
        this.panel.setPreferredSize(new Dimension(200, 200));
        this.panel.setBackground(Color.white);
        window.add(this.panel);

        this.button = new JButton("Press me");
        window.add(this.button);
        this.button.addActionListener(this);

    }

    public void actionPerformed(ActionEvent event) {

        Graphics paper = panel.getGraphics();

        String cube = "";
        int i, j;
        int x = 20, y = 20;
        int space = 0;

        for (i = 1; i <= 10; i++) {

            cube = i + "    " + (i * i * i);
            paper.drawString(cube, x, y + space);
            space += 20;
        }

    }

}