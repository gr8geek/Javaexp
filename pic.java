import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.Icon;
public class pic extends JFrame {
    public final JLabel label1;
    public pic()
    {
        super("Picture of Pratyush");
        setLayout(new FlowLayout());
        Icon img = new ImageIcon(getClass().getResource("pratyush1.jpg"));
        label1 =new JLabel("Hello",img,SwingConstants.CENTER);
        add(label1);
    }
    
}