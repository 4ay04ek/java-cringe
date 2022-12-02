import javax.swing.*;
import java.awt.event.*;
import java.util.Random;

public class Main extends JFrame {
    static private int getNumber(){
        Random rnd = new Random();
        return rnd.nextInt(0, 9);
    }

    static int k = 0;

    Main() {
        super("Game");
        int number = getNumber();
        setSize(200, 100);
        setLayout(null);
        JTextField jtf = new JTextField();
        jtf.setBounds(20, 20, 80, 25);
        add(jtf);
        JButton jb = new JButton();
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jtf.getText().isEmpty()) return;
                k++;
                if (Integer.parseInt(jtf.getText()) == number) {
                    JOptionPane.showMessageDialog(null, "You win!");
                    setVisible(false);
                    return;
                }
                if (k == 3){
                    JOptionPane.showMessageDialog(null, "omg ur such a loser");
                    setVisible(false);
                    return;
                }
                if (Integer.parseInt(jtf.getText()) > number){
                    JOptionPane.showMessageDialog(null, "Less");
                } else if (Integer.parseInt(jtf.getText()) < number){
                    JOptionPane.showMessageDialog(null, "More");
                }
            }
        });
        jb.setText("Try");
        jb.setBounds(110, 20, 60, 25);
        add(jb);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Main();
    }
}
