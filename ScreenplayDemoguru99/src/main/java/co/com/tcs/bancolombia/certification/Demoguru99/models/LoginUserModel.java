package co.com.tcs.bancolombia.certification.Demoguru99.models;

public class LoginUserModel {

    private String userID;
    private String password;

    public LoginUserModel(String userID, String password) {
        this.userID = userID;
        this.password = password;
    }

    public String getUserID() {
        return userID;
    }
    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
