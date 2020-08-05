import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long firstNumber = scanner.nextLong();
        String operation = scanner.next();
        long secondNumber = scanner.nextLong();

        switch (operation) {
            case "+":
                long sum = firstNumber + secondNumber;
                System.out.println(sum);
                break;
            case "-":
                long subtraction = firstNumber - secondNumber;
                System.out.println(subtraction);
                break;
            case "/":
                if (secondNumber == 0) {
                    System.out.println("Division by 0!");
                } else {
                    long division = firstNumber / secondNumber;
                    System.out.println(division);
                }
                break;
            case "*":
                long multiplication = firstNumber * secondNumber;
                System.out.println(multiplication);
                break;
            default:
                System.out.println("Unknown operator");
                break;
        }
    }
}