import java.util.Scanner;

public class NotenUebersetzen {
    public static void main(String[] args) {
        System.out.println("Gib deine Note ein:");
        int markNumber;
        Scanner scanner = new Scanner(System.in);
        do {
            markNumber = scanner.nextInt();
            if (markNumber < 1 || markNumber > 5)
                System.out.println("Das ist keine Schulnote");
        }while(markNumber < 1 || markNumber > 5);
        if(markNumber == 1){
            System.out.println("Sehr gut");
        }
        else if(markNumber == 2){
            System.out.println("Gut");
        }
        else if(markNumber == 3){
            System.out.println("Befriedigend");
        }
        else if(markNumber == 4){
            System.out.println("Genügend");
        }
        else{
            System.out.println("Nicht Genügend");
        }

    }
}
