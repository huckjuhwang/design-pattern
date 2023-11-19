package Chapter3.hj.javaIO;

import java.io.*;

public class InputTest {
    public static void main(String[] args) {
        int c;

        try {
            InputStream in = new LowerCaseInputStream(
                    new BufferedInputStream(
                            new FileInputStream("/Users/hyuckju/Desktop/hj/project/design-pattern/src/Chapter3/hj/javaIO/text.txt")
                    )
            );

            while ((c = in.read()) >= 0) {
                System.out.print((char)c);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
