package BasicProgram;

public class PrimeNumber {
    public static void main(String[] args) {
        int number = 7;
        int primeCount = 0;
        for(int first = 1; first <= number; first++) {
            if(number % first == 0) {
                primeCount++;
            }
        }
        if(primeCount == 2) {
            System.out.println("This Number is Prime Number");
        }
        else{
            System.out.println("This Number is Not a Prime Number");
        }
    }
}
