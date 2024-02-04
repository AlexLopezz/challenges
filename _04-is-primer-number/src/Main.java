import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        displayTheFirst100PrimerNumbers();
    }

    static void displayTheFirst100PrimerNumbers(){
        IntStream.rangeClosed(1,100)
                .forEach(n -> {
                    if(isPrimeNumber(n))
                        System.out.println(n);
                });
    }
    static boolean isPrimeNumber(int number){
        if(number < 2)
            return false;

        for(int i= 2; i < number; i++){
            if(number % i == 0)
                return false;
        }

        return true;
    }
}