package Practice_5.Assignment2.src;

import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Client {
    public static void main(String[] args) {
        String filePath = "output.txt";
        try {
            SecretKey key = generateKey();

            String message = "A bottle of water";
            String encryptedMessage = encrypt(message, key);
            try (FileWriter writer = new FileWriter(filePath)) {
                writer.write(encryptedMessage);
                System.out.println("File .txt đã được lưu thành công!");
            } catch (IOException e) {
                System.err.println("Lỗi khi lưu file: " + e.getMessage());
            }
            BufferedReader reader = new BufferedReader(new FileReader("./output.txt"));
            String line = reader.readLine();
            String decryptedMessage = decrypt(line, key);
            System.out.println(decryptedMessage);

            
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