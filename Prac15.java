public class Prac15 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        /*
        //Using another variale
        int c = a;
        a = b;
        b = c;
         */

        //Without using another variable
        a = a*b;
        b = a/b;
        a = a/b;
        System.out.println(a);
        System.out.println(b);
    }
}
