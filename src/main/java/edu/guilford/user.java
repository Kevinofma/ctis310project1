package edu.guilford;

public class user {

    //attributes that identify a user, include first name, last name, email, and password
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    //attributes for questions that a user would answer like their favorite color, favorite food, etc.
    private String favoriteColor;
    private String favoriteAnimal;
    private String favoriteNumber;
    private String favoriteObject;
    private String favoriteSpecialCharacter;

    //constructor for user
    public user(String firstName, String lastName, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    //getter and setter methods for user attributes
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //getter and setter methods for user questions
    public String getFavoriteColor() {
        return favoriteColor;
    }

    public void setFavoriteColor(String favoriteColor) {
        this.favoriteColor = favoriteColor;
    }

    public String getFavoriteAnimal() {
        return favoriteAnimal;
    }

    public void setFavoriteAnimal(String favoriteAnimal) {
        this.favoriteAnimal = favoriteAnimal;
    }

    public String getFavoriteNumber() {
        return favoriteNumber;
    }

    public void setFavoriteNumber(String favoriteNumber) {
        this.favoriteNumber = favoriteNumber;
    }

    public String getFavoriteObject() {
        return favoriteObject;
    }

    public void setFavoriteObject(String favoriteObject) {
        this.favoriteObject = favoriteObject;
    }

    public String getFavoriteSpecialCharacter() {
        return favoriteSpecialCharacter;
    }

    public void setFavoriteSpecialCharacter(String favoriteSpecialCharacter) {
        this.favoriteSpecialCharacter = favoriteSpecialCharacter;
    }

    //create an algorithm to create a password based on the user's answers to the questions using the first and last characters of each answer
    public String generatePassword() {
        String password = "";
        password += getFavoriteColor().charAt(0);
        password += getFavoriteAnimal().charAt(0);
        password += getFavoriteNumber().charAt(0);
        password += getFavoriteObject().charAt(0);
        password += getFavoriteSpecialCharacter().charAt(0);
        password += getFavoriteColor().charAt(getFavoriteColor().length() - 1);
        password += getFavoriteAnimal().charAt(getFavoriteAnimal().length() - 1);
        password += getFavoriteNumber().charAt(getFavoriteNumber().length() - 1);
        password += getFavoriteObject().charAt(getFavoriteObject().length() - 1);
        password += getFavoriteSpecialCharacter().charAt(getFavoriteSpecialCharacter().length() - 1);
        return password;
    }
    






}
