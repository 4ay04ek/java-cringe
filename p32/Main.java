import objects.*;
import javax.swing.*;

public class Main extends JFrame {
    public JLabel it;
    public InternetOrderForm internet_form;
    public TableOrderForm table_form;
    Main(){
        super("Shop");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(500, 500);
        setLayout(null);
        setResizable(false);
        JButton jb1 = new JButton("Table Order");
        jb1.setBounds(0, 0, 250, 30);
        jb1.addActionListener((e) -> {
            if (table_form != null) return;
            if (it != null) remove(it);
            table_form = new TableOrderForm();
            it = table_form.getForm();
            add(it);
            validate();
            repaint();
        });
        add(jb1);
        JButton jb2 = new JButton("Internet Order");
        jb2.setBounds(250, 0, 250, 30);
        jb2.addActionListener((e) -> {
                if (internet_form != null) return;
                if (it != null) remove(it);
                internet_form = new InternetOrderForm();
                it = internet_form.getForm();
                add(it);
                validate();
                repaint();
            });
        add(jb2);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Main();
    } 
}
