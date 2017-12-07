import java.util.Scanner;

public class Zad07 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] names = new String[5];

        System.out.println("Podaj 5 imion:");

        for (int i = 0; i <= 4; i++) {
            names[i] = scan.nextLine();
        }

        System.out.println();

        for (int i = 4; i >= 0; i--) {
            System.out.println("Cześć " + names[i]);
        }
        scan.close();
    }
}
