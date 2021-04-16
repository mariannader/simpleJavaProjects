import java.util.Scanner;

public class AreaAndPerimeter {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the rate : ");
        double  Rate = input.nextDouble();
        double  interestRate = Rate /12 ;
        System.out.println("Enter the saving : ");
        double saving = input.nextDouble();

        double using = (1 + interestRate);

        double month1 = saving * using ;
        double month2 = (saving + month1) * using ;
        double month3 = (saving + month2 ) * using ;
        double month4 = (saving +month3) * using ;
        double month5 = (saving + month4) * using ;
        double month6 = (saving + month5) * using ;
        System.out.println(" month1 "+month1);
        System.out.println(" month2 "+month2);
        System.out.println(" month2 "+month3);
        System.out.println(" month3 "+month4);
        System.out.println(" month4 "+month5);
        System.out.println(" month5 "+month6);









    }//end main
}// end class
