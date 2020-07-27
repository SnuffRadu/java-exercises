import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();
        String stringInput = Integer.toString(input);

        StringBuilder reversedString = new StringBuilder();
        reversedString.append(stringInput);
        reversedString = reversedString.reverse();
        int reversedInput = Integer.parseInt(String.valueOf(reversedString));

        if (input == reversedInput) {
            System.out.println(1);
        } else {
            System.out.println(37);
        }
    }
}