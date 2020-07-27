import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startOfRange = scanner.nextInt();
        int endOfRange = scanner.nextInt();
        double sumOfNumbersDivisibleBy3 = 0;
        int countOfNumbersDivisibleBy3 = 0;

        for (int i = startOfRange; i <= endOfRange; i++) {
            if (i % 3 == 0) {
                sumOfNumbersDivisibleBy3 += i;
                countOfNumbersDivisibleBy3++;
            }
        }
        double arithmeticAverage = sumOfNumbersDivisibleBy3 / countOfNumbersDivisibleBy3;
        System.out.println(arithmeticAverage);
    }
}