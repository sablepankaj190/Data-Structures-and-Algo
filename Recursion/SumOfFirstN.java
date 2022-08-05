
public class SumOfFirstN {
    public static void main(String[] args) {
        System.out.println(sumOfNumbers(10));
        System.out.print(factorial(10));      
    }

    public static int sumOfNumbers(int n) {
        if(n == 0) {
            return 0;
        }
        return n + sumOfNumbers(n - 1);
    }

    public static int factorial(int n) {
        if(n == 0 || n == 1) {
            return  1;
        }

        return n * factorial(n - 1);
    }
}