/*
Titulo: Resta de tiempo en segundos
Nombre: Roberto Hernandez Escobedo
Fecha: 2021/09/26

*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Exercise5_14 extends JFrame implements ActionListener {
    private JButton button;
    private JPanel panel;
    public static void main(String[] args) {
        Exercise5_14 frame = new Exercise5_14();
        frame.setSize(350, 300);
        frame.createGUI();
        frame.setVisible(true);
    }
    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout() );
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(300, 200));
        panel.setBackground(Color.white);
        window.add(panel);
        button = new JButton("Press me");
        window.add(button);
        button.addActionListener(this);
    }
     public void actionPerformed(ActionEvent event) {
        Graphics paper = panel.getGraphics();
            
        int horas1, minutos1, segundos1;
        String horasString1, minutosString1, segundosString1;

       int horas2, minutos2, segundos2;
       String horasString2, minutosString2, segundosString2;


        horasString1 = JOptionPane.showInputDialog("Ingresa las horas [1]: ");
        horas1 = Integer.parseInt(horasString1);

        minutosString1 = JOptionPane.showInputDialog("Ingrese los minutos [1]: ");
        minutos1 = Integer.parseInt(minutosString1);

        segundosString1 = JOptionPane.showInputDialog("Ingrese los segundos [1]: ");
        segundos1 = Integer.parseInt(segundosString1);

        horasString2 = JOptionPane.showInputDialog("Ingresa las horas [2]: ");
        horas2 = Integer.parseInt(horasString2);

        minutosString2 = JOptionPane.showInputDialog("Ingresa los minutos [2]: ");
        minutos2 = Integer.parseInt(minutosString2);

        segundosString2 = JOptionPane.showInputDialog("Ingrese los segundos [2]: ");
        segundos2 = Integer.parseInt(segundosString2);

        int respuestaFinal;

        respuestaFinal = diferenciaDeTiempoEnSegundos(horas2, minutos2, segundos2,
                                                    horas1, minutos1, segundos1);
        if(respuestaFinal < 0){
            JOptionPane.showMessageDialog(null,"Error tiempo negativo: " + respuestaFinal);
        }else{
            JOptionPane.showMessageDialog(null, "La diferencia es: " + respuestaFinal);
        }
    }

    private int segsEn(int horas, int  minutos, int segundos) {

        int sumaTotal = 0;

        sumaTotal = (horas*3600) + (minutos*60) + segundos;

        return sumaTotal;

    }

    private int diferenciaDeTiempoEnSegundos(int horasFinales, int minutosFinales, int segundosFinales,
                                              int horasIniciales, int minutosIniciales, int segundosIniciales){

        int resultado1 = segsEn(horasIniciales, minutosIniciales, segundosIniciales);
        int resultado2 = segsEn(horasFinales, minutosFinales, segundosFinales);
        int diferencia = resultado2 - resultado1;

        
        return diferencia;
    }
        
}