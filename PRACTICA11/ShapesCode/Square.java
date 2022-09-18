import java.awt.*;

class Square extends Shapes {

    public int getArea() {

        return width * height;
    }

    public void display(Graphics paper) {

        paper.setColor(Color.black);
        paper.fillRect(x, y, width, height);
    }
}