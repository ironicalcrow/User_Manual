import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Power_user extends User implements Writer,Reader{
    private String user_type= "Power";
    Power_user(String user_name, String email, String password){
        super(user_name, email, password);
    }

    @Override
    public void write() {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(filepath, true))){
            String s= getUser_id()+", "+getUser_name()+", "+getEmail_adress()+", "+getPassword()+", "+getUser_type();
            bw.append(s);
            bw.newLine();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }

    @Override
    public void read() {

    }
}
