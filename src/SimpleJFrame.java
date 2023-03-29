
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class SimpleJFrame extends JFrame{
    SimpleJFrame(String s) {
        super(s);
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 1));
        JLabel l1 = new JLabel();
        l1.setForeground(Color.RED);
        l1.setFont(new Font("Comic Sans MS", Font.ITALIC, 20));
        add(l1);
        JTextField t1 = new JTextField();
        t1.setBackground(Color.pink);
        add(t1);
        JButton b1 = new JButton();
        b1.setText("Пуск");
        add(b1);
        class ButtonListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                l1.setText("Текст");
            }
        }
        ButtonListener buttonListener = new ButtonListener();
        b1.addActionListener(buttonListener);

        setVisible(true);
    }
}