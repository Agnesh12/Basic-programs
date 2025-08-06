package BasicProgram;

public class NumberPalindrome {
    static public boolean isPalindrome(int number) {
        int tempNumber = number;
        int temp = 0;
        int rev = 0;
        while(number != 0) {
            rev = number % 10;
            temp = temp * 10 + rev;
            number /= 10;
        }
        return (tempNumber == temp);
    }
    public static void main(String[] args) {
        int number = 121;
        if(isPalindrome(number)) {
            System.out.println("The Number is palindrome");
        }
        else {
            System.out.println("The Number is Not Palindrome");
        }
    }
}
