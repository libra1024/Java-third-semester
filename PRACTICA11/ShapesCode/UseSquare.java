
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class UseSquare extends JFrame implements ActionListener {

    private JPanel panel;
    private JButton button;
    private Square square;

    public static void main(String[] args) {
        UseSquare frame = new UseSquare();
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

        this.square = new Square();

    }

    public void actionPerformed(ActionEvent event) {
        Graphics paper = panel.getGraphics();

        this.square.setX(100);
        this.square.setY(100);
        this.square.setWidth(50);
        this.square.setHeight(50);
        this.square.display(paper);

        int areaRect = this.square.getArea();

        paper.drawString(Integer.toString(areaRect), 20, 20);

        System.out.println(this.square.getArea());

    }
}