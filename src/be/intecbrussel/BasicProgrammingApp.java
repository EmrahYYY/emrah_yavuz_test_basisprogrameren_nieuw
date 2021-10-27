import java.util.Scanner;

public class BasicProgrammingApp {
    public static void main(String[] args) {


        Scanner myNumbers = new Scanner(System.in);
        System.out.println("give 4 numbers");
        int a = myNumbers.nextInt();
        int b = myNumbers.nextInt();
        int c = myNumbers.nextInt();
        int d = myNumbers.nextInt();


        if (a > b && a > c && a > d) {
            System.out.println("the largest number:" + a);
        } else if (b > a && b > c && b > d) {
            System.out.println("the largest number:" + b);
        } else if (c > a && c > b && c > d) {
            System.out.println("the largest number:" + c);
        } else if (d > a && d > b && d > c) {
            System.out.println("the largest number:" + d);
        } else {
            System.out.println("the greatest numbers are equal");
        }


        if (a < b && a < c && a < d) {
            System.out.println("the smallest number:" + a);

        } else if (b < a && b < c && b < d) {
            System.out.println("the smallest number:" + b);
        } else if (c < a && c < b && c < d) {
            System.out.println("the smallest number:" + c);
        } else if (d < a && d < b && d < c) {
            System.out.println("the smallest number:" + d);
        } else {
            System.out.println("the smallest numbers are equal");
        }


        System.out.println("from smallest number to the average of the 4 numbers:");

        for (int x = a; x <= (a + b + c + d) / 4; x++)
            if (x > a && a < b && a < c && a < d) {
                System.out.println(x);
            }

        for (int x = b; x <= (a + b + c + d) / 4; x++)
            if (x > b && b < a && b < c && b < d) {
                System.out.println(x);
            }

        for (int x = c; x <= (a + b + c + d) / 4; x++)
            if (x > c && c < a && c < b && c < d) {
                System.out.println(x);
            }

        for (int x = d; x <= (a + b + c + d) / 4; x++)
            if (x > d && d < a && d < b && d < c) {
                System.out.println(x);
            }


            System.out.println("when you come across one of the 4 numbers:");

        for (int k = 1; k < 2000; k++) {
            System.out.println(k-1);

            if (k == a || k == b || k == c || k == d) {
                break;
            }


        }
    }
}
