package BasicProgram;

public class Factors {
    public static void main(String[] args) {
        int number = 12;
        for(int first = 1; first <= number; first++) {
            if(number % first == 0) {
                System.out.print(first + " ");
            }
        }
    }
}
