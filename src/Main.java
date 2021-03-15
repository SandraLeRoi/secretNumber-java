import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //le programme choisit un nombre secret aléatoire entre 0 et 100
        int secretNumber = (int) (Math.random() * 101);
        Scanner scann = new Scanner(System.in);

        //demande à l'utilisateur de trouver le nombre secret
        int roundNumber = 0;
        int input;
        do {
            roundNumber += 1;
            System.out.print("> ");
            input = scann.nextInt();
            if (input > secretNumber) {
                System.out.println("Less !");
            } else if (input < secretNumber) {
                System.out.println("More !");
            } else {
                System.out.println("You win in " + roundNumber + " round.");
            }
        } while ( input != secretNumber);
    }
}
