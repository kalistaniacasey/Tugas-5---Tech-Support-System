public class Responder {
    public String generateResponse(String input) {
        switch (input.toLowerCase()) {
            case "hello":
                return "Hello! How can I assist you today?";
            case "what's your name?":
                return "I'm your virtual assistant here to help!";
            case "do you like ice cream?":
                return "I don't eat, but ice cream sounds delicious!";
            case "how are you?":
                return "I'm just a program, but thanks for asking!";
            case "bye":
                return "Goodbye! Have a great day!";
            default:
                return "That's an interesting question! Can you ask me something else?";
        }
    }
}
