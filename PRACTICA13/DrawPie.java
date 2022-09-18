import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class DrawPie extends JFrame implements ActionListener {

    private JPanel panel;
    private JButton button;
    private Color[] colors = { Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW, Color.PINK };
    private int[] angles = { 50, 60, 90, 40, 120 };

    public static void main(String[] args) {

        DrawPie frame = new DrawPie();

        frame.setSize(450, 480);
        frame.createGUI();
        frame.setVisible(true);

    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        this.panel = new JPanel();
        this.panel.setPreferredSize(new Dimension(400, 400));
        this.panel.setBackground(Color.white);
        window.add(this.panel);

        this.button = new JButton("Draw");
        window.add(this.button);
        this.button.addActionListener(this);
    }

    public void actionPerformed(ActionEvent event) {
    	Graphics paper = panel.getGraphics();
  

        drawPie(paper);

    }

    private void drawPie(Graphics paper) {
    	  
        int x = 150;
        int y = 150;
        int width = 150;
        int height = 150;
        int startAngle = 0;
        int aux = 0;

        for (int i = 0; i < this.colors.length; i++) {

            paper.setColor(colors[i]);
            paper.fillArc(x, y, width, height, startAngle + aux, angles[i]);
            aux += angles[i];
        }

    }

}
/* graphics.fillArc(x, y, width, height, startAngle, arcAngle); */