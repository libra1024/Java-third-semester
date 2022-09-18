import java.awt.*;

class Circle extends Shapes {

    public int getArea() {

        double area = Math.PI * ((double) width / 2.0) * ((double) width / 2.0);
        int value = (int) area;

        return value;
    }

    public void display(Graphics paper) {

        paper.setColor(Color.black);
        paper.fillOval(x, y, width, height);
    }

}