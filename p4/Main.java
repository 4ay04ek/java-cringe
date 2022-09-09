import javax.swing.JFrame;
import javax.swing.JTextField;

public class Main extends JFrame{
    JTextField jta = new JTextField(10);

    Main(){
        super("Example");
        setSize(250,100);
        setVisible(true);
    }

    public static void main(String[]args)
    {
        new Main();
    }
}