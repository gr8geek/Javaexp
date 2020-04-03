import java.awt.FlowLayout;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
public class gui extends JFrame{
    private final JCheckBox bold;
    private final JCheckBox italic;
    private final JTextField text;
    public gui()
    {
        super("Demo application");
        setLayout(new FlowLayout());
        text = new JTextField("",30);
        text.setFont(new Font("Serif", Font.PLAIN, 14));
        add(text);
        bold = new JCheckBox("Bold");
        italic= new JCheckBox("Italic");
        add(bold);
        add(italic);
        handler ob = new handler();
        bold.addItemListener(ob);
        italic.addItemListener(ob);
    }
    private class handler implements ItemListener
    {
        Font font = null;
        @Override
        public void itemStateChanged(ItemEvent event)
        {
            if(bold.isSelected() && italic.isSelected())
            font = new Font("Serif", Font.BOLD + Font.ITALIC ,14);
            else if(bold.isSelected())
            font = new Font("Serif", Font.BOLD, 14);
            else if(italic.isSelected())
            font = new Font("Serif", Font.ITALIC, 14);
            else
            font =new Font("Serif", Font.PLAIN, 14);

            text.setFont(font);
        }
    
    }
}
