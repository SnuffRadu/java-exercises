import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringInput = scanner.next();
        int startOfRange = scanner.nextInt();
        int endOfRange = scanner.nextInt() + 1;

        String output = stringInput.substring(startOfRange, endOfRange);
        System.out.println(output);
    }
}