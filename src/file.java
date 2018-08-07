import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class file {
    public static void main(String[] args) throws IOException {
        //creating directory and file
        String directory = "data";
        String fileName = "info.txt";
        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory, fileName);

        //Checks if file exists
        System.out.println(Files.exists(dataFile));
        System.out.println(Files.exists(dataDirectory));

        if (Files.notExists(dataDirectory)) {
            Files.createDirectory(dataDirectory);

        }
        if (!Files.exists(dataFile)) {
            Files.createFile(dataFile);
        }


        //reading the file
        try {
            List<String> contents = Files.readAllLines(Paths.get("data/info.txt"));
            System.out.println(contents.toString());
        } catch (IOException e) {
            System.out.println("exception");
            e.printStackTrace();
        }

        //write to the file
        Path p = Paths.get("./data", "info.txt");

        List<String> animals = new ArrayList<>();
        animals.add("pig");
        animals.add("cow");
        animals.add("dog");

        try {
            Files.write(p, animals, StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
