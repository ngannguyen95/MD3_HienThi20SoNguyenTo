import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("In ra 20 số nguyên tố đầu tiên:");

        int count = 0;
        int number = 2;

        while (count < 20) {
            boolean ckeck = true;
            for (int i = 2; i <= number/2; i++) {
                if (number % i == 0) {
                    ckeck = false;
                    break;
                }
            }

            if (ckeck) {
                System.out.println(number+ "");
                count++;
            }
            number++;
        }
    }
}