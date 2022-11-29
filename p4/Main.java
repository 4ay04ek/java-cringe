import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame{

    private int c1 = 0, c2 = 0;

    Main(){
        super("Football match");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(330,200);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);
        JButton btn1 = new JButton("AC Milan"); btn1.setVerticalAlignment(JLabel.CENTER); btn1.setHorizontalAlignment(JLabel.CENTER);
        JButton btn2 = new JButton("Real Madrid"); btn2.setVerticalAlignment(JLabel.CENTER); btn2.setHorizontalAlignment(JLabel.CENTER); 
        JLabel label1 = new JLabel("Result: 0 X 0"); label1.setVerticalAlignment(JLabel.CENTER); label1.setHorizontalAlignment(JLabel.CENTER); 
        JLabel label2 = new JLabel("Last Scorer: N/A"); label2.setVerticalAlignment(JLabel.CENTER); label2.setHorizontalAlignment(JLabel.CENTER); 
        JLabel label3 = new JLabel("Winner: DRAW"); label3.setVerticalAlignment(JLabel.CENTER); label3.setHorizontalAlignment(JLabel.CENTER);
        add(btn1, BorderLayout.WEST);
        add(btn2, BorderLayout.EAST);
        add(label1, BorderLayout.CENTER);
        add(label2, BorderLayout.NORTH);
        add(label3, BorderLayout.SOUTH);
        btn1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                c1 += 1;
                label1.setText("Result: " + c1 + " X " + c2);
                label2.setText("Last Scorer: AC Milan");
                label3.setText("Winner: " + (c1 > c2 ? "AC Milan" : "Real Madrid"));
            }
        });
        btn2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                c2 += 1;
                label1.setText("Result: " + c1 + " X " + c2);
                label2.setText("Last Scorer: Real Madrid");
                label3.setText("Winner: " + (c1 > c2 ? "AC Milan" : "Real Madrid"));
            }
        });
        setVisible(true);
    }

    public static void main(String[]args)
    {
        new Main();
    }
}