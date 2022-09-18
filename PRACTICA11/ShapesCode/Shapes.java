import java.awt.*;

public abstract class Shapes {

    protected int x, y;
    protected int width, height;

    public void setX(int x) {

        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public abstract int getArea();

    public abstract void display(Graphics paper);

}
