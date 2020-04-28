package exercises;
import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {
        String test = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        int values[] = {1, 1, 2, 3, 5, 8};
        for (int i : values) {
            if (i % 2 != 0) {
            System.out.println(i);
            }
        }
    }
}
