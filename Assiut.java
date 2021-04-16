import java.util.Scanner;

public class Assiut {
    public static void main(String []args) {
        Scanner input = new Scanner(System.in);

        long n = input.nextLong();
        long m = input.nextLong();

        long sum1  =  n*(n+1)/2;
        long sum2  =   m*(m+1)/2;

        long y = sum1 - sum2;
        System.out.print(y);




    }
}
