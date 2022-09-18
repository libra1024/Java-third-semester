
import java.awt.*;

abstract class Triangule extends Shapes {

    public int getArea() {

        int area = (width * height) / 2;

        return area;
    }

    public void display(Graphics paper) {

        int point1X = x;
        int point1Y = y;

        int point2X = point1X + width;
        int point2Y = point1Y + width;

        int point3X = point2X - height;
        int point3Y = point2Y - height;

        paper.drawLine(point1X, point1Y, point2X, point2Y);
        paper.drawLine(point2X, point2Y, point3X, point3Y);
        paper.drawLine(point3X, point3Y, point1X, point1Y);

    }

}
