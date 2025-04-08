import java.util.ArrayList;

public class WordRandomSelector {
    public static String selectFrom (ArrayList<String> words){
        String selectedWord = "";
        int randomWordNumber = getRandomNumberFromOneToMax(words.size());
        selectedWord = words.get(randomWordNumber);
        //for debug info
        //System.out.printf( "Selected word is: %s\n", selectedWord);
        return selectedWord;
    }

    private static int getRandomNumberFromOneToMax (int max){
        int number = (int)(Math.random() * max + 1);
        System.out.printf( "Random number is: %d\n", number);
        return number;
    }

}
