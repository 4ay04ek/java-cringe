import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main{
    static private String getLine(BufferedReader br){
        StringBuilder sb = new StringBuilder();
        String line = null;
        try {
            line = br.readLine();
        } catch (IOException e) {}
        Queue<String> q = new LinkedList<String>();
        while (line != null){
            if (sb.isEmpty()) sb.append(" " + line + " ");
            else {
                boolean last = sb.charAt(sb.length() - 2) == line.charAt(0);
                boolean first = sb.charAt(1) == line.charAt(line.length() - 1);
                boolean find_last = sb.indexOf(line.charAt(0) + " ") != -1;
                boolean find_first = sb.indexOf(" " + line.charAt(line.length() - 1)) != -1;
                if (last) sb.append(line + " ");
                else if (first) sb.insert(0, " " + line);
                else if (find_last && find_first) sb.insert(sb.indexOf(line.charAt(0) + " ") + 2, line + " ");
                else q.add(line);
            }
            try {
                line = br.readLine();
            } catch (IOException e) {}
        }
        while (!q.isEmpty()){
            line = q.remove();
            boolean last = sb.charAt(sb.length() - 2) == line.charAt(0);
            boolean first = sb.charAt(1) == line.charAt(line.length() - 1);
            boolean find_last = sb.indexOf(line.charAt(0) + " ") != -1;
            boolean find_first = sb.indexOf(" " + line.charAt(line.length() - 1)) != -1;
            if (last) sb.append(line + " ");
            else if (first) sb.insert(0, " " + line);
            else if (find_last && find_first) sb.insert(sb.indexOf(line.charAt(0) + " ") + 2, line + " ");
        }
        sb.setLength(sb.length() - 1);
        return new String(sb).substring(1);
    }
    public static void main (String args[]){
        String s;
        System.out.println("Print filename: ");
        Scanner in = new Scanner(System.in);
        s = in.nextLine();
        try {
            Charset wnd1251 = Charset.forName("Windows-1251");
            BufferedReader br = new BufferedReader(new FileReader(s, wnd1251));
            System.out.println(getLine(br));
        } catch (IOException e) {}
        in.close();
    }
}