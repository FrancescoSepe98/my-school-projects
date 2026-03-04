package src;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        WriterAndReader wr = new WriterAndReader();
        String filePath = "C:\\Users\\franc\\OneDrive\\Desktop\\programmazione\\java\\eserciziJavaAvanzato\\ExerciseStreams2\\src\\Hello.txt";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime time = LocalTime.parse(LocalTime.now().format(formatter));
        wr.write(filePath,"Hello World, right now it's " + time.toString());
        System.out.println("Reading the new file");
        wr.read(filePath);

    }
}

