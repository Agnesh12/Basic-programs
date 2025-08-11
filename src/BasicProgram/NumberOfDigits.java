package BasicProgram;

public class NumberOfDigits {
    public static void main(String[] args) {
        int number = 123;
        int temp = number;
        int countDigits = 0;
        while(temp != 0) {
            temp /=10;
            countDigits++;
        }
        System.out.println((number == 0) ? 1 : countDigits);
    }
}
