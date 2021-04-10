//Class Description: it intends to generate the all the anagrams of a given String
package anagramgenerator;

import java.util.HashSet;
import java.util.Set;

public class Anagram {

    static Set<String> outputSet = new HashSet<>();

    // Method to generate anagram of a given string 'str'
    static void getAllAnagrams(String str, String answer) {

        //Basic case - empty string
        if (str.length() == 0) {

            // To avoid two equal anagrams, add to 'outputSet'
            outputSet.add(answer);
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            // ith character of str
            char ch = str.charAt(i);

            // Rest of the string after excluding the ith character (ch)
            String restOfString = str.substring(0, i)
                    + str.substring(i + 1);

            // Recurvise call
            getAllAnagrams(restOfString, answer + ch);
        }
    }
}
