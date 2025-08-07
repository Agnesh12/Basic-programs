package BasicProgram;

public class GCD {
    static public int findGcd(int a, int b) {
        while(b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args) {
        int num1 = 14;
        int num2 = 28;
        System.out.println(findGcd(num1, num2));
    }
}
