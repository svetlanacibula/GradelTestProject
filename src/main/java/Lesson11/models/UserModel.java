package Lesson11.models;

public class UserModel {
    private String username = "gaisma.sipola@gmail.com";
    private String password = "NeesmuRobots1";
    private String usernameWrong = "gaisma.sipolagmail.com";

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public String getUsernameWrong() {
        return usernameWrong;
    }
}
