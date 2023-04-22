
package edu.guilford;
/**
*
* @author bousabacw
*/
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class AES {

    private static SecretKeySpec secretKey;
    private static byte[] key;

    public static void setKey(String myKey) {
        MessageDigest sha = null;
        try {
            key = myKey.getBytes("UTF-8"); //converts the myKey string into a byte array
            sha = MessageDigest.getInstance("SHA-1"); //creates an object that will encrypt the key object with SHA-1
            key = sha.digest(key); //encrypts the key object
            key = Arrays.copyOf(key, 16); //copies the key object into a new array of length 16
            secretKey = new SecretKeySpec(key, "AES"); //creates a new secret key object with the key object and the AES algorithm
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    public static String encrypt(String strToEncrypt, String secret) {
        try {
            setKey(secret); // generates a secretkey object using a secret string that is set by me to act as the "seed" for generating the secret key object
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            return Base64.getEncoder().encodeToString(cipher.doFinal(strToEncrypt.getBytes("UTF-8")));
        } catch (Exception e) {
            System.out.println("Error while encrypting: " + e.toString());
        }
        return null;
        //encrypts the password
    }

    public static String decrypt(String strToDecrypt, String secret) {
        try {
            setKey(secret); // uses the same secret string since a different secret string will generate a different secret key object and the password 
                            // will not be able to be decrypted correctly
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5PADDING");
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            return new
String(cipher.doFinal(Base64.getDecoder().decode(strToDecrypt)));
        } catch (Exception e) {
            System.out.println("Error while decrypting: " + e.toString());
        }
        return null;
    }
    //undos the encryption of the password
}
