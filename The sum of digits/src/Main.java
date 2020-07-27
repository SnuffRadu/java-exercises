import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        int lastDigit = input % 10;
        int middleDigit = ((input % 100) - lastDigit) / 10;
        int firstDigit = (input - input % 100) / 100;
        int sum = firstDigit + middleDigit + lastDigit;

        System.out.println(sum);
    }
}