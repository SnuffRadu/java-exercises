import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input1 = scanner.nextInt();
        int input2 = scanner.nextInt();
        int input3 = scanner.nextInt();
        boolean condition1 = input1 <= input2 && input1 >= input3;
        boolean condition2 = input1 >= input2 && input1 <= input3;

        System.out.println(condition1 || condition2);
    }
}