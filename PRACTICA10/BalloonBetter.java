
import java.awt.*;

public class BalloonBetter {

    private int x = 50;
    private int y = 50;
    private int diameter = 20;
    private String name = "I'm ballon guy";

    public void moveRight(int xStep) {

        x = x + xStep;

    }

    public void moveLeft(int xStep) {

        x = x - xStep;

    }

    public void moveUp(int yStep) {

        y = y - yStep;

    }

    public void moveDown(int yStep) {

        y = y + yStep;

    }

    public void changeSize(int change) {

        diameter = diameter + change;
    }

    public void display(Graphics paper) {

        paper.setColor(Color.blue);
        paper.drawOval(x, y, diameter, diameter);
        paper.setColor(Color.blue);
        paper.setFont(new Font("Ink Font", Font.BOLD, 20));
        paper.drawString(name, x + 20, y - 20);
    }

}
