import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomSpinnerWithoutJSpinner extends JFrame {
    
    private JTextField textField;
    private int value = 0;

    CustomSpinnerWithoutJSpinner() {
        setTitle("Custom Spinner Example");
        setSize(300, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        textField = new JTextField(String.valueOf(value), 10);
        textField.setHorizontalAlignment(JTextField.CENTER);
        textField.setEditable(false);

        JButton decreaseButton = new JButton("-");
        decreaseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value--;
                textField.setText(String.valueOf(value));
            }
        });

        JButton increaseButton = new JButton("+");
        increaseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value++;
                textField.setText(String.valueOf(value));
            }
        });

        add(decreaseButton, BorderLayout.WEST);
        add(textField, BorderLayout.CENTER);
        add(increaseButton, BorderLayout.EAST);

        setVisible(true);
    }

    public static void main(String[] args) {
        new CustomSpinnerWithoutJSpinner();
    }
}
