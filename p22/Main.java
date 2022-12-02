import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Main extends JFrame {
    static private Image loadImage(String url) throws IOException{
        return ImageIO.read(new File(url));
    }
    static Image img;

    Main() {
        super("Image");
        setSize(500, 600);
        setVisible(true);
        JLabel image = new JLabel() {
            @Override
            protected void paintComponent(Graphics g) {
                g.drawImage(img, 0, 0, getWidth(), getHeight(), null);
            }
        };
        add(image);
    }
    public static void main(String[] args) {
        try {
            img = loadImage(args[0]);
        } catch (IOException e){
            System.out.println(e);
        }
        new Main();
    }
}
