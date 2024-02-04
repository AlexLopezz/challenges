public class Main {
    public static void main(String[] args) {
        String wordTest = "Hello world!";

        System.out.printf("The word: %s reverse is: %s\n", wordTest, reverse(wordTest));

        /*With String Builder's function:
        String reverse = new StringBuilder(wordTest).reverse().toString();
        System.out.printf("The word: %s reverse is: %s\n", wordTest, reverse); */
    }
    static String reverse(String string){
        StringBuilder sb = new StringBuilder();

        for (int i= string.length()-1; i >= 0; i--)
            sb.append(string.charAt(i));


        return sb.toString();
    }
}