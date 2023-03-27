package homeworkweek8;


import java.util.Scanner;

/**
 * 9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */

public class Program9FibonacciSequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of the terms in the sequence: ");
        int n = scanner.nextInt();

        int firstTerm = 1, secondTerm = 1, nextTerm;

        System.out.println(firstTerm + " " + secondTerm);

        for (int i =3; i <= n; i++){
            nextTerm = firstTerm + secondTerm;
            System.out.print(" " + nextTerm);
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        scanner.close();
    }
}
