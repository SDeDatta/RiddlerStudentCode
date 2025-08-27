/**
 * The Riddler:
 * A puzzle by Zach Blick
 * for Adventures in Algorithms
 * At Menlo School in Atherton, CA
 *
 * Completed by: Surya De Datta
 */
public class Riddler {

    public String decryptOne(String encrypted) {
        String decrypted = "";
        int value;
        int shiftedValue;
        char c;
        char newChar;
        for(int i = 0; i < encrypted.length(); i++)
        {
            c = encrypted.charAt(i);
            value = (int) c;
            shiftedValue = value + 9;
            newChar = (char) shiftedValue;
            decrypted += newChar;
        }
        System.out.println(decrypted);
        return decrypted;
    }

    public String decryptTwo(String encrypted) {
        String decrypted = "";

        // TODO: Complete the decryptTwo() function.

        return decrypted;
    }

    public String decryptThree(String encrypted) {
        String decrypted = "";

        // TODO: Complete the decryptThree() function.

        return decrypted;
    }

    public String decryptFour(String encrypted) {
        String decrypted = "";

        // TODO: Complete the decryptFour() function.

        return decrypted;
    }
}
