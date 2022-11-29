package objects;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ItemEvent;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class InternetOrderForm extends JFrame {
    private InternetOrderManager iom = new InternetOrderManager();
    private ArrayList<MenuItem> selected_items = new ArrayList<MenuItem>();
    private DefaultListModel<String> selected_items_names = new DefaultListModel<String>();
    private int selected = -1, to_remove = -1, total_cost = 0;
    private boolean b1 = false, b2 = false, b3 = false, b4 = false, b5 = false, b6 = false;
    private boolean globalCheck(Address address) {
        InternetOrder[] orders = (InternetOrder[])iom.getOrders();
        for (int i = 0; i < orders.length; i++) {
            if (orders[i].getCustomer().getAddress().toString().equals(address.toString())) return false;
        }
        return true;
    }
    private void checkAll(JButton submit) {
        submit.setEnabled(b1 && b2 && b3 && b4 && b5 && b6);
    }
    public JLabel getForm() {
        JLabel container = new JLabel();
        setLocationRelativeTo(container);
        setLayout(null);
        container.setBounds(0, 30, 500, 470);

        JButton submit = new JButton("Order");
        submit.setBounds(15, 390, 455, 30);
        submit.setEnabled(false);
        container.add(submit);

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
                    b1 = true;
                } catch (Exception ex) {
                    b1 = false;
                }
                checkAll(submit);
            }
        });
        age.setBounds(50, 65, 50, 20);
        container.add(age_text);
        container.add(age);
        
        JLabel city_text = new JLabel("City: ");
        city_text.setBounds(250, 15, 30, 20);
        JTextField city = new JTextField();
        city.setBounds(285, 15, 100, 20);
        container.add(city_text);
        container.add(city);
        
        
        JLabel street_text = new JLabel("Street: ");
        street_text.setBounds(250, 40, 45, 20);
        JTextField street = new JTextField();
        street.setBounds(300, 40, 120, 20);
        container.add(street_text);
        container.add(street);

        JLabel zip_text = new JLabel("Zip: ");
        zip_text.setBounds(250, 65, 25, 20);
        JTextField zip = new JTextField();
        zip.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {check();}
            public void removeUpdate(DocumentEvent e) {check();}
            public void insertUpdate(DocumentEvent e) {check();}
            public void check() {
                try {
                    Integer.parseInt(zip.getText());
                    b2 = true;
                } catch (Exception ex) {
                    b2 = false;
                }
                checkAll(submit);
            }
        });
        zip.setBounds(280, 65, 60, 20);
        container.add(zip_text);
        container.add(zip);

        
        JLabel building_text = new JLabel("Building: ");
        building_text.setBounds(250, 90, 55, 20);
        JTextField building = new JTextField();
        building.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {check();}
            public void removeUpdate(DocumentEvent e) {check();}
            public void insertUpdate(DocumentEvent e) {check();}
            public void check() {
                try {
                    Integer.parseInt(building.getText());
                    b3 = true;
                } catch (Exception ex) {
                    b3 = true;
                }
                checkAll(submit);
            }
        });
        building.setBounds(310, 90, 40, 20);
        container.add(building_text);
        container.add(building);
        
        JLabel apartment_text = new JLabel("Apartments: ");
        apartment_text.setBounds(250, 115, 70, 20);
        JTextField apartment = new JTextField();
        apartment.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {check();}
            public void removeUpdate(DocumentEvent e) {check();}
            public void insertUpdate(DocumentEvent e) {check();}
            public void check() {
                try {
                    Integer.parseInt(apartment.getText());
                    b4 = true;
                } catch (Exception ex) {
                    b4 = false;
                }
                checkAll(submit);
            }
        });
        apartment.setBounds(325, 115, 40, 20);
        container.add(apartment_text);
        container.add(apartment);
        
        JLabel bl_text = new JLabel("Build. Letter: ");
        bl_text.setBounds(250, 140, 80, 20);
        JTextField bl = new JTextField();
        bl.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {check();}
            public void removeUpdate(DocumentEvent e) {check();}
            public void insertUpdate(DocumentEvent e) {check();}
            public void check() {
                b5 = (bl.getText().length() == 1);
                checkAll(submit);
            }
        });
        bl.setBounds(335, 140, 40, 20);
        container.add(bl_text);
        container.add(bl);

        JLabel menu_text = new JLabel("Menu: ");
        menu_text.setBounds(15, 90, 80, 20);
        container.add(menu_text);
        
        JLabel cost = new JLabel("Total cost: 0");
        cost.setBounds(15, 330, 500, 30);
        container.add(cost);

        MenuItem[] menu = (new Menu()).getMenu();
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
        jsp_added.setBounds(250, 165, 220, 130);
        jl_added.addListSelectionListener((e) -> {
            to_remove = jl_added.getSelectedIndex();
        });
        container.add(jsp_added);

        JButton jb = new JButton("Add");
        jb.setBounds(15, 300, 220, 30);
        jb.addActionListener((e) -> {
            if (selected == -1) return;
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
        arrow.setBounds(237, 225, 20, 10);
        container.add(arrow);

        JCheckBox jcb = new JCheckBox("I agree with Terms of Service and Privacy Policy");
        jcb.setBounds(15, 360, 500, 30);
        container.add(jcb);
        jcb.addItemListener((e) -> {
            b6 = e.getStateChange() == ItemEvent.SELECTED;
            checkAll(submit);
        });

        submit.addActionListener((e) -> {
            Address address = new Address(city.getText(), street.getText(), Integer.parseInt(zip.getText()), Integer.parseInt(building.getText()), Integer.parseInt(apartment.getText()), bl.getText().charAt(0));
            if (!globalCheck(address)) {
                submit.setEnabled(false);
                return;
            }
            Customer customer = new Customer(name.getText(), surname.getText(), Integer.parseInt(age.getText()), address);
            InternetOrder order = new InternetOrder();
            for (MenuItem item: selected_items) {
                order.add(item);
            }
            order.setCustomer(customer);
            iom.add(order);
        });

        return container;
    }
}
