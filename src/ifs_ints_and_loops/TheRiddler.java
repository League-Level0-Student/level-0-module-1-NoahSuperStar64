package ifs_ints_and_loops;
//    Copyright (c) The League of Amazing Programmers 2013-2017

//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String answer1 = JOptionPane.showInputDialog("");
		// 4. If they got the answer right, pop up "correct!" and increase the score by
		// one
		if (answer1.equalsIgnoreCase("")) {
			JOptionPane.showMessageDialog(null, "Correct.");
			score += 1;
		}
		// 5. Otherwise, say "wrong" and tell them the answer
		else {
			JOptionPane.showMessageDialog(null, "Incorrect. The answer is");
		}
		// 6. Add some more riddles
		String answer2 = JOptionPane.showInputDialog("");

		if (answer2.equalsIgnoreCase("")) {
			JOptionPane.showMessageDialog(null, "Right answer.");
			score += 1;
		}

		else {
			JOptionPane.showMessageDialog(null, "Wrong answer. right answer is");
		}
		String answer3 = JOptionPane.showInputDialog("");

		if (answer3.equalsIgnoreCase("")) {
			JOptionPane.showMessageDialog(null, "You did it, yay, yada yada yada....");
			score += 1;
		}

		else {
			JOptionPane.showMessageDialog(null, "Nope, it's this. Can I go home now?");
		}
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, score);
	}
}
