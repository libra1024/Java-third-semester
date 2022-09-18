import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class DictionaryEnglishToSpanish extends JFrame implements ActionListener {

    private JTextField spanishField, englishField;
    private JLabel spanishLabel, englishLabel;
    private JButton button;
    private String[] spanishWords = { "el, la, los, las", "ser o estar", "a, hacia, hasta, por, para", "de", "y",
            "un, una", "en, dentro de", "que, eso/e/a, aquello/a, cual", "tener, haber", "yo" };
    private String[] englishWords = { "the", "be", "to", "of", "and", "a", "in", "that", "have", "I" };

    public static void main(String[] args) {

        DictionaryEnglishToSpanish frame = new DictionaryEnglishToSpanish();
        frame.setSize(250, 300);
        frame.createGUI();
        frame.setVisible(true);

    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        this.englishLabel = new JLabel("English: ");
        window.add(this.englishLabel);
        this.englishField = new JTextField(20);
        window.add(this.englishField);

        this.spanishLabel = new JLabel("Spanish: ");
        window.add(this.spanishLabel);
        this.spanishField = new JTextField(20);
        window.add(this.spanishField);

        this.button = new JButton("Translate");
        window.add(this.button);
        this.button.addActionListener(this);

    }

    public void actionPerformed(ActionEvent event) {

        String text = englishField.getText();

        for (int i = 0; i < englishWords.length; i++) {
            if (text.equals(englishWords[i])) {
                this.spanishField.setText(spanishWords[i]);
            } else {
                /* JOptionPane.showMessageDialog(null, "No found it"); */
            }
        }

    }
}
