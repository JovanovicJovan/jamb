package jamb;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class panel extends JPanel 
{
    JPanel p;
    static JLabel label;
    public panel()
    {
        setPreferredSize(new Dimension(800,500));
        kockice k = new kockice();
        p = new JPanel();
        label = new JLabel("Bacanje: 0.");
        p.add(label);
        add(p);
        add(new kockice());
        add(new Tabla());
    }
}
