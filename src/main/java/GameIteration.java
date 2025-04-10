import java.util.ArrayList;
import java.util.Arrays;

public class GameIteration {
    private static String word;
    private static int currentStep = 0;
    private static String mask;
    private static ArrayList<Character> errors = new ArrayList<Character>();

    public static void start (ArrayList <String> words){

    word = WordRandomSelector.selectFrom(words);
    mask = word.replaceAll(".", "_");

    do {
        System.out.println("Введите букву, которая есть в загаданном слове.");

        String letter = LetterInputByUser.getInput();
        //step of checking result
        if (word.contains(letter)) {
            System.out.println("Отлично! Вы угадали букву!");
            mask = fillWordMaskByLetter(mask, word, letter);
        } else {
            System.out.println("Увы. Вы не угадали");
            errors.add(letter.charAt(0));
            currentStep++;

        }
        printStatus();
    } while (currentStep != 6 && !mask.equals(word));


        if(currentStep == 6){
            System.out.println("!!КИРДЫК!!");
            System.out.println("А слово было: " + word);
        }

        if(mask.equals(word)){
            System.out.println("Congratulations!!! You Win!!");
        }

}


    public static String fillWordMaskByLetter(String mask, String word, String letter){
        char [] filledMask = mask.toCharArray();
        char [] wordArr = word.toCharArray();
        for (int i = 0; i < wordArr.length; i++){
            if (wordArr[i] == letter.charAt(0)){
                filledMask[i] = letter.charAt(0);
            }
        }
        return String.valueOf(filledMask);
    }

    public static void printStatus(){
        System.out.println("Слово: " + mask);
        System.out.println("Ошибки: " + Arrays.toString(errors.toArray()));
        System.out.println(Steps.allSteps[currentStep]);
    }
}
