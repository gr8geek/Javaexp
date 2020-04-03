import javax.swing.JFrame;
public class guiTest{
    public static void main(String args[])
    {
        gui x = new gui();
        x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        x.setSize(300,120);
        x.setVisible(true);
    }
}