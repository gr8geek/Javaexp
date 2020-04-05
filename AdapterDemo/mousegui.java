import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
class mousegui extends JFrame{
    private final JLabel status;
    public mousegui(){
        super("Adapter demonstration");
        status = new JLabel("Please click me!");
        add(status, BorderLayout.SOUTH);
        addMouseListener(new clickhandler());
    } 
    private class clickhandler extends MouseAdapter{
        @Override
        public void mouseClicked(MouseEvent e) {
            String message = String.format("Clicked %d times",e.getClickCount());
            int x=e.getX();
            int y=e.getY();
            if(e.isMetaDown()){
                message+=" with right mouse button";}
            else if(e.isAltDown()){
                message +=" with center mouse button";
            }
            else
                {message +=" with left mouse buttoun";}
            status.setText(message);
            }
        }

    }
