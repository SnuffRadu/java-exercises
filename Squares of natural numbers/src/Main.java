import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int counter = 1;
        int input = scanner.nextInt();
        int square = 0;

        while (square <= input) {
            square = counter * counter;
            counter++;
            if (square <= input) {
                System.out.println(square);
            }
        }
    }
}