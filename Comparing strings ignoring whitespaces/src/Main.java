import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stringInput1 = scanner.nextLine();
        String stringInput2 = scanner.nextLine();

        String cleanStringInput1 = stringInput1.replace(" ", "");
        String cleanStringInput2 = stringInput2.replace(" ", "");

        System.out.println(cleanStringInput1.equals(cleanStringInput2));
    }
}