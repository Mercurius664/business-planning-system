package org.economics.planningsystem.dto.employee.response;

// from PUT /users/{id}/login
public class ChangeLoginResponse {
    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
