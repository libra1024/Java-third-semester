
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class UseCircle extends JFrame implements ActionListener {

    private JPanel panel;
    private JButton button;
    private Circle circle;

    public static void main(String[] args) {
        UseCircle frame = new UseCircle();
        frame.setSize(300, 300);
        frame.createGUI();
        frame.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(250, 200));
        panel.setBackground(Color.white);
        window.add(panel);

        this.button = new JButton("Press me");
        window.add(this.button);
        this.button.addActionListener(this);

        this.circle = new Circle();

    }

    public void actionPerformed(ActionEvent event) {
        Graphics paper = panel.getGraphics();

        this.circle.setX(100);
        this.circle.setY(100);
        this.circle.setWidth(50);
        this.circle.setHeight(50);
        this.circle.display(paper);

        int areaCirc = this.circle.getArea();

        paper.drawString(Integer.toString(areaCirc), 20, 20);

    }
}