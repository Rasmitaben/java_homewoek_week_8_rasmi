package homeworkweek8;

import java.util.Scanner;

/**
 *  10. Write a program to input any number and check if it Armstrong number or not
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 * where:
 * (1*1*1)=1
 * (5*5*5)=125
 * (3*3*3)=27
 * So:
 * 1+125+27=153 by using java scanner class
 */
public class Program10ArmstrongNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = scanner.nextInt();
        int originalNumber = number;

        int sum = 0;
        int digit;

        while (number != 0){
            digit = number % 10;
            sum += Math.pow(digit, 3);
            number /= 10;
        }
        if (sum == originalNumber){
            System.out.println(originalNumber + " " + "is an Armstrong number: ");
        }else{
            System.out.println(originalNumber + " " + "is not an Armstrong number: ");
        }
        scanner.close();
    }

}
