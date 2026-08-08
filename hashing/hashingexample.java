package hashing;

import java.util.Scanner;

public class hashingexample {

    // hashing process
    public static String generateHash(String input) {
        int hash = 7;
        for (int i = 0; i < input.length(); i++) {

            hash = hash * 31 + input.charAt(i);
            // actual hash value is 7 --> 7 *31 + password first value
            // your password is abc a= 97, b = 98, c = 99
            // 7 * 31 + 97 ==> 314
            // 7 * 31 + 98 ==> 315
            // 7 * 31 + 99 ==> 316
            // now password become 314315316
        }

        return Integer.toHexString(Math.abs(hash));
        // abs --> change - ve ko +ve me shift karta ha
    }

    // salt
    public static String generateSalt(int index) {
        // this line is prefrom the salt function..
        return "SALT" + (index * 13 + 7); // SALT314315316
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // call the array of pass and hash values
        String[] password = new String[3];
        String[] hashes = new String[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the Password " + (i + 1) + ": ");
            password[i] = input.nextLine();

            String salt = generateSalt(i);
            String saltedPassword = salt + password;

            hashes[i] = generateHash(saltedPassword);
        }

        System.out.println("\n Hashing Password: \n");
        for (int i = 0; i < 3; i++) {
            System.out.println("Password " + (i + 1) + " Hash: " + hashes[i]);
        }

        input.close();
    }
}
