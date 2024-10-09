import java.util.Scanner;

public class InputReader {
    private Scanner scanner;

    public InputReader() {
        scanner = new Scanner(System.in);
    }

    public String readInput() {
        System.out.print("> ");
        return scanner.nextLine();
    }
}
