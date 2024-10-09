public class SupportSystem {
    private InputReader inputReader;
    private Responder responder;

    public SupportSystem() {
        inputReader = new InputReader();
        responder = new Responder();
    }

    public void start() {
        System.out.println("Welcome to the DodgySoft Technical Support System.");
        System.out.println("Please tell us about your problem.");
        System.out.println("We will assist you with any problem you might have!");

        while (true) {
            String userInput = inputReader.readInput();
            if (userInput.equalsIgnoreCase("exit")) {
                System.out.println("Thank you for using the system. Goodbye!");
                break;
            }
            String response = responder.generateResponse(userInput);
            System.out.println(response);
        }
    }

    public static void main(String[] args) {
        SupportSystem supportSystem = new SupportSystem();
        supportSystem.start();
    }
}
