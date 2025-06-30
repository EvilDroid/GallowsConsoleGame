import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LetterInputByUser {


    public static String getInput(){
        Scanner inputFlow = new Scanner(System.in);
        String input = "";
        do {
            input = inputFlow.next().toLowerCase();
            if(validateLetter(input) == false){
                System.out.println("Пожалуйста введите букву русского языка. Или exit, если хотите выйти.");
                continue;
            }

            if(input.equals("exit")){
                System.exit(0);
                break;
            }

            break;
        }
        while (true);
        //inputFlow.close();
        return input;
    }

    public static boolean validateLetter (String text){

        List<String> KEYWORDS = Arrays.asList("exit");

        if (text.equals("") || text == null){
            return false;
        }

        if (text.length() == 1){
            return isCyrillicLetter(text.charAt(0));
        } else {
            return KEYWORDS.contains(text);
        }
    }

    public static boolean isCyrillicLetter (char c){
        char [] validLetters = {
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й',
                'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у',
                'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я'
        };
        for (char letter :  validLetters){
            if(c == letter){
                return true;
            }
        }
        return false;
    }

}
