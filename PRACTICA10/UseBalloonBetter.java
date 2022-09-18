
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class UseBalloonBetter extends JFrame implements ActionListener {

    private JButton growButton, shrinkButton, moveRightButton, moveLeftButton, moveUpButton, moveDownButton;
    private JPanel panel;
    private BalloonBetter balloon;

    public static void main(String[] args) {
        UseBalloonBetter demo = new UseBalloonBetter();
        demo.setSize(500, 500);
        demo.createGUI();
        demo.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(450, 400));
        panel.setBackground(Color.white);
        window.add(panel);

        this.moveRightButton = new JButton("Right");
        window.add(this.moveRightButton);
        this.moveRightButton.addActionListener(this);

        this.moveLeftButton = new JButton("Left");
        window.add(this.moveLeftButton);
        this.moveLeftButton.addActionListener(this);

        this.moveUpButton = new JButton("Up");
        window.add(this.moveUpButton);
        this.moveUpButton.addActionListener(this);

        this.moveDownButton = new JButton("Down");
        window.add(this.moveDownButton);
        this.moveDownButton.addActionListener(this);

        this.growButton = new JButton("Grow");
        window.add(this.growButton);
        this.growButton.addActionListener(this);

        this.shrinkButton = new JButton("Shrink");
        window.add(this.shrinkButton);
        this.shrinkButton.addActionListener(this);

        balloon = new BalloonBetter();
    }

    public void actionPerformed(ActionEvent event) {
        Graphics paper = panel.getGraphics();

        if (event.getSource() == growButton) {
            balloon.changeSize(10);
        } else if (event.getSource() == shrinkButton) {
            balloon.changeSize(-10);
        } else if (event.getSource() == moveUpButton) {
            balloon.moveUp(10);
        } else if (event.getSource() == moveDownButton) {
            balloon.moveDown(10);
        } else if (event.getSource() == moveRightButton) {
            balloon.moveRight(10);
        } else if (event.getSource() == moveLeftButton) {
            balloon.moveLeft(10);
        }

        paper.setColor(Color.white);
        paper.fillRect(0, 0, 450, 400);
        balloon.display(paper);

    }
}