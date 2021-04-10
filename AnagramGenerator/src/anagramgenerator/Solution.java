//Class Description: it's the main method which aims to print all the anagrams in a alphabetically way
package anagramgenerator;

import static anagramgenerator.Anagram.outputSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String letters = sc.next();
        sc.close();
        printAnagrams(letters);
    }

    private static void printAnagrams(String letters) {
        // Generate anagrams
        Anagram.getAllAnagrams(letters, "");

        //Sort the output alphabetically
        List<String> sortedOutputSet = new ArrayList<String>(outputSet);
        Collections.sort(sortedOutputSet);

        // Print the generated permutations
        for (int i = 0; i < sortedOutputSet.size() - 1; i++) {
            System.out.print(sortedOutputSet.get(i) + "; ");
        }
        System.out.println(sortedOutputSet.get(sortedOutputSet.size() - 1));
    }
}
