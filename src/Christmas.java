import javax.swing.JOptionPane;

public class Christmas {
public static void main(String[] args) {
String gift = JOptionPane.showInputDialog("What do you want for the holidays this year?");
if(gift .equals("computer") || gift .equals("Computer") || gift .equals("PC") || gift .equals("pc")){
JOptionPane.showMessageDialog(null, "A " + gift + "? " + "Me too!");
}else
JOptionPane.showMessageDialog(null, "A " + gift + ", very cool!");
}
}
