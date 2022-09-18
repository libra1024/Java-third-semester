
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.event.*;
import java.util.*;

public class CubeNum extends JFrame implements ActionListener {

    private JButton button;
    private JPanel panel;
    private String tabString = "\t", newLineString = "\n", cubeNumbers = "";

    public static void main(String[] args) {

        CubeNum frame = new CubeNum();
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

        int i;

        for (i = 1; i <= 10; i++) {

            cubeNumbers = cubeNumbers + i + tabString + (i * i * i);
            cubeNumbers = cubeNumbers + newLineString;

        }

        paper.drawString(cubeNumbers, 10, 10);

    }

}