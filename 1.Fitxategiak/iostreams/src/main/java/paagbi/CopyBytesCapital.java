package paagbi;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytesCapital{
    public static void main(String[] args) throws IOException {

        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("xanadu.txt");
            out = new FileOutputStream("outagain.txt");
            int c;
            int count = 0;
            while ((c = in.read()) != -1) {
               if( c>= 'a' && c<='z'){
                  c-= 32;
               }
              
               out.write(c);
            
            }
            
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