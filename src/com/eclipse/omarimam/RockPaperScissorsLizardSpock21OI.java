/**Program: Rock, Paper, Scissors, Lizard, Spock v.2.0
 * Author: Omar Imam
 * Date Last Modified: March 22, 2017
 * Purpose: The purpose of this program is to play a game of Rock, Paper, Scissors, Lizard, Spock
 * against a computer-controlled player that randomly selects their character choice.
*/

// Package information
package com.eclipse.omarimam;

// Import Scanner Utility
import java.util.Scanner;

// Define Class
public class RockPaperScissorsLizardSpock21OI {
	// Declare variables
	public static String playerCharacter = " ";
	public static String computerCharacter = " ";
	public static int playerChoice = 0;
	
	// Create checkChoice method
	public static String checkChoice(int choice) {
		if (playerCharacter == " "){
			if (choice == 0) {
				playerCharacter = "Scissors";
			}
			else if (choice == 1) {
				playerCharacter = "Rock";
			}
			else if (choice == 2) {
				playerCharacter = "Paper";
			}
			else if (choice == 3) {
				playerCharacter = "Lizard";
			}
			else if (choice == 4) {
				playerCharacter = "Spock";
			};
			return playerCharacter;
		}
		else {
			if (choice == 0) {
				computerCharacter = "Scissors";
			}
			else if (choice == 1) {
				computerCharacter = "Rock";
			}
			else if (choice == 2) {
				computerCharacter = "Paper";
			}
			else if (choice == 3) {
				computerCharacter = "Lizard";
			}
			else if (choice == 4) {
				computerCharacter = "Spock";
			};
			return computerCharacter;
		}
	}

	
	// Define main method
	public static void main(String[] args) {
		
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// Initialize score variables
		int playerScore = 0;
		int computerScore = 0;
		int numberOfDraws = 0;
		
		do {
		// Request the user to choose a fighter.
		System.out.println("Choose a Fighter using the corresponding number, then press return.\n" + " 0-Scissors\n " + "1-Rock\n " + "2-Paper\n " + "3-Lizard\n " + "4-Spock\n" + "5-Exit\n");
		
		// Take the user's input and places it in the variable playerChoice
		int playerChoice = input.nextInt();
		
		// Ensures that the user's choice is between 0 and 4
		if (playerChoice < 0) {
			System.out.println("Error: Your number must be an integer between 0 and 5.\n ");
		}
		else if (playerChoice > 5) {
			System.out.println("Error: Your number must be an integer between 0 and 5.\n ");
		}	
		else if (playerChoice == 5) {
				input.close();
				System.out.println("Goodbye!");
				System.exit(0);
		}
		// If the user's number falls within the acceptable range, continue
		else {
		// Chooses a random number between [0,4] and assigns it to the variable 'computerChoice'
		int computerChoice = (int)(Math.random() * ((4 - 0) + 1));
		// Prints to the screen, the computer and player character choices
		// The checkChoice method is used to determine the character from the numerical choice
		System.out.println("You have chosen: " + checkChoice(playerChoice));
		System.out.println("The computer has chosen: " + checkChoice(computerChoice));
		}
		// If both choices are the same, result is a DRAW
		if (playerCharacter == computerCharacter) {
			System.out.print("You and the computer have both chosen the same character, " + playerCharacter + ".\n Your battle has ended in a DRAW.\n  \n");
			numberOfDraws += 1;
			System.out.print("Current scores: \n" + "Wins: " + playerScore + "\n Losses: " + computerScore + "\n Ties: " + numberOfDraws + "\n");
		}
		// If player chooses Scissors...
		else if (playerCharacter == "Scissors") {
			// ...and computer chooses Lizard or Paper...
			if ((computerCharacter == "Lizard") || (computerCharacter == "Paper")){
				// ...print winning message.
				System.out.println(playerCharacter + " beats " + computerCharacter + "!!!! You WIN!!!!!\n");
				playerScore += 1;
				System.out.print("Current scores: \n" + "Wins: " + playerScore + "\n Losses: " + computerScore + "\n Ties: " + numberOfDraws + "\n");

			}
			// and computer chooses Rock or Spock...
			else if ((computerCharacter == "Rock") || (computerCharacter == "Spock")) {
				// ...print losing message.
				System.out.println(computerCharacter + " beats " + playerCharacter + "!!! Sorry, you lose.\n");
				computerScore += 1;
				System.out.print("Current scores: \n" + "Wins: " + playerScore + "\n Losses: " + computerScore + "\n Ties: " + numberOfDraws + "\n");

			}
		}
		
		// If player chooses Rock...
				else if (playerCharacter == "Rock") {
					// ...and computer chooses Lizard or Scissors...
					if ((computerCharacter == "Lizard") || (computerCharacter == "Scissors")){
						// ...print winning message.
						System.out.println(playerCharacter + " beats " + computerCharacter + "!!!! You WIN!!!!!\n");
						playerScore += 1;
						System.out.print("Current scores: \n" + "Wins: " + playerScore + "\n Losses: " + computerScore + "\n Ties: " + numberOfDraws + "\n");

					}
					// and computer chooses Spock or Paper...
					else if ((computerCharacter == "Spock") || (computerCharacter == "Paper")) {
						// ...print losing message.
						System.out.println(computerCharacter + " beats " + playerCharacter + "!!! Sorry, you lose.\n");
						computerScore += 1;
						System.out.print("Current scores: \n" + "Wins: " + playerScore + "\n Losses: " + computerScore + "\n Ties: " + numberOfDraws + "\n");

					}
				}
		
		// If player chooses Paper...
				else if (playerCharacter == "Paper") {
					// ...and computer chooses Rock or Spock...
					if ((computerCharacter == "Rock") || (computerCharacter == "Spock")){
						// ...print winning message.
						System.out.println(playerCharacter + " beats " + computerCharacter + "!!!! You WIN!!!!!\n");
						playerScore += 1;
						System.out.print("Current scores: \n" + "Wins: " + playerScore + "\n Losses: " + computerScore + "\n Ties: " + numberOfDraws + "\n");
					}
					// and computer chooses Lizard or Scissors...
					else if ((computerCharacter == "Lizard") || (computerCharacter == "Scissors")) {
						// ...print losing message.
						System.out.println(computerCharacter + " beats " + playerCharacter + "!!! Sorry, you lose.\n");
						computerScore += 1;
						System.out.print("Current scores: \n" + "Wins: " + playerScore + "\n Losses: " + computerScore + "\n Ties: " + numberOfDraws + "\n");
					}
				}
		
		// If player chooses Lizard...
				else if (playerCharacter == "Lizard") {
					// ...and computer chooses Spock or Paper...
					if ((computerCharacter == "Spock") || (computerCharacter == "Paper")){
						// ...print winning message.
						System.out.println(playerCharacter + " beats " + computerCharacter + "!!!! You WIN!!!!!\n");
						playerScore += 1;
						System.out.print("Current scores: \n" + "Wins: " + playerScore + "\n Losses: " + computerScore + "\n Ties: " + numberOfDraws + "\n");
					}
					// and computer chooses Rock or Scissors...
					else if ((computerCharacter == "Rock") || (computerCharacter == "Scissors")) {
						// ...print losing message.
						System.out.println(computerCharacter + " beats " + playerCharacter + "!!! Sorry, you lose.\n");
						computerScore += 1;
						System.out.print("Current scores: \n" + "Wins: " + playerScore + "\n Losses: " + computerScore + "\n Ties: " + numberOfDraws + "\n");
					}
				}
		
		// If player chooses Spock...
				else if (playerCharacter == "Spock") {
					// ...and computer chooses Rock or Scissors...
					if ((computerCharacter == "Rock") || (computerCharacter == "Scissors")){
						// ...print winning message.
						System.out.println(playerCharacter + " beats " + computerCharacter + "!!!! You WIN!!!!!\n");
						playerScore += 1;
						System.out.print("Current scores: \n" + "Wins: " + playerScore + "\n Losses: " + computerScore + "\n Ties: " + numberOfDraws + "\n");
					}
					// and computer chooses Paper or Lizard...
					else if ((computerCharacter == "Paper") || (computerCharacter == "Lizard")) {
						// ...print losing message.
						System.out.println(computerCharacter + " beats " + playerCharacter + "!!! Sorry, you lose.\n");
						computerScore += 1;
						System.out.print("Current scores: \n" + "Wins: " + playerScore + "\n Losses: " + computerScore + "\n Ties: " + numberOfDraws + "\n");
					}
				}
	
		playerCharacter = " ";
		} while (playerChoice != 5);
		
	}

}
