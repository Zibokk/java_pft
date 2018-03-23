package JavaForTesterBook.domainentities;

public class User {

    private String username;
    private String password;
    public String usernick;

    public User() {
        username = "username";
        password = "password";
        usernick = "nick";
    }

    // we can call one constructor from another
//    public User(){
//        this("username", "password");
//    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    /// Constructor with parameters
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsernamep() {
        return username;
    }

    public String getPasswordp() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Example Setter
//    public User setPasswordd(String password) {
//        this.password = password;
//        return this;
//    }
}
