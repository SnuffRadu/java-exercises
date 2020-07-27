import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cups = scanner.nextInt();
        boolean weekend = scanner.nextBoolean();
        boolean successfulWeekDay = cups >= 10 && cups <= 20 && !weekend;
        boolean successfulWeekEnd = cups >= 15 && cups <= 25 && weekend;

        System.out.println(successfulWeekDay || successfulWeekEnd);
    }
}