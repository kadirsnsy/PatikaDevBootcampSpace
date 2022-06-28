import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("ssssss");

        Producer producer= new Producer();
        producer.start();
        Consumer consumer = new Consumer();
        consumer.start();


    }
}
