package sorce.view;
import sorce.data.PCShop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.TableColumn;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
public class MainWindow extends JFrame {

    private JTable jTable;
    private MyTableModel myTableModel;
    private JButton btnDel;
    private JButton btnAdd;
    private JComboBox comboBox1;
//    protected JButton btnFind;
    public MainWindow() {

        super("Комлектующие");
        JFrame jFrame = new JFrame();
        jFrame.setDefaultCloseOperation( EXIT_ON_CLOSE );
        jFrame.setSize(1000,600);

        JPanel workPanel = new JPanel(new GridBagLayout());
        workPanel.setLayout(new BoxLayout(workPanel, BoxLayout.Y_AXIS));
        workPanel.setBorder(new EmptyBorder(10, 10, 10, 10));

        JPanel sortingPanel = new JPanel(new GridBagLayout());
        sortingPanel.setLayout(new FlowLayout());
        sortingPanel.setBorder(new EmptyBorder(10, 10, 10, 10));

        JLabel label = new JLabel("Сортировка: ");
        String[] items = {
                "Процессор",
                "Материнская плата",
                "Видеокарта",
                "Блок питания"
        };

        ActionListener actionListener = new ActionListener() {

            public void actionPerformed(ActionEvent e) {

            }
        };
        comboBox1 = new JComboBox(items);
        comboBox1.setSize(47,26);
        comboBox1.addActionListener(actionListener);

        //главное поле
        JPanel mainPanel = new JPanel(new GridBagLayout());
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBorder(new EmptyBorder(10, 10, 10, 10));


        //поле для кнопок
        JPanel buttonjPanel = new JPanel(new GridBagLayout());
        buttonjPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        buttonjPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        buttonjPanel.setMaximumSize(new Dimension(jFrame.getWidth(), 30));
        buttonjPanel.setBorder(new EmptyBorder(10, 10, 10, 10));

        //создание таблицы
        myTableModel = new MyTableModel(new PCShop());
        jTable = new JTable();
        jTable.setModel(myTableModel);

        //вид таблицы
        TableColumn col0 = jTable.getColumnModel().getColumn( 0 );
        ((TableColumn) col0).setMinWidth(130);
        TableColumn col1 = jTable.getColumnModel().getColumn( 1 );
        ((TableColumn) col1).setMinWidth(230);
        TableColumn col2 = jTable.getColumnModel().getColumn( 2 );
        ((TableColumn) col2).setMinWidth(70);
        TableColumn col3 = jTable.getColumnModel().getColumn( 3 );
        ((TableColumn) col3).setMinWidth(80);
        TableColumn col4 = jTable.getColumnModel().getColumn( 4 );
        ((TableColumn) col4).setMinWidth(70);
        TableColumn col5 = jTable.getColumnModel().getColumn( 5 );
        ((TableColumn) col5).setMinWidth(100);
        TableColumn col6 = jTable.getColumnModel().getColumn( 6 );
        ((TableColumn) col6).setMinWidth(110);
        TableColumn col7 = jTable.getColumnModel().getColumn( 7 );
        ((TableColumn) col7).setMinWidth(110);

        JScrollPane jScrollPane = new JScrollPane (jTable);
        jScrollPane.setBorder(new EmptyBorder(10, 10, 10, 10));

        //Кнопка добавления
        btnAdd = new JButton("Добавить");
        btnAdd.setPreferredSize(new Dimension(120, 40));
        btnAdd.addActionListener(new ListenerAdd());
        buttonjPanel.add(btnAdd);

        //Кнопка удаления
        btnDel = new JButton("Удалить");
        btnDel.setPreferredSize(new Dimension(120, 40));
        btnDel.addActionListener(new myListener());
        buttonjPanel.add(btnDel);

        //Поиск
//        btnFind = new JButton("Поиск");
//        btnFind.setPreferredSize(new Dimension(120, 40));
//        btnFind.addActionListener(new ListenerFind());
//        buttonjPanel.add(btnFind);

//        workPanel.add(mainPanel);

        mainPanel.add(jScrollPane);
        mainPanel.add(buttonjPanel);

        sortingPanel.add(label);
        sortingPanel.add(comboBox1);

//        workPanel.add(label);
//        workPanel.add(comboBox1);
        workPanel.add(sortingPanel);
        workPanel.add(mainPanel);


        jFrame.add(workPanel);

        this.pack();
        this.setLocationRelativeTo (null);



//        // Простая кнопка
//        button = new JButton("Обычная кнопка");
//        // Подключение слушателей событий
//        button.addActionListener(new ListenerAction());
//        button.addChangeListener(new ListenerChange());
//        // присоединение слушателя прямо на месте
//        button.addItemListener(new ItemListener() {
//            public void itemStateChanged(ItemEvent e) {
//                System.out.println("Это событие мы не увидим");
//            }});
//        container.add(button);
//        // Кнопка со значками на все случаи жизни
//        button = new JButton();
//        button.setIcon        (new ImageIcon("images/copy.png"));
//        button.setRolloverIcon(new ImageIcon("images/cut.png" ));
//        button.setPressedIcon (new ImageIcon("images/open.png"));
//        button.setDisabledIcon(new ImageIcon("images/save.png"));
//        // Убираем все ненужные рамки и закраску
//        button.setBorderPainted(false);
//        button.setFocusPainted(false);
//        button.setContentAreaFilled(false);
//        container.add(button);
//        // Кнопка с описанием интерфейса в виде HTML-текста
//        button = new JButton("<html><h2><font color=\"yellow\">Синяя кнопка");
//        // button.setOpaque(true);
//        button.setBackground(Color.blue);
//        container.add(button);
//        // Изменение выравнивания текста и изображения
//        button = new JButton("Изменение выравнивания",
//                new ImageIcon("images/exit.png"));
//        button.setMargin                (new Insets(10, 10, 10, 10));
//        button.setVerticalAlignment     (SwingConstants.TOP   );
//        button.setHorizontalAlignment   (SwingConstants.RIGHT );
//        button.setHorizontalTextPosition(SwingConstants.LEFT  );
//        button.setVerticalTextPosition  (SwingConstants.BOTTOM);
//        button.setIconTextGap(10);
//        // сделаем кнопку большой, чтобы увидеть выравнивание
//        button.setPreferredSize(new Dimension(300, 100));
//        container.add(button);
//        // отключенная кнопка
//        button = new JButton("Выключено");
//        button.setEnabled(false);
//        container.add(button);
        // выводим окно на экран




        jFrame.setVisible(true);
    }
    class ListenerAdd implements ActionListener {
        public void actionPerformed(ActionEvent e) {
          AddView addView = new AddView();
    //      addView.setDefaultCloseOperation( EXIT_ON_CLOSE );
          addView.setSize(400,400);
          addView.setVisible(true);
        }
    }
    class myListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                myTableModel.delete(jTable.getSelectedRow());
            }
            catch(IndexOutOfBoundsException ex){
                JOptionPane.showMessageDialog(MainWindow.this, "Чтобы удалить, нужно выделить строку!","Ошибка удаления", JOptionPane.ERROR_MESSAGE);
            }

        }
    }
    class ListenerFind implements ActionListener {
        public void actionPerformed(ActionEvent e) {

        }
    }
}
