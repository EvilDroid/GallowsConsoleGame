import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DictionaryReader {
    private static String dir = "src/main/resources/";
    private static String dictionaryFileName = "words.txt";

    public static ArrayList<String> readDictionary () throws IOException {

        System.out.println("..............Starting to read Dictionary");
        ArrayList<String> words = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new FileReader(dir + dictionaryFileName));
        String line;
        while ((line = reader.readLine()) != null) {
            words.add(line);
        }
        reader.close();
        System.out.printf("..............The count of words is: %s\n", words.size());
        System.out.println("..............Dictionary have read");
        return words;
    }
}
