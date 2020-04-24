package exercises;
import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {
        int values[] = {1, 1, 2, 3, 5, 8};
        for (int i : values) {
            if (i % 2 != 0) {
            System.out.println(i);
            }
        }
    }
}
