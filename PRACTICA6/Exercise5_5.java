/*
Titulo: Dibujar Calle
Nombre: Roberto Hernandez Escobedo
Fecha: 2021/09/26

*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Exercise5_5 extends JFrame implements ActionListener {
    private JButton button;
    private JPanel panel;
    public static void main(String[] args) {
        Exercise5_5 frame = new Exercise5_5();
        frame.setSize(600, 550);
        frame.createGUI();
        frame.setVisible(true);
    }
    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout() );
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(500, 400));
        panel.setBackground(Color.white);
        window.add(panel);
        button = new JButton("Press me");
        window.add(button);
        button.addActionListener(this);
     }
    public void actionPerformed(ActionEvent event) {
        
        Graphics paper = panel.getGraphics();
        int n = 0;

        for(int i=0; i<4; i++) {

            drawHouse(paper, 10 + n, 20, 70, 20);
            n = n + 90;
        }
        
    }

    private void drawHouse(Graphics drawingArea,
        int topRoofX,
        int topRoofY,
        int width,
        int height) {
        drawTriangle(drawingArea, topRoofX, topRoofY, width, height);
        drawingArea.drawRect(topRoofX,
        topRoofY + height, width, height);
    }

    private void drawTriangle(Graphics drawingArea,
        int xPlace,
        int yPlace,
        int width,
        int height) {
        drawingArea.drawLine(xPlace, yPlace,
        xPlace, yPlace + height);
        drawingArea.drawLine(xPlace, yPlace + height,
        xPlace + width, yPlace + height);
        drawingArea.drawLine(xPlace, yPlace,xPlace + width,
        yPlace + height);
        }
}
