import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class StartMenu {
    public static void start() throws IOException {
        ArrayList<String> words = DictionaryReader.readDictionary();
        Scanner inputFlow = new Scanner(System.in);
        String input = "";
        do {
            System.out.println("Начать новую игру?");
            System.out.println("Y/N(quit)");
            input = inputFlow.next().toLowerCase();

            if(input.equals("y")){
                GameIteration.start(words);
            }
            if(input.equals("n")){
                System.out.println("До свидания!");
                System.exit(0);
            }
        }
        while (true);
    }
}
