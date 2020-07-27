import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxElement = 0;

        while (scanner.hasNextInt()) {
            int nextValue = scanner.nextInt();
            if (nextValue % 4 == 0 && nextValue > maxElement) {
                maxElement = nextValue;
            }
        }
        System.out.println(maxElement);
    }
}