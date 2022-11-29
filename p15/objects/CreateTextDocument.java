package objects;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CreateTextDocument implements ICreateDocument {

    @Override
    public IDocument createNew() {
        TextDocument td = new TextDocument("blank.txt", "");
        return td;
    }

    @Override
    public IDocument createOpen(String filename) {
        try {
            String value = Files.readString(Path.of(filename));
            TextDocument td = new TextDocument(filename, value);
            return td;
        } catch (IOException e){
            return createNew();
        }
    }
}
