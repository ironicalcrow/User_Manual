import java.io.*;

public class DeleteFromCSV {
    DeleteFromCSV(){}
    private String filepath="D:\\OOP-2\\Lab_task_7\\User.csv";
    private static DeleteFromCSV instance;

    public void deleteUser(String user) {
        File fp= new File(filepath);
        File temp= new File(fp.getParent(),"tempfile.csv");
        try(BufferedReader reader= new BufferedReader(new FileReader(fp));
            BufferedWriter writer = new BufferedWriter(new FileWriter(temp))){
            String line;
            FetcherFromCSV ffc= FetcherFromCSV.getInstance();
            String deleted= ffc.lineFetcher("User_Name",user);
            while((line=reader.readLine())!=null){
                if(line.trim().equals(deleted.trim()) )
                {
                    continue;
                }
                else
                {
                    writer.write(line.trim());
                    writer.newLine();
                }
            }
            if(!fp.delete())
            {
                throw new IOException("Unable to delete file");
            }
            if(!temp.renameTo(fp))
            {
                throw new IOException("Unable to rename file");
            }
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }
    public static DeleteFromCSV getInstance(){
        if(instance==null)
        {
            instance=new DeleteFromCSV();
        }
        return instance;
    }


}
