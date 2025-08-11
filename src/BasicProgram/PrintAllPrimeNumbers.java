package BasicProgram;

public class PrintAllPrimeNumbers {
    public static void main(String[] args) {
        int num = 15;
        System.out.print("Prime Numbers are :");
        for(int first = 1; first <= num; first++) {
            int count = 0;
            for(int second = 1; second <= num; second++) {
                if(first % second == 0) {
                    count++;
                }
            }
            if(count == 2) {
                System.out.print(first + " ");
            }
        }
    }
}
