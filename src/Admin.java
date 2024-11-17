public class Admin extends User {
    private String user_type= "Admin";
    Admin(String user_name,String email ,String user_password) {
        super(user_name,email,user_password);
    }
}
