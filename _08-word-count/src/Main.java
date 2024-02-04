/*
 * Crea un programa que cuente cuantas veces se repite cada palabra
 * y que muestre el recuento final de todas ellas.
 * - Los signos de puntuación no forman parte de la palabra.
 * - Una palabra es la misma aunque aparezca en mayúsculas y minúsculas.
 * - No se pueden utilizar funciones propias del lenguaje que
 *   lo resuelvan automáticamente.

 */

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        String text= "Hola hola, como estas? yo bien y vos. Me alegro por vos, si si todo bien!";

        System.out.println(getWordsCount.apply(text));
    }


    static Function<String, String> cleanText = s -> {
        String[] symbols = {"¿","?",",",".",";",":","!","¡"};
        s = s.toLowerCase();
        for (String w : symbols){
            s = s.replace(w, "");
        }

        return s;
    };
    static Function<String, Map<String, Integer>> getWordsCount = s -> {
        Map<String, Integer> repeatWords = new HashMap<>();
        String text = cleanText.apply(s);
        String[] words = text.split(" ");

        for (String w : words){
            if(repeatWords.containsKey(w)){
                repeatWords.replace(w, repeatWords.get(w)+1);
            }else {
                repeatWords.put(w, 1);
            }
        }


        return repeatWords;
    };
}