package BasicProgram;

public class SumOfDigits {
    public static void main(String[] args) {
        int number = 1234;
        int sum = 0;
        while(number != 0) {
        int rev = number % 10;
        sum += rev;
        number /= 10;
        }
        System.out.println("The Sum of DIgits is" + " " + sum);
    }
}
