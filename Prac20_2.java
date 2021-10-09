import java.util.ArrayList;
import java.util.Scanner;

public class Prac20_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[] hexList = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        ArrayList<Integer> hex16 = new ArrayList<Integer>();
        System.out.println("Input Data");
        System.out.print("Input a decimal number: ");
        int num = scan.nextInt();
        if (num<16 && num>=0){
            System.out.print(hexList[num]);
        }
        else {
            int q = num/16;
            int r = num%16;
            hex16.add(r);
            while (q > 0) {
                r = q%16;
                hex16.add(r);
                q = q/16;
            }
            for (int i=hex16.size()-1;i>=0;i--) {
                System.out.print(hexList[hex16.get(i)]);
            }
        }
    }
}
