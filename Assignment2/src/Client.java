package Practice_5.Assignment2.src;

import java.util.Base64;
import java.util.Scanner;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String message = sc.nextLine();
        try {
            SecretKey key = generateKey();

           

            String encryptedMessage = encrypt(message, key);

            Document normalDoc = new NormalDoc()
                    .setExtension(".txt")
                    .setEncryption(encryptedMessage)
                    .buildDoc();

            Document confidentialDoc = new ConfidentialDoc()
                    .setExtension(".zip")
                    .setEncryption(encryptedMessage)
                    .buildDoc();

            String decryptedMessage = decrypt(normalDoc.getEncryption(), key);

            System.out.println("Normal file decrypt txt : " + decryptedMessage);

            String decryptedMessage2 = decrypt(confidentialDoc.getEncryption(), key);

            System.out.println("Confidential file decrypt txt : " + decryptedMessage2);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static SecretKey generateKey() throws Exception {
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        keyGen.init(256);
        return keyGen.generateKey();
    }

    public static String encrypt(String plainText, SecretKey key) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] encryptedBytes = cipher.doFinal(plainText.getBytes());
        return Base64.getEncoder().encodeToString(encryptedBytes);
    }

    public static String decrypt(String encryptedText, SecretKey key) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, key);
        byte[] decryptedBytes = cipher.doFinal(Base64.getDecoder().decode(encryptedText));
        return new String(decryptedBytes);
    }
}