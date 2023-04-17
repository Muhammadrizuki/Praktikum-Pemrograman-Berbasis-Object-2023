package login_app.models;

public class User {
    private String username;
    private String password;
    private Profile profile;
        
    public User() {

    }
    User(String username, String password, Profile profile){
        this.username = username;
        this.password = password;
        this.profile = profile;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setProfile(Profile profile) {
        this.profile = profile;
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    public Profile getProfile() {
        return profile;
    }

    /*
     * TODO:
     * Tambahkan attribute, method, atau constructor
     * yang dibutuhkan di kelas user
     */
}
