
public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 2, 1};
        reverseArray(arr, 0, arr.length - 1);
        for(int n: arr) {
            System.out.print(n + ", ");
        }

        System.out.println(isPalindrome("00100", 0, 4));
        
    }

    public static void reverseArray(int arr[], int l, int r) {

        if(l > r) {
            return;
        }

        int tmp = arr[l];
        arr[l] = arr[r];
        arr[r] = tmp;

        reverseArray(arr, l + 1, r - 1);
    }

    public static boolean isPalindrome(String str, int l, int r) {
        if(l > r) {
            return true;
        }        
        return str.charAt(l) == str.charAt(r) && isPalindrome(str, l + 1, r - 1);
    }
}