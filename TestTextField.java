// Fig. 12.10: TextFieldTest.java
// Testing TextFieldFrame.
import javax.swing.JFrame;
public class TestTextField
{
public static void main(String[] args)
{
TextField textFieldFrame = new TextField();
textFieldFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
textFieldFrame.setSize(350, 100);
textFieldFrame.setVisible(true);
}
} // end class TextFieldTest