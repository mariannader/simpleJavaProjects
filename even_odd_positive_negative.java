import java.util.Scanner;

public class even_odd_positive_negative {
    public static void main (String[] agrs){
        Scanner input = new Scanner(System.in);
        //user input
        long num = input.nextLong();

        //declare an array to hold the inputs
        long[] arr= new long[(int)num];

        //declare >>>>>
        long even =0 ;
        long odd =0 ;
        long positive =0 ;
        long nagative =0 ;

        // take inputs from user
        for (int i=0 ; i< arr.length ; i++){
            arr[i] = input.nextLong();
        }//end for

        //for to answer
        for (int j=0 ; j<arr.length ; j++){
            if (arr[j] %2 == 0 | arr[j]==0){
                even+=1;
            }//end if
            else {
                odd +=1 ;
            }//end else
            if (arr[j] < 0){
                nagative +=1;
            }//end if
            else if (arr[j] > 0){
                positive  +=1;
            }
        }//end for

        //print the answer
        System.out.println("Even: "+even);
        System.out.println("Odd: "+odd);
        System.out.println("Positive: "+positive);
        System.out.print("Negative: "+nagative);

    }// end public main
}//end class
