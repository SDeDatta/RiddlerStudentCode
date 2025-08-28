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

    public String decryptOne(String encrypted) {
        String decrypted = "";
        int value = 0;
        int shiftedValue = 0;
        char c;
        char newChar;
        for(int i = 0; i < encrypted.length(); i++)
        {
            c = encrypted.charAt(i);
            if(Character.isUpperCase(c)) {
                value = (int) c - (int)'A';
                shiftedValue = (value + 9 + 26) % 26;
                decrypted += (char) (shiftedValue + 'A');
            }
            else if(Character.isLowerCase(c))
            {
                value = (int) c - (int) 'a';
                shiftedValue = (value + 9 + 26) % 26;
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
        String[] list = new String[191];
        list = encrypted.split(" ");
        for(int i = 0; i < list.length; i++)
        {
            int letter = Integer.parseInt(list[i]);
            decrypted += (char) letter;
        }
        // TODO: Complete the decryptTwo() function.
        System.out.println(decrypted);
        return decrypted;
    }

    public String decryptThree(String encrypted) {
        String decrypted = "";
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i<encrypted.length(); i+=8)
        {
            list.add(encrypted.substring(i,i+8));
        }
        int number = 0;
        for(int j = 0; j < list.size(); j++)
        {
            number = Integer.parseInt(list.get(j), 2);
            decrypted += (char) number;
        }
        System.out.println(decrypted);
        return decrypted;
    }

    public String decryptFour(String encrypted) {
        String decrypted = "";

        // TODO: Complete the decryptFour() function.

        return decrypted;
    }
}
