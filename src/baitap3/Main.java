package baitap3;

public class Main {
    public static void main(String[] args) {
        LazyPrimeFactorization lazyFactorization = new LazyPrimeFactorization();
        OptimizedPrimeFactorization optimizedFactorization = new OptimizedPrimeFactorization();

        Thread lazyThread = new Thread(lazyFactorization);
        Thread optimizedThread = new Thread(optimizedFactorization);
         optimizedThread.start();
        lazyThread.start();

    }
}
