package org.example.javattd28.rapido;

public class User {

    public String name;
    public String mobileNumber;
    public String emaill;
    public String gender;
    public String userId;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", emaill='" + emaill + '\'' +
                ", gender='" + gender + '\'' +
                ", userId='" + userId + '\'' +
                '}';
    }
}
