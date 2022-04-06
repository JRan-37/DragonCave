public class Main {

    public static void main(String[] args) {
        DragonCave dc = new DragonCave();
        String userInput = dc.getInput();
        dc.chooseCave(userInput);
    }
}
