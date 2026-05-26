import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

    public static void main(String[] args) {

        FileInputStream fin = null;
        FileOutputStream fout = null;

        try {

            // Source file
            fin = new FileInputStream(args[0]);

            // Destination file
            fout = new FileOutputStream(args[1]);

            int ch;

            // Read and copy character
            while((ch = fin.read()) != -1) {

                fout.write(ch);
            }

            System.out.println("File copied successfully");

        }

        catch(IOException e) {

            System.out.println("Error in file handling");
        }

        finally {

            try {

                if(fin != null)
                    fin.close();

                if(fout != null)
                    fout.close();
            }

            catch(IOException e) {

                System.out.println("Error while closing file");
            }
        }
    }
}
