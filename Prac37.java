import java.util.Scanner;

public class Prac37 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input Data");
        System.out.print("Input the string: ");
        String str = scan.nextLine();
        int lastchar = str.length()-1;

        while (lastchar>=0) {
            System.out.print(str.charAt(lastchar));
            lastchar--;
        }

    }
}
