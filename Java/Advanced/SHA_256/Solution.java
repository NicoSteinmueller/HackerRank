package Advanced.SHA_256;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner scan = new Scanner(System.in);
        byte[] bytesOfMessage = scan.next().getBytes(StandardCharsets.UTF_8);
        scan.close();

        MessageDigest md = MessageDigest.getInstance("SHA256");
        byte[] theMD5digest = md.digest(bytesOfMessage);
        System.out.println(bytesToHex(theMD5digest));

    }
    private static String bytesToHex(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }
}
