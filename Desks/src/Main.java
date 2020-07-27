import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfStudentsInGroup1 = scanner.nextInt();
        int numberOfStudentsInGroup2 = scanner.nextInt();
        int numberOfStudentsInGroup3 = scanner.nextInt();

        int desksForGroup1 = numberOfStudentsInGroup1 / 2 + numberOfStudentsInGroup1 % 2;
        int desksForGroup2 = numberOfStudentsInGroup2 / 2 + numberOfStudentsInGroup2 % 2;
        int desksForGroup3 = numberOfStudentsInGroup3 / 2 + numberOfStudentsInGroup3 % 2;
        int totalNumberOfDesks = desksForGroup1 + desksForGroup2 + desksForGroup3;

        System.out.println(totalNumberOfDesks);
    }
}