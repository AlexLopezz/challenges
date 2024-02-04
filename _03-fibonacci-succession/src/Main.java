import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Fibonacci Loop: ");
        firstFiftyNumbersFiboncacciLoop();
        System.out.println("Fibonacci Recursive: ");
        firstFiftyNumbersFiboncacciRecursive();
    }

    static void firstFiftyNumbersFiboncacciRecursive(){
        for (int i= 0; i < 25; i++){
            System.out.println(fibR(i));
        }
    }
    static void firstFiftyNumbersFiboncacciLoop(){
        for (int i= 0; i < 25; i++){
            System.out.println(fibL(i));
        }
    }



    static int fibR(int n){
        if(n <= 1)
            return n;

        return fibR(n-2 ) + fibR(n - 1);
    }

    static int fibL(int n){
        List<Integer> fib = new ArrayList<>(List.of(0,1));
        for (int i = 2; i <= n; i++){ // 5
            fib.add(i, (fib.get(i-2) + fib.get(i-1)));
        }

        return fib.get(n);
    }
}