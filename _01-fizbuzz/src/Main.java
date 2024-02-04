public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++){
            boolean mullti3 = i % 3 == 0;
            boolean multi5 = i % 5 == 0;

            if(mullti3 && multi5)
                System.out.println("fizzbuzz");
            else if(mullti3)
                System.out.println("fizz");
            else if (multi5)
                System.out.println("buzz");
        }
    }
}