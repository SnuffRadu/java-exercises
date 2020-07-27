import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstDigit = scanner.nextInt();
        int secondDigit = scanner.nextInt();
        int thirdDigit = scanner.nextInt();
        int fourthDigit = scanner.nextInt();

        System.out.print(--firstDigit + " ");
        System.out.print(--secondDigit + " ");
        System.out.print(--thirdDigit + " ");
        System.out.print(--fourthDigit + " ");
    }
}