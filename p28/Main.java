import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static ArrayList<String> getDirectory(String folder){
        File file = new File(folder);
        String[] directories = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return new File(dir, name).isDirectory();
            }
        });
        return new ArrayList<String>(Arrays.asList(directories));
    }
    public static void main(String[] args) {
        ArrayList<String> dirs = getDirectory("..\\");
        for (int i = 0; i < 5; i++){
            System.out.println(dirs.get(i));
        }
    }    
}
