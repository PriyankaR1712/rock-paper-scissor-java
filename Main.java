import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choice = {"rock" , "paper" , "scissor"};
        String computer;
        String user;
        System.out.println("Enter your choice: ");
        user = scanner.nextLine().toLowerCase();

        computer = choice[random.nextInt(3)];
        System.out.println("computer chose: " + computer);

        if(user.equals (computer)) {
            System.out.println("tie");
        } else if (
                (user.equals("rock") && computer.equals("scissor")) ||
                (user.equals("paper") && computer.equals("rock")) ||
                (user.equals("scissor") && computer.equals("paper")))
        {
            System.out.println("You win!!!!!!");
        }
        else {
            System.out.println("You lost");
        }
        scanner.close();

    }
}
