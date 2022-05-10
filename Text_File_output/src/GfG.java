import java.io.*;

public class GfG {
    public static void  main(String[] args) throws IOException{
        FileReader sourceStream = null;
        try
        {
            sourceStream = new FileReader("test.txt");
            //character by char
            int temp;
            while((temp = sourceStream.read()) != -1)
                System.out.println((char) temp);
        }
        finally {
            //closing stream as no longer in use
            if (sourceStream != null)
                sourceStream.close();
        }
    }

}
