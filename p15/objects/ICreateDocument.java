package objects;

public interface ICreateDocument {
    public IDocument createNew();
    public IDocument createOpen(String filename);
}
