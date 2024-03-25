import java.util.*;
import javax.swing.JOptionPane;

public class test2{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char binary;
        char condition;
        String name = "";
        String ID = "";

        condition = JOptionPane.showInputDialog(null, "Condition? (y/n)").charAt(0);
        while (condition == 'y'){
            binary = JOptionPane.showInputDialog(null, "Enter the binary number (0 / 1)").charAt(0);

            if (binary == '1'){
                JOptionPane.showMessageDialog(null, "The system is on");

                name = JOptionPane.showInputDialog(null, "Enter name: ");
                ID = JOptionPane.showInputDialog(null, "Enter ID: ");

                JOptionPane.showMessageDialog(null, name, "Name:  ", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, ID, "ID: ", JOptionPane.INFORMATION_MESSAGE);
            }
            else if (binary == '0')
                JOptionPane.showMessageDialog(null, "The system is off");
            else
                JOptionPane.showMessageDialog(null, "--Wrong input--");

            condition = JOptionPane.showInputDialog(null, "Condition? (y/n)").charAt(0);
        }
        JOptionPane.showMessageDialog(null, "Thank you, bye!");
    }
}
