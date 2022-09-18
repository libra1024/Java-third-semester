import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

public class RockScissorsPaperGame extends JFrame implements ActionListener {

    private Random random = new Random();
    private JButton rockButton, scissorsButton, paperButton;
    private JLabel playerLabel, pcLabel;
    private JTextField playerField, pcField, decisionField;
    private String rockString = "ROCK", scissorsString = "SCISSORS", paperString = "PAPER";

    public static void main(String[] args) {
        RockScissorsPaperGame frame = new RockScissorsPaperGame();
        frame.setSize(200, 250);
        frame.createGUI();
        frame.setVisible(true);

    }

    private void createGUI() {

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        /** Player */
        this.playerLabel = new JLabel("Player: ");
        window.add(this.playerLabel);

        this.playerField = new JTextField(10);
        window.add(this.playerField);

        /** PC */
        this.pcLabel = new JLabel("PC: ");
        window.add(this.pcLabel);

        this.pcField = new JTextField(10);
        window.add(this.pcField);

        /** Decision */
        this.decisionField = new JTextField(10);
        window.add(this.decisionField);

        /** Rock button */
        this.rockButton = new JButton("Rock");
        window.add(this.rockButton);
        this.rockButton.addActionListener(this);

        /** Sccisors button */
        this.scissorsButton = new JButton("Sccisors");
        window.add(this.scissorsButton);
        this.scissorsButton.addActionListener(this);

        /** Paper button */
        this.paperButton = new JButton("Paper");
        window.add(this.paperButton);
        this.paperButton.addActionListener(this);

    }

    public void actionPerformed(ActionEvent event) {

        /**
         * Buttons values Rock = 1 Sccisors = 2 Paper = 3
         */
        Object source = event.getSource();
        int pcNumber = random.nextInt(3) + 1;
        int playerNumber = 0;

        if (source == rockButton) {

            playerNumber = 1;
            playerField.setText(rockString);

        } else if (source == scissorsButton) {

            playerNumber = 2;
            playerField.setText(scissorsString);

        } else if (source == paperButton) {

            playerNumber = 3;
            playerField.setText(paperString);
        }

        if (pcNumber == 1) {
            pcField.setText(rockString);
        } else if (pcNumber == 2) {
            pcField.setText(scissorsString);
        } else if (pcNumber == 3) {
            pcField.setText(paperString);
        }

        /**
         * ROCK = 1 SCISSORS = 2 PAPER = 3
         */

        if (pcNumber == playerNumber) {

            decisionField.setText("No one win");

        } else if (pcNumber == 1 && pcNumber == 2) {

            decisionField.setText("You lose");

        } else if (pcNumber == 3 && playerNumber == 1) {

            decisionField.setText("You lose");

        } else if (pcNumber == 2 && playerNumber == 3) {

            decisionField.setText("You lose");

        } else {

            decisionField.setText("You win");
        }
    }

}