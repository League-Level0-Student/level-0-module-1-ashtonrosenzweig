import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

int score = 0;
// riddle 1
String answer1 = JOptionPane.showInputDialog("Who can travel the world while staying in a corner?").toLowerCase();
if (answer1.equals("a stamp") || answer1.equals("a stamp!") || answer1.equals("a stamp.") || answer1.equals("stamp") || answer1.equals("stamp!") || answer1.equals("stamp.")){
score = score + 1;
JOptionPane.showMessageDialog(null, "Correct! The score is " + score + "!");
}else
{JOptionPane.showMessageDialog(null, "Wrong! It's a stamp! The score is " + score + "!");}
int keep2 = JOptionPane.showConfirmDialog(null, "Do you want to keep playing?");
// riddle 2
if (keep2 == 0){
	String answer2 = JOptionPane.showInputDialog("What has a head. a tail, but no body?").toLowerCase();
	if (answer2.equals("a coin") || answer2.equals("a coin!") || answer2.equals("a coin.") || answer2.equals("coin") || answer2.equals("coin!") || answer2.equals("coin.")){
score = score + 1;
JOptionPane.showMessageDialog(null, "Correct! The score is " + score + "!");}else {
JOptionPane.showMessageDialog(null, "Wrong! It's a coin! The score is " + score + "!");
		}
	}




	}
}

