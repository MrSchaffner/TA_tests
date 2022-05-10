import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BStream {
    public static void main(String[] args) throws IOException{
        FileInputStream sourceStream = null;
        FileOutputStream targetStream = null;

        try {
            sourceStream = new FileInputStream("sourcefile.txt");
            targetStream = new FileOutputStream("targetfile.txt");

            // reading source file and writing to target
            int temp;
            while ((temp = sourceStream.read()) != -1) //gets characters one at a time
                targetStream.write((byte)temp);
        }

        finally {
            if (sourceStream != null)
                sourceStream.close();
            if (targetStream != null)
                targetStream.close();
        }


    }

}
