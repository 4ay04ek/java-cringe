package objects;
import java.io.PrintWriter;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class TextDocument implements IDocument {
    private String filename;
    private String value;
    private JTextArea jta;

    public TextDocument(String filename, String value){
        this.filename = filename;
        this.value = value;
    }

    @Override
    public void setFilename(String string) {
        filename = string;
    }
    @Override
    public String getFilename(){
        return filename;
    }

    public void setValue(String string){
        value = string;
    }

    @Override
    public JLabel getContent() {
        JLabel jl = new JLabel();
        jta = new JTextArea();
        jta.setText(value);
        jl.setSize(400, 250);
        jta.setSize(400, 250);
        jta.setLineWrap(true);
        jl.add(jta);
        return jl;
    }

    @Override
    public void save() {
        setValue(jta.getText());
        try(PrintWriter pf = new PrintWriter(filename, "UTF-8")) {
            pf.write(value);
        } catch (Exception e) {}
    }
}
