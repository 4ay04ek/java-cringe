package objects;

import javax.swing.JLabel;

public interface IDocument {
    public void setFilename(String string);
    public String getFilename();
    public void save();
    public JLabel getContent();
}
