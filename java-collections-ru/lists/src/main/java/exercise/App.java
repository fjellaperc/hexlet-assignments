package exercise;

//import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
class App {
    public static List<String> createList(String input) {
        List<String> letters = new ArrayList<>();
        String lowerStr = input.toLowerCase();
        for (int i = 0; i < input.length(); i++) {
            letters.add(String.valueOf(lowerStr.charAt(i)));
        }
        return letters;
    }
    public static boolean scrabble(String input, String word) {
        List<String> list = createList(input);
        String lowerWord = word.toLowerCase();
        int j = 0; //счетчик
        for (int i = 0; i < lowerWord.length(); i++) {
            String letter = String.valueOf(lowerWord.charAt(i)); //Записываем букву в перменную для проверки
            if (list.contains(String.valueOf(lowerWord.charAt(i)))) {
                list.remove(letter);//Удаляем символ
                j++;
            }
        }
        return j == word.length();
    }
}
//END
