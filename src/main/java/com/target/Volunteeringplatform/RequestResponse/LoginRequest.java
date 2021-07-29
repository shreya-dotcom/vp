package com.target.Volunteeringplatform.RequestResponse;

import javax.validation.constraints.NotBlank;

public class LoginRequest {
	
	@NotBlank
    private String email;

    @NotBlank
    private String password;

    public String getEmail() {
        return email;
    }

    public LoginRequest(@NotBlank String email, @NotBlank String password) {
        super();
        this.email = email;
        this.password = password;
    }

    public void setUsername(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "LoginRequest{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

}
