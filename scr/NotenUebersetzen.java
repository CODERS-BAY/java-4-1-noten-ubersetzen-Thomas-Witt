import java.util.Scanner;

public class NotenUebersetzen {
    public static void main(String[] args) {
        System.out.println("What mark do you want to translate?");
        Scanner scanner = new Scanner(System.in);
        int mark = scanner.nextInt();

        switch (mark) {
            case (1) -> System.out.println("Very good");
            case (2) -> System.out.println("Good");
            case (3) -> System.out.println("Satisfactory");
            case (4) -> System.out.println("Sufficient");
            case (5) -> System.out.println("Not sufficient");
            default -> System.out.println("This is not a valid mark!");
        }
    }
}
