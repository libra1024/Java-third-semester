import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

public class TheaterCinema  extends JFrame implements ChangeListener {

    private JTextField edadField, descuentoField;
    private JLabel edadLabel, descuentoLabel;
    private JSlider slider;
    private int edadValor;

    
    public static void main(String[] args) {
        TheaterCinema frame = new TheaterCinema();
        frame.setSize(400, 100);
        frame.createGUI();
        frame.setVisible(true);
    }
    private void createGUI() {

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        edadLabel = new JLabel("Edad: ");
        window.add(edadLabel);
        edadField = new JTextField(3);
        window.add(edadField);

        descuentoLabel = new JLabel("Precio: ");
        window.add(descuentoLabel);
        descuentoField = new JTextField(15);
        window.add(descuentoField);

        slider = new JSlider(SwingConstants.HORIZONTAL, 1, 124, 1);
        window.add(slider);
        slider.addChangeListener(this);
    }

    public void stateChanged(ChangeEvent event) {

        edadValor = slider.getValue();

        if(edadValor>= 1 && edadValor <= 4){
            edadField.setText(Integer.toString(edadValor));
            descuentoField.setText("No se cobra boleto");
        }

        if(edadValor>= 5 && edadValor <= 12){
            edadField.setText(Integer.toString(edadValor));
            descuentoField.setText("Medio boleto");
        }

        if(edadValor>= 13 && edadValor <= 55){
            edadField.setText(Integer.toString(edadValor));
            descuentoField.setText("Boleto completo");
        }

        if(edadValor>= 56 && edadValor <= 124){
            edadField.setText(Integer.toString(edadValor));
            descuentoField.setText("Descuento de la tercera edad");
        }



    }




}
