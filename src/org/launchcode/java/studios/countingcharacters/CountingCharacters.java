package org.launchcode.java.studios.countingcharacters;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;


public class CountingCharacters {
    public static void main(String[] args) {
        String countString = "If the product of two terms is zero then common sense says at least one of the two terms has " +
                "to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form " +
                "that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        HashMap<Character, Integer> characterCount = new HashMap<>();
        char[] charactersInString = countString.toCharArray();
        for (char character : charactersInString) {
            if (characterCount.containsKey(character)) {
                characterCount.put(character, characterCount.get(character) + 1);
            }
                else {
                    characterCount.put(character, 1);
            }
        }
        for (Map.Entry<Character, Integer> pair : characterCount.entrySet()) {
            System.out.println(pair.getKey() + ": " + pair.getValue());
        };
    }
}
