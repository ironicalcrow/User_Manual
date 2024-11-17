public abstract class User {
    private String user_name;
    private String email_adress;
    private String password;
    private int user_id;
    private static int next_user_id = 1;
    private String user_type;
    String filepath="D:\\OOP-2\\Lab_task_7\\User.csv";

    User(String user_name, String email_adress, String password) {
        this.user_name=user_name;
        this.email_adress=email_adress;
        this.password=password;
        this.user_id=next_user_id;
    }
    public String getUser_name() {
        return user_name;
    }
    public String getEmail_adress() {
        return email_adress;
    }
    public String getPassword() {
        return password;
    }
    public int getUser_id() {
        return user_id;
    }

    public String getUser_type() {
        return user_type;
    }
}
