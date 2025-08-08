package BasicProgram;

public class HarshadNumber {
    static public boolean CheckHarshad(int number) {
        int temp = number;
        int sum = 0;
        while(temp != 0) {
          sum += temp % 10;
          temp /= 10;
        }
        return (number % sum == 0) ? true : false;
    }
    public static void main(String[] args) {
        int number = 18;
        System.out.println("The Number is Harshad Number " +CheckHarshad(number));
    }
}
