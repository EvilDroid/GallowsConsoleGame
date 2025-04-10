import java.io.IOException;
import java.util.ArrayList;

public class GallowsGame {
    public static void main(String[] args) throws IOException {

        System.out.println("Привет! Это игра Виселица! Добро пожаловать!");

        ArrayList<String> words = DictionaryReader.readDictionary();

        GameIteration.start(words);

    }
}
