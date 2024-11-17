import java.io.IOException;

public class UpdateToCSV {
    private String filepath= "D:\\OOP-2\\Lab_task_7\\User.csv";
    public static UpdateToCSV instance;
    public void UpdateUser(String id,String Update, int attr) throws IOException {
        FetcherFromCSV f = new FetcherFromCSV();
        String line = f.lineFetcher("User_ID",id);
        String[] data = line.split(",");
        switch (attr) {
            case 1:
                data[1] = Update;
                break;
            case 2:
                data[2] = Update;
                break;
            case 3:
                data[3] = Update;
                break;
        }

        String write= data[0]+","+data[1]+","+data[2]+","+data[3];
        DeleteFromCSV d= DeleteFromCSV.getInstance();
        d.deleteUser(id);
        WriteToCSV w = WriteToCSV.getInstance();
        w.WriteUser(write);

    }

    public static UpdateToCSV getInstance() {
        if (instance == null) {
            instance = new UpdateToCSV();
        }
        return instance;
    }
}
