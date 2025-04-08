import java.io.IOException;
import java.util.ArrayList;

public class GallowsGame {
    public static void main(String[] args) throws IOException {
        System.out.println("..............Hello! This is Gallows game! Welcome!");
        ArrayList <String> words = DictionaryReader.readDictionary();
        String word = WordRandomSelector.selectFrom(words);

    }
}
