import java.util.Scanner;

public class DivisorsfTwoIntegers {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
int size =input.nextInt();
        int[] arr  = new int[size];

        for(int i = 0 ;  i<arr.length  ;i++){
            arr[i]=input.nextInt();
            System.out.print(arr[i]);
        }
        int ta = input.nextInt();
        for(int i = 0 ;  i<arr.length  ;i++){
            for(int j=arr[i+1] ; j<=arr.length -1; j++){
                if(ta==arr[i]/arr[j]){
                    System.out.println(i + j);
                }
            }
        }
    }//end main

}//end class
