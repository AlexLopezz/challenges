import java.util.*;

public class Main {
    public static void main(String[] args) {
        String originalWord = "amor", word = "roma";
        boolean result = isAnAnagram(originalWord, word);

        
        System.out.printf("The word= %s is an anagram of the word= %s? \nResponse: %s\n", originalWord, word, result);
    }

    public static boolean isAnAnagram(String originalWord, String word){
        if(originalWord.equals(word))
            return false;

        Set<Character> lettersOriginalWord =  castToListChar(originalWord);
        Set<Character> lettersWord = castToListChar(word);

        return lettersOriginalWord.containsAll(lettersWord);

        /* logically implemented
        for (int i = 0; i < word.length(); i++){
            for (int w=0; w < letters.size(); w++){
                char letter = letters.get(w);
                if(letter == word.charAt(i))
                    letters.remove(w);

                if(letters.isEmpty())
                    return true;
            }

            return false;
        }*/
    }
    static Set<Character> castToListChar(String word){
        Set<Character> letters = new HashSet<>();
        for (char w : word.toCharArray())
            letters.add(w);


        return letters;
    }
}