package sorce.view;
import sorce.data.PCShop;
import sorce.data.Components;
import sorce.data.GPU;
import sorce.data.CPU;
import sorce.data.SystemUnit;
import javax.swing.table.AbstractTableModel;
import javax.swing.*;
import java.awt.event.*;

public class AddView extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JComboBox comboBox1;
    private JFormattedTextField txtInput1;
    private JFormattedTextField txtInput2;
    private JFormattedTextField txtInput3;
    private JFormattedTextField txtInput4;
    private JFormattedTextField txtInput5;
    private JLabel label5;
    private boolean txt5;
    public AddView() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try{
                    Integer.parseInt(txtInput2.getText());
                    Integer.parseInt(txtInput3.getText());
                    Integer.parseInt(txtInput4.getText());

                    if (txt5) {
                        Double.parseDouble(txtInput5.getText());
                    }
                    onOK();
                }
                catch (Exception exception){
                    JOptionPane.showMessageDialog(AddView.this, "Проверьте корректность введенных данных!" ,"Ошибка ввода", JOptionPane.ERROR_MESSAGE);
//                    return;
                }


            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);

    }

    private void onOK() {
        // add your code here
        dispose();
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }

    public static void main(String[] args) {
        AddView dialog = new AddView();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }

    private void createUIComponents() {
        setTitle("Добавление нового элемента");
        String[] items = {
                "Процессор",
                "Материнская плата",
                "Видеокарта",
                "Блок питания"
        };

        ActionListener actionListener = new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                if (comboBox1.getSelectedItem() ==  "Процессор"){
                    label5.setText("Частота CPU/Ггц");
                    txtInput5.setVisible(true);
                    txt5 = true;
                }
                if (comboBox1.getSelectedItem() ==  "Материнская плата"){
                    label5.setText("");
                    txtInput5.setVisible(false);
                    txt5 = false;
                }
                if (comboBox1.getSelectedItem() ==  "Видеокарта"){
                    label5.setText("Размер памяти/GB");
                    txtInput5.setVisible(true);
                    txt5 = true;
                }
                if (comboBox1.getSelectedItem() ==  "Блок питания"){
                    label5.setText("Мощность/Wat");
                    txtInput5.setVisible(true);
                    txt5 = true;
                }
            }
        };
        comboBox1 = new JComboBox(items);
        comboBox1.addActionListener(actionListener);


     //   comboBox1.setEditable(true);


    }
}
