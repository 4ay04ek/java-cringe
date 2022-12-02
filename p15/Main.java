import objects.*;
import javax.swing.*;

public class Main extends JFrame {
    TextDocument document;
    JLabel content;
    Main(){
        super("Window");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JMenuBar jmb = new JMenuBar();
        JMenu jm = new JMenu("File");
        jm.setSize(400, 30);
        JMenuItem newJmi = new JMenuItem("New"); newJmi.addActionListener((e) -> {
            if (content != null) remove(content);
            CreateTextDocument ctd = new CreateTextDocument();
            document = (TextDocument)ctd.createNew();
            content = document.getContent();
            add(content);
        });
        JMenuItem openJmi = new JMenuItem("Open"); openJmi.addActionListener((e) -> {
            if (content != null) remove(content);
            CreateTextDocument ctd = new CreateTextDocument();
            String filename = JOptionPane.showInputDialog("Write filename: ");
            document = (TextDocument) ctd.createOpen(filename);
            content = document.getContent();
            add(content);
        });
        JMenuItem saveJmi = new JMenuItem("Save"); saveJmi.addActionListener((e) -> {
            String filename = JOptionPane.showInputDialog("Write filename: ");
            document.setFilename(filename);
            document.save();
        });
        JMenuItem exitJmi = new JMenuItem("Exit"); exitJmi.addActionListener((e) -> System.exit(0));
        jm.add(newJmi);
        jm.add(openJmi);
        jm.add(saveJmi);
        jm.add(exitJmi);
        jmb.add(jm);
        setJMenuBar(jmb);
        setSize(400, 300);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Main();
    }
}
