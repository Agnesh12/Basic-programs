package BasicProgram;

public class AmstrongNumber {
    static public int Check(int number) {
        int tempNumber = number;
        int powerCount = 0;
        while(number != 0) {
            number /= 10;
            powerCount++;
        }
        int ResultNumber = 0;
        while(tempNumber != 0) {
            int rev = tempNumber % 10;
            ResultNumber += (int) Math.pow(rev, powerCount);
            tempNumber /= 10;
        }
        return ResultNumber;
    }
    public static void main(String[] args) {
        int number = 152;
        if(Check(number) == number) {
            System.out.println("the Number is Amstrong Number");
        }
        else {
            System.out.println("The Number is Not Amstrong Number");
        }
    }
}
