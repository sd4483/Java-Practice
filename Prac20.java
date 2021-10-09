import java.util.ArrayList;
import java.util.Scanner;

public class Prac20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Object[] hexList = new Object[]{0,1,2,3,4,5,6,7,8,9,'A','B','C','D','E','F'};
        ArrayList<Integer> hex16 = new ArrayList<Integer>();
        System.out.println("Input Data");
        System.out.print("Input a decimal number: ");
        int num = scan.nextInt();
        if (num<10) {
            System.out.print(hexList[(int)num]);
        }
        else if (num>=10 && num<16) {
            System.out.print(hexList[(char)num]);
        }
        else if (num>16) {
            int q = num/16;
            int r = num%16;
            hex16.add(r);
            while (q != 0) {
                r = q%16;
                hex16.add(r);
                q = q/16;
            }
            for (int i=hex16.size()-1;i>=0;i--) {
                if (hex16.get(i)<10){
                    int k = (int)hexList[hex16.get(i)];
                    System.out.print(k);
                }
                else {
                    char a = (char)hexList[hex16.get(i)];
                    System.out.print(a);
                }
            }
        }

        /*
        for (Object obj:hexList){
            if (obj.getClass() == Integer.class){
                System.out.println((int)obj);
            }
            else {
                System.out.println((char)obj);
            }

        }
         */

    }
}
