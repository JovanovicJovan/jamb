package jamb;
import javax.swing.JFrame;
public class Jamb 
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.add(new panel());
        
        frame.pack();
        frame.setVisible(true);
    }
}
