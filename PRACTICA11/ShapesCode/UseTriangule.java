
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class UseTriangule extends JFrame implements ActionListener {

    private JPanel panel;
    private JButton button;
    private Triangule triangule;

    public static void main(String[] args) {
        UseTriangule frame = new UseTriangule();
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

    }

    public void actionPerformed(ActionEvent event) {
        Graphics paper = panel.getGraphics();

        this.triangule.setX(100);
        this.triangule.setY(100);
        this.triangule.setWidth(50);
        this.triangule.setHeight(50);
        this.triangule.display(paper);

        int tri = this.triangule.getArea();

        paper.drawString(Integer.toString(tri), 20, 20);

        System.out.println(this.triangule.getArea());

    }

}