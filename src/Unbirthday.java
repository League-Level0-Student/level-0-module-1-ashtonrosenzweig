import javax.swing.JOptionPane;

public class Unbirthday {
public static void main(String[] args) {
String bday = JOptionPane.showInputDialog("What's your birthday?").toLowerCase();
if(bday.equals("11/29")) {
JOptionPane.showMessageDialog(null, "Happy Birthday!");
}else {
if(bday.equals("november 29")) {
JOptionPane.showMessageDialog(null, "Happy Birthday!");
}else {
JOptionPane.showMessageDialog(null, "Happy Unbirthday!");
}
}
}
}
