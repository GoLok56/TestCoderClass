import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        String message = Short.parseShort(numbers[0]) % Short.parseShort(numbers[1]) == 0 ? "Hore ^_^" : "Kecewa :(";
        System.out.println(message);
    }
}
