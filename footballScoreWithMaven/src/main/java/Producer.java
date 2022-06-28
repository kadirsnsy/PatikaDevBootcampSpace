import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Producer extends  Thread {
    private static Scanner scanner = new Scanner(System.in);
    BufferedWriter writer=null;
    String firstTeamName;
    @Override
    public void run() {
        try {
            writeScore();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public  void writeScore()
            throws IOException, InterruptedException {
        ;

        while (true){
            System.out.println("Birinci takım ismi: ");
            String firstTeamName = scanner.next();

            System.out.println("Birinci takım gol sayısı: ");
            int firstTeam = scanner.nextInt();

            System.out.println("İkinci takım ismi: ");
            String secondTeamName = scanner.next();

            System.out.println("İkinci takım gol sayısı: ");
            int secondTeam = scanner.nextInt();

            writer = new BufferedWriter(new FileWriter("score.txt", true));
            writer.append('\n');
            writer.append(firstTeamName+" "+String.valueOf(firstTeam)+"-"+String.valueOf(secondTeam)+" "+secondTeamName);
            writer.close();
            Thread.sleep(1000);
        }

    }
}

