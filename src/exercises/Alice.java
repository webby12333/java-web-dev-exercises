package exercises;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {

        String aliceString = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";

        Scanner input = new Scanner(System.in);
        System.out.println("What term would you like to search for? ");
        String userInput = input.next();
        String searchTerm = userInput.toLowerCase();
        input.close();

        boolean answer = aliceString.toLowerCase().contains(searchTerm);
        if (answer = true) {
            System.out.println(answer);
            System.out.println("Index is " + aliceString.toLowerCase().indexOf(searchTerm) + " and length is " + searchTerm.length());
            String newAliceString = aliceString.toLowerCase().replaceFirst(searchTerm, "");
            System.out.println(newAliceString);

        } else {
            System.out.println(answer);
        }

    }
}
