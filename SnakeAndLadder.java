package com.snakeladderproblem;

import java.util.Random;

public class SnakeAndLadder {

	public static void main(String[] args) {

		int position = 0;
		int diceCount = 0;

		Random random = new Random();

		while (position < 100) {

			int dice = random.nextInt(6) + 1;
			int option = random.nextInt(3);

			diceCount++;

			System.out.println("Dice Roll #" + diceCount);
			System.out.println("Dice Rolled: " + dice);

			if (option == 0) {
				System.out.println("No Play");
			}
			else if (option == 1) {
				System.out.println("Ladder");

				if (position + dice <= 100) {
					position += dice;
				} else {
					System.out.println("Move not allowed. Exceeds 100.");
				}
			}
			else {
				System.out.println("Snake");

				position -= dice;

				if (position < 0) {
					position = 0;
				}
			}

			System.out.println("Current Position: " + position);
			System.out.println("-------------------------");
		}

		System.out.println("Player Won!");
		System.out.println("Final Position: " + position);
		System.out.println("Total Dice Rolls: " + diceCount);
	}
}