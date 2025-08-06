package BasicProgram;

public class ReverseNumber {
    public static void main(String[] args) {
        int number = 1234;
        int result = 0;
        while(number != 0) {
            int rev = number % 10;
            result = result * 10 + rev;
            number /= 10;
        }
        System.out.println("Reverse Number is " + result);
    }
}
