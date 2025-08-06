package BasicProgram;

public class OddOrEven {
    static public boolean CheckOddOrEven(int number) {
        if(number % 2 == 1) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        int number = 5;
        if(number < 0) {
            System.out.println("the Number is Negative");
        }
       else if(CheckOddOrEven(number)) {
            System.out.println("The Number is Odd");
        }
        else {
            System.out.println("The Number is Even");
        }
    }
}
