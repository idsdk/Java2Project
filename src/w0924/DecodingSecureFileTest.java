package w0924;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class DecodingSecureFileTest {
    public static void main(String[] args) {
        String filePath = "D:/FileTest/secure1.txt";
        String encoded = "";
        String decoded = "";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                encoded += line;

                for (int i = 0; i < line.length(); i++) {
                    int code = (int) line.charAt(i);
                    code -= 100;
                    decoded += (char) code;
                }
            }
        } catch (IOException e) {
            System.out.println("Error");
        }
        System.out.println("암호화된 내용: " + encoded);
        System.out.println("복호화된 내용: " + decoded);
    }
}