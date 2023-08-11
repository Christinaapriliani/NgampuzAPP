package com.ngampuzapp;

public class User {
    private String userID;
    private String password;

    public User(String userID, String password) {
        setUserID(userID);
        setPassword(password);
    }

    public String getUserID() {
        return userID;
    }

    public String getPassword() {
        return password;
    }

    private void setUserID(String userID) {
        if (userID != null && !userID.isEmpty()) {
            this.userID = userID;
        } else {
            throw new IllegalArgumentException("User ID tidak boleh kosong");
        }
    }

    private void setPassword(String password) {
        if (password != null && !password.isEmpty()) {
            this.password = password;
        } else {
            throw new IllegalArgumentException("Password tidak boleh kosong");
        }
    }
}
