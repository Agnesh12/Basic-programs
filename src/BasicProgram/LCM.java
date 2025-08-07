package BasicProgram;

public class LCM {
    static  public int findGcd(int a, int b) {
        while(b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    static public int findLcm(int a, int b) {
        return (a * b) / findGcd(a, b);
    }
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 24;
        System.out.println(findLcm(num1, num2));

    }
}
