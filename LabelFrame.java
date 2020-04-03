import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.Icon;
public class LabelFrame extends JFrame
{
    private final JLabel label1;
    private final JLabel label2;
    private final JLabel label3;
    public LabelFrame()
    {
        super("Just For Fun!");
        setLayout(new FlowLayout());
        label1 = new JLabel("This is a label1");
        label1.setToolTipText("Hmmm curious you are ;-)");
        add(label1);
        Icon bug =new ImageIcon(getClass().getResource("bug1.png"));
        label2 = new JLabel("Label with text and icon",bug,SwingConstants.LEFT);
        label2.setToolTipText("This is label 2");
        add(label2);
        label3 =new JLabel();
        label3.setText("Hello !");
        label3.setToolTipText("Never cheat my code !");
        label3.setIcon(bug);
        label3.setHorizontalTextPosition(SwingConstants.CENTER);
        label3.setVerticalTextPosition(SwingConstants.BOTTOM);
        add(label3);
    }
}
