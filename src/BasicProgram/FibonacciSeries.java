package BasicProgram;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 7;
        int first = 0;
        int second = 1;
        System.out.print(first + " ");
        System.out.print(second + " ");
        for(int index = 2; index < n; index++) {
            int nextNumber = first + second;
            first = second;
            second = nextNumber;
            System.out.print(nextNumber + " ");
        }
    }
}
