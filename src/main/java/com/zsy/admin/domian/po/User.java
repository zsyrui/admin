package com.zsy.admin.domian.po;

public class User {
    private Integer id;

    private String username;

    private String password;

    private String phone;

    private String mail;

    private String userface;

    public User(Integer id, String username, String password, String phone, String mail, String userface) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.mail = mail;
        this.userface = userface;
    }

    public User() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail == null ? null : mail.trim();
    }

    public String getUserface() {
        return userface;
    }

    public void setUserface(String userface) {
        this.userface = userface == null ? null : userface.trim();
    }
}