package objects;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class TableOrderForm extends JFrame {
    private ArrayList<MenuItem> selected_items = new ArrayList<MenuItem>();
    private DefaultListModel<String> selected_items_names = new DefaultListModel<String>();
    private int selected = -1, to_remove = -1, total_cost = 0;
    public JLabel getForm() {
        JLabel container = new JLabel();
        setLocationRelativeTo(container);
        setLayout(null);
        
        JButton submit = new JButton("Order");
        submit.setBounds(15, 390, 455, 30);
        submit.setEnabled(false);
        container.add(submit);

        container.setBounds(0, 30, 500, 470);
        JLabel name_text = new JLabel("Name: ");
        name_text.setBounds(15, 15, 40, 20);
        JTextField name = new JTextField();
        name.setBounds(60, 15, 100, 20);
        container.add(name_text);
        container.add(name);

        JLabel surname_text = new JLabel("Surname: ");
        surname_text.setBounds(15, 40, 60, 20);
        JTextField surname = new JTextField();
        surname.setBounds(80, 40, 100, 20);
        container.add(surname_text);
        container.add(surname);

        JLabel age_text = new JLabel("Age: ");
        age_text.setBounds(15, 65, 30, 20);
        JTextField age = new JTextField();
        age.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {check();}
            public void removeUpdate(DocumentEvent e) {check();}
            public void insertUpdate(DocumentEvent e) {check();}
            public void check() {
                try {
                    Integer.parseInt(age.getText());
                    submit.setEnabled(true);
                } catch (Exception ex) {
                    submit.setEnabled(false);
                }
            }
        });
        age.setBounds(50, 65, 50, 20);
        container.add(age_text);
        container.add(age);
        
        JLabel table_text = new JLabel("Table: ");
        table_text.setBounds(250, 15, 40, 20);
        JTextField table = new JTextField();
        table.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {check();}
            public void removeUpdate(DocumentEvent e) {check();}
            public void insertUpdate(DocumentEvent e) {check();}
            public void check() {
                try {
                    Integer.parseInt(table.getText());
                    submit.setEnabled(true);
                } catch (Exception ex) {
                    submit.setEnabled(false);
                }
            }
        });
        table.setBounds(295, 15, 100, 20);
        container.add(table_text);
        container.add(table);

        JLabel menu_text = new JLabel("Menu: ");
        menu_text.setBounds(15, 90, 80, 20);
        container.add(menu_text);
        
        JLabel cost = new JLabel("Total cost: 0");
        cost.setBounds(15, 330, 500, 30);
        container.add(cost);

        MenuItem[] menu = (new Menu()).getAlcoMenu();
        String names[] = new String[menu.length];
        for (int i = 0; i < menu.length; i++) {
            names[i] = menu[i].getName() + " | " + menu[i].getDescription();
        }

        JList<String> jl = new JList<String>(names);
        jl.setLayoutOrientation(JList.VERTICAL);
        jl.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane jsp = new JScrollPane(jl);
        jsp.setBounds(15, 115, 220, 180);
        jl.addListSelectionListener((e) -> {
            selected = jl.getSelectedIndex();
        });
        container.add(jsp);

        JList<String> jl_added = new JList<String>(selected_items_names);
        jl_added.setLayoutOrientation(JList.VERTICAL);
        jl_added.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane jsp_added = new JScrollPane(jl_added);
        jsp_added.setBounds(250, 115, 220, 180);
        jl_added.addListSelectionListener((e) -> {
            to_remove = jl_added.getSelectedIndex();
        });
        container.add(jsp_added);

        JButton jb = new JButton("Add");
        jb.setBounds(15, 300, 220, 30);
        jb.addActionListener((e) -> {
            if (selected == -1) return;
            if (((Drink)menu[selected]).isAlcoholicDrink()){
                try {
                    if (Integer.parseInt(age.getText()) < 18) return;
                } catch (Exception ex) { return; }
            }
            selected_items.add(menu[selected]);
            selected_items_names.addElement(menu[selected].getName() + " | " + menu[selected].getDescription());
            total_cost += menu[selected].getCost();
            cost.setText("Total cost: " + total_cost);
        });
        container.add(jb);        

        JButton jb_remove = new JButton("Remove");
        jb_remove.setBounds(250, 300, 220, 30);
        jb_remove.addActionListener((e) -> {
            if (to_remove == -1) return;
            int remove = 0;
            for (int i = 0; i < menu.length; i++) {
                if ((menu[i].getName() + " | " + menu[i].getDescription()).equals(selected_items_names.get(to_remove))) remove = i;
            }
            selected_items.remove(menu[remove]);
            selected_items_names.remove(to_remove);
            total_cost -= menu[remove].getCost();
            cost.setText("Total cost: " + total_cost);
        });
        container.add(jb_remove);

        JLabel arrow = new JLabel("->");
        arrow.setBounds(237, 205, 20, 10);
        container.add(arrow);

        return container;
    }
}
