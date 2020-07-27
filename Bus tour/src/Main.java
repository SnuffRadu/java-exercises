import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int busHeight = scanner.nextInt();
        int numberOfBridges = scanner.nextInt();
        int bridgeNumber = 1;

        while (bridgeNumber < numberOfBridges) {
            int bridgeHeight = scanner.nextInt();
            if (busHeight >= bridgeHeight) {
                System.out.println("Will crash on bridge " + bridgeNumber);
                break;
            }
            bridgeNumber++;
        }
        if (bridgeNumber == numberOfBridges) {
            System.out.println("Will not crash");
        }
    }
}