import java.util.Scanner;

public class DragonCave {

    Scanner inputReader;
    public DragonCave() {
        inputReader = new Scanner(System.in);
    }

    public String getInput(){
        //Creation of scanner object and storage variable
        //to read user input from the terminal
        String input;

        System.out.println("You are in a land full of dragons. In front of you,\n" +
                "you see two caves. In one cave, the dragon is friendly\n" +
                "and will share his treasure with you. The other dragon\n" +
                "is greedy and hungry and will eat you on sight.\n" +
                "\nWhich cave will you go into? (1 or 2)\n");

        //Read in the next line typed by the user
        input = getUserInput();

        //Input validation loop
        //will continue asking for input until user gives valid input
        while(!input.startsWith("1") && !input.startsWith("2"))
        {
            System.out.println("\nInvalid response, your choices are 1 or 2!\n");
            //Read in the next line typed by the user
            input = getUserInput();
        }

        return input;
    }

    //Prints output to console based on user input
    public void chooseCave(String input) {

        if(input.startsWith("1"))
        {
            System.out.println("\nYou approach the cave...\n" +
                    "It is dark and spooky...\n" +
                    "A large dragon jumps out in front of you! He opens his jaws and...\n" +
                    "Gobbles you down in one bite!");
        }
        else
        {
            System.out.println("You approach the cave...\n" +
                    "You hear a remix of Lady Gaga and Daft Punk...\n" +
                    "A tiny dragon jumps casually walks into view! He looks quite familiar...\n" +
                    "Jeff Bezos is now offering you a job!");
        }
    }
    //Returns user input
    private String getUserInput(){
        String userInput;
        try{
            userInput = inputReader.nextLine();
        }
        catch(Exception e){
            userInput = "invalid";
        }

        return userInput;
    }
}
