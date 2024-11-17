import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromCSV {
    private static ReadFromCSV instance;
    ReadFromCSV() {
    }

    public void ReadFromFile(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] tokens = line.split(",");

                for (int i = 0; i < tokens.length; i++) {
                    System.out.println(tokens[i] + "\t");
                }
                System.out.println();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static ReadFromCSV getInstance() {
        if(instance== null) {
            instance = new ReadFromCSV();
        }
        return instance;
    }
}
