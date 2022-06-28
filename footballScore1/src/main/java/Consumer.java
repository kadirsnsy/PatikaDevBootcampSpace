import java.io.*;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Consumer extends  Thread {

    @Override
    public void run() {
        try {
            scoreRead();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    private void scoreRead() throws IOException, InterruptedException {
        File file =new File("score.txt");
        FileReader   reader = new FileReader(file);
        PrintWriter writer=null;
        BufferedReader br= new BufferedReader(reader);
        // İçeriği okuma işlemi yapılır
        while (true) {
            String yazi = br.readLine();
            if (yazi!=null)
            {
                System.out.println(yazi);
            }
            else {
                reader.close();
                br.close();
                writer = new PrintWriter(file);
                writer.print("");
                reader = new FileReader(file);
                br= new BufferedReader(reader);
            }

            Thread.sleep(500);

        }
    }

}
