package edu.guilford;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //build a new user object to run user.java
        user user1 = new user(null, null, null, null);
        user user2 = new user(null, null, null, null);
        //Declare a scanner to read from keyboard
        Scanner keyboard = new Scanner(System.in);

        //ask the user for their first name
        System.out.println("What is your first name?");
        //set the user's first name to the input from the keyboard
        user1.setFirstName(keyboard.nextLine());
        //ask the user for their last name
        System.out.println("What is your last name?");
        //set the user's last name to the input from the keyboard
        user1.setLastName(keyboard.nextLine());
        //ask the user for their email
        System.out.println("What is your email?");
        //set the user's email to the input from the keyboard
        user1.setEmail(keyboard.nextLine());

        //create the password for the user
        //ask the user for their favorite color
        System.out.println("What is your favorite color?");
        //set the user's favorite color to the input from the keyboard
        user1.setFavoriteColor(keyboard.nextLine());
        //ask the user for their favorite animal
        System.out.println("What is your favorite animal?");
        //set the user's favorite animal to the input from the keyboard
        user1.setFavoriteAnimal(keyboard.nextLine());
        //ask the user for their favorite number
        System.out.println("What is your favorite number?");
        //set the user's favorite number to the input from the keyboard
        user1.setFavoriteNumber(keyboard.nextLine());
        //ask the user for their favorite object
        System.out.println("What is your favorite object?");
        //set the user's favorite object to the input from the keyboard
        user1.setFavoriteObject(keyboard.nextLine());
        //ask the user for their favorite special character
        System.out.println("What is your favorite special character?");
        //set the user's favorite special character to the input from the keyboard 
        user1.setFavoriteSpecialCharacter(keyboard.nextLine());

        //generate a password for the user and set it to a user1password variable
        String user1password = user1.generatePassword();
        //set the user's password to the user1password variable
        user1.setPassword(user1password);
        //print the user's password
        System.out.println("Your password is: " + user1.getPassword());

        //create a secret string object
        String secret = "disproportionation";
        
        //encrypt the password and set it to a user1encryptedPassword variable
        String user1encryptedPassword = AES.encrypt(user1password, secret);
        //print user1's encrypted password
        System.out.println("Your encrypted password is: " + user1encryptedPassword);
        //decrypt the password and set it to a user1decryptedPassword variable
        String user1decryptedPassword = AES.decrypt(user1encryptedPassword, secret);
        //print user1's decrypted password
        System.out.println("Your decrypted password is: " + user1decryptedPassword);

        //repeat the process for user2
        System.out.println("What is your first name?");
        user2.setFirstName(keyboard.nextLine());
        System.out.println("What is your last name?");
        user2.setLastName(keyboard.nextLine());
        System.out.println("What is your email?");
        user2.setEmail(keyboard.nextLine());

        System.out.println("What is your favorite color?");
        user2.setFavoriteColor(keyboard.nextLine());
        System.out.println("What is your favorite animal?");
        user2.setFavoriteAnimal(keyboard.nextLine());
        System.out.println("What is your favorite number?");
        user2.setFavoriteNumber(keyboard.nextLine());
        System.out.println("What is your favorite object?");
        user2.setFavoriteObject(keyboard.nextLine());
        System.out.println("What is your favorite special character?");
        user2.setFavoriteSpecialCharacter(keyboard.nextLine());

        String user2password = user2.generatePassword();
        user2.setPassword(user2password);
        System.out.println("Your password is: " + user2.getPassword());

        String user2encryptedPassword = AES.encrypt(user2password, secret);
        System.out.println("Your encrypted password is: " + user2encryptedPassword);
        String user2decryptedPassword = AES.decrypt(user2encryptedPassword, secret);
        System.out.println("Your decrypted password is: " + user2decryptedPassword);


        


    }
}
