package baitap3;

public class OptimizedPrimeFactorization  implements  Runnable{
    @Override
    public void run() {
        int num = 2;
        while (true) {
            if (isPrime(num)) {
                System.out.println("Optimized Prime: " + num);
            }
            num++;
        }
    }
//    private boolean isPrime(int n) {
//        if (n < 2) return false;
//        for (int i = 2; i <= n; i++) {
//            if (n % i == 0)
//                return false;
//        }
//        return true;
//    }
private boolean isPrime(int n) {
    if (n < 2) return false;
    if (n == 2 || n == 3) return true;
    if (n % 2 == 0 || n % 3 == 0) return false;

    int sqrtN = (int) Math.sqrt(n) + 1;
    for (int i = 5; i <= sqrtN; i += 6) {
        if (n % i == 0 || n % (i + 2) == 0)
            return false;
    }
    return true;
}
}
