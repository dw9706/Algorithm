import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            if(Character.isDigit(c)) sb.append(c);
        }
        br.close();
        System.out.println(Integer.parseInt(sb.toString()));
    }
}
