package com.liquibase;

public class UserPage {
    private String firstName;
    private String password;
    private String email;
    private String middleName;
    private String lastName;
    private String  url;
    private String company;
    private String text;

        public UserPage(){
        firstName ="Olena";
        password ="Qwerty!1";
        email = "tunykelena@gmail.com";
        lastName = "Tester";
        middleName = "Victoria";
        url = "www.nettopic.com";
        company = "Test";
        text = "text text text text";
    }


    public String getFirstName() {
        return firstName;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getMiddleName() { return middleName; }

    public String getLastName() { return lastName; }

    public String getUrl() { return url; }

    public String getCompany() { return company; }

    public String getText() { return text; }

}

