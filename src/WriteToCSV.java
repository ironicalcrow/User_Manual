import java.util.*;
import java.io.*;
public class WriteToCSV {
    private static WriteToCSV instance;
    private String filepath= "D:\\OOP-2\\Lab_task_7\\User.csv";
    public void WriteUser(String ln) {
        try(BufferedWriter bf= new BufferedWriter(new FileWriter(filepath)))
        {
            bf.append(ln);
            bf.newLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static WriteToCSV getInstance() {
        if (instance == null) {
            instance = new WriteToCSV();
        }
        return instance;
    }


}
