import java.util.Scanner;

public class FizzBuzzUpdate {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int rem3 = 3;
        int rem5 = 5;

        for (int i = num1; i <= num2; i++) {

            if (i % rem3 == 0 && i % rem5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % rem3 == 0) {
                System.out.println("Fizz");
            } else if (i % rem5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

    }
}
