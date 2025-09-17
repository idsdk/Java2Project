package w0917;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.ByteBuffer;

public class FileReadTest02 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        BufferedReader br = null;
        String line = null;
        try {
            br = new BufferedReader(new FileReader(("D:/FileTest/MyData1.txt")));
            while (true){
                line = br.readLine();
                if (line == null) break;
                sb.append(line + "\n");
            }
        }catch (FileNotFoundException e){
            System.out.println("File Not Found");
        }catch (IOException e) {
            System.out.println("Line read error");
        }

        try {
            br.close();
        }catch (IOException e) {
            System.out.println("Closing file error");
        }

        sb.reverse();
        System.out.println(sb);

    }
}
