
import java.util.Scanner;
//(Check SSN) Write a program that prompts the user to enter a Social Security
//number in the format DDD-DD-DDDD, where D is a digit. Your program should
//check whether the input is valid.

public class Check_SSN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //user input
        System.out.println(" enter a Social Security number in the format DDD-DD-DDDD, where D is a digit : ");
        //here i will take the number with - than i should input by String
        String socialSecurityNumber = input.nextLine();

        // Check whether the input is valid
        //by function Character.isDigit() -> and send the index to check
        //to be new i will use Boolean THAT TAKE TRUE OR FULSE  WITHOUT using if statement
        Boolean valid =
                (
                        (socialSecurityNumber.length() == 11) &
                                (Character.isDigit(socialSecurityNumber.charAt(0))) &
                                (Character.isDigit(socialSecurityNumber.charAt(1))) &
                                (Character.isDigit(socialSecurityNumber.charAt(2))) &
                                (socialSecurityNumber.charAt(3) == '-') &
                                (Character.isDigit(socialSecurityNumber.charAt(4))) &
                                (Character.isDigit(socialSecurityNumber.charAt(5))) &
                                (socialSecurityNumber.charAt(6) == '-') &
                                (Character.isDigit(socialSecurityNumber.charAt(7))) &
                                (Character.isDigit(socialSecurityNumber.charAt(8))) &
                                (Character.isDigit(socialSecurityNumber.charAt(9))) &
                                (Character.isDigit(socialSecurityNumber.charAt(10)))
                );//end Boolean
        if(valid){
            System.out.println(socialSecurityNumber+"is valid");
        }
        else {
            System.out.println(socialSecurityNumber+"not valid");
        }

    }//end main
}//end class
