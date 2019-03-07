package com.spring.quickstart;

/**
 * Created by Administrator on 2019/3/4.
 */
public class User {
    private String account;
    private String password;
    public User(String account, String password) {
        this.account = account;
        this.password = password;
    }
    public User() {
    }
    public String getAccount() {
        return account;
    }
    public void setAccount(String account) {
        this.account = account;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    @Override
    public String toString() {
        return "User{" +
                "account='" + account + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}