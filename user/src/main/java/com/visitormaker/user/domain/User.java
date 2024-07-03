package com.visitormaker.user.domain;

//import jakarta.persistence.Entity;

//@Entity
public class User {

    private String userName;
    private String password;
    private String webName;

    public User(String userName, String password, String webName) {
        this.userName = userName;
        this.password = password;
        this.webName = webName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getWebName() {
        return webName;
    }

    public void setWebName(String webName) {
        this.webName = webName;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", webName='" + webName + '\'' +
                '}';
    }
}
