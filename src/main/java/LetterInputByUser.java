import java.util.Scanner;

public class LetterInputByUser {
    public static String getInput(){
        Scanner inputFlow = new Scanner(System.in);
        String input = "";
        do {
            input = inputFlow.next().toLowerCase();

            if(input.equals("exit")){
                //initiate exiting from game
                break;
            }
            if(input.length() > 1){
                System.out.println("Введите только 1 букву.");
                continue;
            }
            break;
        }
        while (true);
        //inputFlow.close();
        return input;
    }

}
