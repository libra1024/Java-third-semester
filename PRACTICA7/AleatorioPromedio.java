import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class AleatorioPromedio extends JFrame implements ActionListener {

   private JLabel numero1Label, promedio1Label, sumaLabel, contadorLabel;
   private JTextField  numero1Field, promedioField, sumaField, contadorField;
   private JButton boton;
   private Random numeroRandom = new Random();
   private int contador = 0, suma = 0;
   private double promedio;


    public static void main(String[] args) {
        AleatorioPromedio frame = new AleatorioPromedio();
        frame.setSize(800, 150);
        frame.createGUI();
        frame.setVisible(true);
    }
    private void createGUI() {

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        
        numero1Label = new  JLabel ("Numero 1: ");
        window.add(numero1Label);
        numero1Field = new JTextField(7);
        window.add(numero1Field);


        boton = new JButton("Genera numeros random");
        window.add( boton);
        boton.addActionListener(this);

        sumaLabel = new  JLabel ("Suma: ");
        window.add(sumaLabel);
        sumaField = new JTextField(7);
        window.add(sumaField);

        promedio1Label = new  JLabel ("Promedio: ");
        window.add(promedio1Label);
        promedioField = new JTextField(10);
        window.add(promedioField);

        contadorLabel = new  JLabel ("Contador: ");
        window.add(contadorLabel);
        contadorField = new JTextField(10);
        window.add(contadorField);


    }

    public void actionPerformed(ActionEvent event) {
        
    contador++;

    int receptor = numeroRandom.nextInt(200) + 200;

    suma = suma + receptor;

    promedio = (double)suma / (double)contador;

    numero1Field.setText(Integer.toString(receptor));
    sumaField.setText(Integer.toString(suma));
    promedioField.setText(Double.toString(promedio));
    contadorField.setText(Integer.toString(contador));



    }
}