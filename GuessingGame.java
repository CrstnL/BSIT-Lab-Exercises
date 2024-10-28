package guessinggame;

import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String secretWord = "Daisy";
        int maxAttempt = 5;
        int attempt = 0;
        String userGuess;
        
        System.out.println("~~GUESSING GAME~~");
        
        do {
         System.out.println("You only have " + (attempt + 1) + " attempts in this game.");
        System.out.print("Guess the word: ");
        userGuess = sc.next();
        attempt ++;
        
        if (userGuess.equalsIgnoreCase(secretWord)) {
            System.out.println("Congratulation! You guess the correct word!");
            break;
            
        }else if (userGuess.length() < secretWord.length()) {
            System.out.println("Too short");
        }else {
            System.out.println("Too long");
        }    
            
        }while (attempt < maxAttempt);
        
        if (!userGuess.equalsIgnoreCase(secretWord)) {
            System.out.println("Sorry your guess is wrong. The correct answer is " + (secretWord));
        }
         
    }
    
}
