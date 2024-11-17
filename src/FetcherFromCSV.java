import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FetcherFromCSV {
    public static FetcherFromCSV instance;
    FetcherFromCSV() {}

    public String lineFetcher(String col,String identifier) throws IOException {
        int columnNum;
        switch (col) {
            case "User_ID" :
                columnNum = 0;
                break;
            case "User_Name" :
                columnNum = 1;
                break;
            case "Email_Address" :
                columnNum = 2;
            default:
                columnNum = 0;
        }
        try(BufferedReader br = new BufferedReader(new FileReader("D:\\OOP-2\\Lab_task_7\\User.csv"))) {
            String line;
            while((line= br.readLine())!=null)
            {
                String[] tokens = line.split(",");
                if(tokens.length>columnNum && tokens[columnNum].equals(identifier))
                {
                    return line;
                }
            }
        }
        catch (IOException e)
        {
            throw new IOException(e);
        }
        return null;
    }
    public static FetcherFromCSV getInstance()
    {
        if(instance==null)
        {
            instance = new FetcherFromCSV();
        }
        return  instance;
    }
}
