import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Creation of scanner object and storage variable
        //to read user input from the terminal
        Scanner inputReader = new Scanner(System.in);
        String input;

        System.out.println("You are in a land full of dragons. In front of you,");
        System.out.println("You see two caves. In one cave, the dragon is friendly");
        System.out.println("and will share his treasure with you. The other dragon");
        System.out.println("is greedy and hungry and will eat you on sight.");
        System.out.println("Which cave will you go into? (1 or 2)");

        //Read in the next line typed by the user
        input = inputReader.nextLine();

        //Input validation loop
        //will continue asking for input until user gives valid input
        while(!input.startsWith("1") && !input.startsWith("2"))
        {
            System.out.println("Invalid response, your choices are 1 or 2!");
            //Read in the next line typed by the user
            input = inputReader.nextLine();
        }

        if(input.startsWith("1"))
        {
            System.out.println("You approach the cave...");
            System.out.println("It is dark and spooky...");
            System.out.println("A large dragon jumps out in front of you! He opens his jaws and...");
            System.out.println("Gobbles you down in one bite!");
        }
        else
        {
            System.out.println("You approach the cave...");
            System.out.println("You hear a remix of Lady Gaga and Daft Punk...");
            System.out.println("A tiny dragon jumps casually walks into view! He looks quite familiar...");
            System.out.println("Jeff Bezos is now offering you a job!");
        }
    }
}
