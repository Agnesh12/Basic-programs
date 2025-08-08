package BasicProgram;

public class NeonNumber {
    static public boolean CheckNeon(int number) {
        int squareNumber = number * number;
        int result = 0;
        while(squareNumber != 0) {
            result += squareNumber % 10;
            squareNumber /= 10;
        }
        return (result == number);
    }
    public static void main(String[] args) {
        int number = 9;
        System.out.println("The Number is Neon Number " + CheckNeon(number));
    }
}
