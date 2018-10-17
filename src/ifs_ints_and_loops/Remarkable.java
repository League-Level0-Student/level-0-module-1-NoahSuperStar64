package ifs_ints_and_loops;

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {
	String name = JOptionPane.showInputDialog("");
	if(name.equalsIgnoreCase("Jeremiah")) {
		JOptionPane.showMessageDialog(null, "Jeremiah is KWAUCK");
	}
	else if(name.equalsIgnoreCase("Alex")) {
		JOptionPane.showMessageDialog(null, "Alex eats uranium and enjoys the taste");
	}
	else if(name.equalsIgnoreCase("Noah")) {
		JOptionPane.showMessageDialog(null, "Noah has a very bad... wait, where am I?");
	}
	else if(name.equalsIgnoreCase("WriterArtistAndCoder")) {
	JOptionPane.showMessageDialog(null, "Rowan is artsy and comicsy");
	}
	else {
		JOptionPane.showMessageDialog(null, "Who the heck is that");
	}
}	
}
//Jeremiah
//Alex
//Noah
//Rowan