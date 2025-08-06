package BasicProgram;

public class Factorial {
    static public int factorial(int number) {
        int fact = 1;
        for(int first = 1; first <= number; first++) {
            fact *= first;
        }
        return fact;
    }
    public static void main(String[] args) {
        int number = 6;
        System.out.println(factorial(number));
    }
}
