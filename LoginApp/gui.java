package LoginApp;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
public class gui extends JFrame
{
    String u ;
    private final JLabel label1;
    private final JTextField text1;
    private final JPasswordField pass;
    public gui()
    {
        super("Password test");
        u ="Deflaut";
        setLayout(new FlowLayout());
        label1 = new JLabel("Enter the password",SwingConstants.LEFT);
        text1 = new JTextField(null,20);
        text1.setText("Enter the user name and hit enter");
        pass = new JPasswordField(SwingConstants.BOTTOM);
        add(text1);
        add(label1);
        add(pass);
        action act = new action();
        text1.addActionListener(act);
        pass.addActionListener(act);


    }
    public class action implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent event)
        {
            String p;
            if(event.getSource() == pass)
            {
                p=String.format("%s", event.getActionCommand());
                if(p.equals("asdf"))
                {
                    JOptionPane.showMessageDialog(null,"Root acess granted to "+u);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Wrong password");
                }
                
            }
            if(event.getSource() == text1)
            {
                u = String.format("%s",event.getActionCommand());
            }
        }
    }

}