package paagbi;
import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
public class CopyBytesLine{
    public static void main(String[] args) throws IOException {

        BufferedReader in = null;
        BufferedWriter out = null;

        try {
            in = new BufferedReader(new FileReader("xanadu.txt"));
            out = new BufferedWriter(new FileWriter("outagain.txt"));
            String c;
            int count = 0;
            while ((c = in.readLine()) != null) {
                count = count+1;
               out.write(count+ ". " + c);
               out.newLine();
               
            }
            System.out.println("");
            
        }
        catch(FileNotFoundException ex){
               System.out.println("Ez da aurkitu sanadu fitxategirik. ("+ in+")" );

            }
        finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}