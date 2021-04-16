import java.util.*;

public class CEorCS {
    public static void main(String []args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt(); //size of a,b
        int m = input.nextInt(); //size 0f l,r
        long sum1 = 0;
        long sum2 = 0;

        long[] a = new long[ n];
        for(int i =0 ; i<n ; i++){
            a[i] = input.nextLong();
            sum1 +=a[i];
        }//end for

        long[] b = new long[ n];
        for(int i =0 ; i<n ; i++){
            b[i] = input.nextLong();
            sum2 +=b[i];
        }//end for


        long[][] l = new long[ m][2];
        for(int i =0 ; i<m ; i++){
            for(int j=0 ; j<2 ; j++){
                l[i][j] =input.nextLong();
            }

        }//end for



        if(sum1 >sum2 || sum1 ==sum2){
            System.out.print("CE");
        }
        else {
            System.out.print("CS");
        }







    }//end main





}
