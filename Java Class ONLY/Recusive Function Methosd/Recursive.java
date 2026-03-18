public class Recursive {
    public static void main(String[] args) {
        int result = factorial(5);
        System.out.println("Factorial of n is: " + result);
        int result2 = primeCheck(29, 2);
        if (result2 == 1) {
            System.out.println("Number is prime");
        } else {
            System.out.println("Number is not prime");
        }
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static int primeCheck(int n, int i) {
        if (n <= 2) {
            return (n == 2) ? 1 : 0;
        }
        if (n % i == 0) {
            return 0;
        }
        if (i * i > n) {
            return 1;
        }
        return primeCheck(n, i + 1);
    }
}
