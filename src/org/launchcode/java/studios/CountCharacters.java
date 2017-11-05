package org.launchcode.java.studios;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class CountCharacters {
    public static void main (String[] args) {
        System.out.print("Enter a string: ");
        Scanner scanner = new Scanner(System.in);
        String myString = scanner.nextLine();

        HashMap<Character, Integer> countChars = new HashMap<>();

        for (char c : myString.toLowerCase().toCharArray() ) {

            //Character ch = new Character(c);

            if (countChars.containsKey(c)) {
                Integer count = countChars.get(c);
                countChars.replace(c, count+1);
            }
            else {
                countChars.put(c, 1);
            }
        }

        for (Map.Entry<Character, Integer> countChar: countChars.entrySet()) {
            System.out.println(countChar.getKey() + ": " + countChar.getValue());
        }
    }
}
