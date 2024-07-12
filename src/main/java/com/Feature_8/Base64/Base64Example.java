package com.Feature_8.Base64;
import java.util.Base64;

public class Base64Example {
    public static void main(String[] args) {
        String originalInput = "test input";
        String encodedString = Base64.getEncoder().encodeToString(originalInput.getBytes());

        System.out.println("Encoded String: " + encodedString);

        byte[] decodedBytes = Base64.getDecoder().decode(encodedString); // return in bytes
        String decodedString = new String(decodedBytes);

        System.out.println("Decoded String: " + decodedString);
    }
}

