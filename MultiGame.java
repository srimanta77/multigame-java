import java.util.Random;
import java.util.Scanner;

public class MultiGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            System.out.println("\n================ GAME MENU ================");
            System.out.println("\n1. Number Guessing Game");
            System.out.println("\n2. Rock Paper Scissors");
            System.out.println("\n3. Quiz Game");
            System.out.println("\n4. Exit");
            System.out.print("\nChoose an option: ");

            int choice = scanner.nextInt();

            if (choice == 1) {

                int number = random.nextInt(100) + 1;
                int guess = 0;

                System.out.println("Guess a number (1-100)");

                while (guess != number) {
                    System.out.print("Enter Guess: ");
                    guess = scanner.nextInt();

                    if (guess < number)
                        System.out.println("Tooooo low!");
                    else if (guess > number)
                        System.out.println("Too High!");
                    else
                        System.out.println("Correct brooooo!");
                }    
            } 
            else if (choice == 2) {

                String[] options = {"Rock", "Paper", "Scissors"};

                System.out.print("Enter Rock, Paper, or Scissors: ");
                String user = scanner.next();

                int comIndex = random.nextInt(3);
                String computer = options[comIndex];

                System.out.println("Computer choose: " + computer);

                if (user.equalsIgnoreCase(computer)) {
                    System.out.println("Draw!");
                } else if (
                    (user.equalsIgnoreCase("Rock") && computer.equals("Scissors")) || 
                    (user.equalsIgnoreCase("Paper") && computer.equals("Rock")) || 
                    (user.equalsIgnoreCase("Scissors") && computer.equals("Paper"))
                ) {
                    System.out.println("Bro You Win!");
                } else {
                    System.out.println("You lose! But Don't worry.....! Life is still on the way, Just need focus. All The Best, You can do it..!");
                }
            } 
            else if (choice == 3) {

                System.out.println("Question: Which language is used for Android development?");
                System.out.println("1. Java     2. Python     3. C++    4. Swift");
                System.out.print("Your answer: ");

                int ans = scanner.nextInt();

                if (ans == 1)
                    System.out.println("Correct!");
                else
                    System.out.println("Wrong! Isme koi maafi nahi milega, padlo..!");
            } 
            else if (choice == 4) {
                    System.out.println("\nThanks for Playing Dude!");
                    break;

                } else {
                    System.out.println("\nInvalid option! Trying again.");
                }
        }

        scanner.close();
    }
}