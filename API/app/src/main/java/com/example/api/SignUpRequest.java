package com.example.api;

public class SignUpRequest {
    private String account_id;
    private String password;
    private String name;

    public SignUpRequest(String account_id, String password, String name) {
        this.account_id = account_id;
        this.password = password;
        this.name = name;
    }

    public String getAccount_id() {
        return account_id;
    }
    public String getPassword() {
        return password;
    }
    public String getName() {
        return name;
    }
}
