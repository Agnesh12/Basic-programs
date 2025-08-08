package BasicProgram;

public class StrongNumber {
    static public boolean CheckStrong(int number) {
        int result = 0;
        int temp = number;
        while(temp != 0) {
            result += factorial(temp % 10);
            temp /= 10;
        }
        return (number == result);
    }
    static public int factorial(int number) {
        int fact = 1;
        for(int first = 1; first <= number; first++) {
            fact *= first;
        }
        return fact;
    }
    public static void main(String[] args) {
        int number = 145;
        System.out.println("the Number is Strong " + CheckStrong(number));
    }
}
