package BasicProgram;

public class AutomorphicNumber {
    static public boolean CheckAuto(int number) {
        int squareNumber = number * number;
        int digits = 0;
        int temp = number;
        while(temp != 0) {
            digits++;
            temp /= 10;
        }
        int lastDigit = squareNumber % (int) Math.pow(10, digits);
        return(lastDigit == number);

    }
    public static void main(String[] args) {
        int number = 6;
        System.out.println("The Number is Automorphic " + CheckAuto(number));
    }
}
