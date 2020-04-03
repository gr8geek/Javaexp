import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
public class TextField extends JFrame
{
    private final JTextField textField1;
    private final JTextField textField2;
    private final JTextField textField3;
    private final JPasswordField passwordField;
    public TextField()
    {
        super("A demo application");
        setLayout(new FlowLayout());
        textField1 = new JTextField(10);
        add(textField1);
        textField2 = new JTextField("Enter some data");
        add(textField2);
        textField3 = new JTextField("Uneditable",21);
        textField3.setEditable(false);
        add(textField3);
        passwordField = new JPasswordField("Hidden Text");
        add(passwordField);
        TextFieldHandler handler = new TextFieldHandler();
        textField1.addActionListener(handler);
        textField2.addActionListener(handler);
        textField3.addActionListener(handler);
        passwordField.addActionListener(handler);
    }
    private class TextFieldHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent event)
        {
            String string = "";
            if(event.getSource()== textField1)
            string = String.format("textField1: %s", event.getActionCommand());
            if(event.getSource()== textField2)
            string = String.format("textField2: %s", event.getActionCommand());
            if(event.getSource()== textField3)
            string = String.format("textField3: %s", event.getActionCommand());
            if(event.getSource()== passwordField)
            string = String.format("textField1: %s", event.getActionCommand());
            JOptionPane.showMessageDialog(null,string);
        }
    }


}
