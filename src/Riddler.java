import java.util.ArrayList;

/**
 * The Riddler:
 * A puzzle by Zach Blick
 * for Adventures in Algorithms
 * At Menlo School in Atherton, CA
 *
 * Completed by: Surya De Datta
 */
public class Riddler {

    public static final int LETTERS = 26;
    public static final int SHIFT_ONE = 9;
    public static final int SHIFT_FOUR = 9919;


    public String decryptOne(String encrypted) {
        String decrypted = "";
        int value;
        int shiftedValue;
        char c;
        for(int i = 0; i < encrypted.length(); i++)
        {
            c = encrypted.charAt(i);
            //Shifts values down between 0 and 26 to allow for looping before adding back to regular ascii values
            if(Character.isUpperCase(c)) {
                value = (int) c - (int)'A';
                shiftedValue = (value + SHIFT_ONE + LETTERS) % LETTERS;
                decrypted += (char) (shiftedValue + 'A');
            }
            else if(Character.isLowerCase(c))
            {
                value = (int) c - (int) 'a';
                shiftedValue = (value + SHIFT_ONE + LETTERS) % LETTERS;
                decrypted += (char) (shiftedValue + 'a');
            }
            else
            {
                decrypted += c;
            }
        }
        System.out.println(decrypted);
        return decrypted;
    }

    public String decryptTwo(String encrypted) {
        String decrypted = "";
        String[] list;
        //Gets rid of all spaces and creates a list of all the ascii value numbers in the riddle
        list = encrypted.split(" ");
        for(int i = 0; i < list.length; i++)
        {
            //Converts the string integer to a decimal value
            int letter = Integer.parseInt(list[i]);
            decrypted += (char) letter;
        }
        System.out.println(decrypted);
        return decrypted;
    }

    public String decryptThree(String encrypted) {
        String decrypted = "";
        String smallStr = "";
        //Breaks string into chunks of 8 due to byte size being 8
        for(int i = 0; i<encrypted.length(); i+=8)
        {
            int number = 0;
            smallStr = encrypted.substring(i,i+8);
            for(int j = 0; j < smallStr.length(); j++)
            {
                if(smallStr.charAt(j) == '1')
                {
                    // It uses a left shift to place the bit in the correct position and a
                    // bitwise OR to accumulate it without affecting other bits.
                    number |= (1 << (7 - j));
                }
            }
            decrypted += (char)(number);

        }
        System.out.println(decrypted);
        return decrypted;
    }

    public String decryptFour(String encrypted) {
        String decrypted = "";
        for(int i = 0; i < encrypted.length(); i++)
        {
            String point = Integer.toHexString(encrypted.codePointAt(i));
            //Converts hex number to decimal number
            int dec = Integer.parseInt(point, 16);
            int shifted = dec - SHIFT_FOUR;
            decrypted += (char)(shifted);
        }
        System.out.println(decrypted);
        return decrypted;
    }
}
