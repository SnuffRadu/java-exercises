import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int firstInputDigit = number / 100;
        int thirdInputDigit = number % 10;
        int secondInputDigit = (number - firstInputDigit * 100 - thirdInputDigit) / 10;
        int reversedNumber = thirdInputDigit * 100 + secondInputDigit * 10 + firstInputDigit;

        System.out.println(reversedNumber);
    }
}