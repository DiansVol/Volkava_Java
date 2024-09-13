import java.util.Scanner;

public class Calculator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите первое целое число (a): ");
            int a = scanner.nextInt();
            System.out.print("Введите второе целое число (b): ");
            int b = scanner.nextInt();

            if (a > b) {
                System.out.println("a > b");
            } else if (a < b) {
                System.out.println("a < b");
            } else {
                System.out.println("a = b");
            }

            int sum = a + b;
            int difference = a - b;
            int product = a * b;
            double division;

            if (b != 0) {
                division = (double) a / b;
                System.out.println("a / b = " + division);
            } else {
                System.out.println("Деление на ноль невозможно.");
            }

            System.out.println("Сумма (a + b) = " + sum);
            System.out.println("Разность (a - b) = " + difference);
            System.out.println("Произведение (a * b) = " + product);

            scanner.close();
        }
    }
