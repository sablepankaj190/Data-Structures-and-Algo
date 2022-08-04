

public class Print1ToN {
    public static void main(String[] args) {
        printCount(10, 1); 
        printCountBacktrack(10, 10);       
    }

    public static void printCount(int n, int val) {
        
        if(val > n) {
            return;
        }

        System.out.println(val);
        printCount(n, val + 1);
    }

    public static void printCountBacktrack(int n, int val) {
        if(val < 1) {
            return;
        }
        printCountBacktrack(n, val - 1);
        System.out.println(val);
    }
}