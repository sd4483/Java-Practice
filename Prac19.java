import java.util.ArrayList;
import java.util.Scanner;

public class Prac19 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input Data");
        System.out.print("Input a decimal number: ");
        int num = scan.nextInt();
        ArrayList<Integer> BinList = new ArrayList<Integer>();
        int i = num/2;
        int j = num%2;
        BinList.add(j);
        while (i != 0) {
            j = i%2;
            BinList.add(j);
            i = i/2;
        }
        System.out.print("Binary number is ");
        for (int n = BinList.size()-1; n>=0; n--){
            System.out.print(BinList.get(n));
        }
    }
}
