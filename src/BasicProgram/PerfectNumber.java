package BasicProgram;

public class PerfectNumber {
    static  public boolean findPerfect(int number) {
        int sum = 0;
        for(int first = 1; first < number; first++) {
            if(number % first == 0) {
                sum += first;
            }
        }
        return (number == sum);
    }
    public static void main(String[] args) {
        int number = 6;
        System.out.println("The Number is perfect " + findPerfect(number));
    }
}
