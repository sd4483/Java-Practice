import java.util.Scanner;

public class Prac38 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input Data");
        System.out.print("Input String: ");
        String str = scan.nextLine();
        int letter, space, number, other;
        letter = space = number = other = 0;
        for (int i = 0; i<str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                letter += 1;
            }
            else if (Character.isDigit(str.charAt(i))) {
                number += 1;
            }
            else if (Character.isWhitespace(str.charAt(i))) {
                space += 1;
            }
            else {
                other += 1;
            }
        }

        System.out.println("The string is: " + str);
        System.out.println("Letter: " + letter);
        System.out.println("Number: " + number);
        System.out.println("Space: " + space);
        System.out.println("Other: " + other);

    }
}
