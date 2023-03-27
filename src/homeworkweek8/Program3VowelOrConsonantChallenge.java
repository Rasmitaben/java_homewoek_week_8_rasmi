package homeworkweek8;

import java.util.Scanner;

/**
 * 3. Write a Java program that takes the user to provide a single character from the
 * alphabet. Print Vowel or Consonant, depending on the user input. If the user input
 * Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
 * error message.
 * For eg:
 * Input an alphabet: p
 * Expected Output:
 * Input letter is Consonant
 */

public class Program3VowelOrConsonantChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      System.out.println("Input an alphabet: ");
        String input = scanner.nextLine().toLowerCase();

     //check if input is a single letter
       if (input.length() > 1 || !Character.isLetter(input.charAt(0))) {
            System.out.println("Error: please enter a single letter");
        }
       // check if input is vowel

       else {
            char letter = input.charAt(0);
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {System.out.println("Input letter is vowel");
           }
            // otherwise, input is a consonant

            else {
                System.out.println("Input letter is consonant");
            }
       }
     scanner.close();


    }
}