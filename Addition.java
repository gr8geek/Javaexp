import javax.swing.JOptionPane;
public class Addition
{
    public static void main(String[] args) {
        String num= JOptionPane.showInputDialog("Enter num 1");
        String num2= JOptionPane.showInputDialog("Enter num 2");
        JOptionPane.showMessageDialog(null, "sum="+(Integer.parseInt(num)+Integer.parseInt(num2)));

    }
    

}