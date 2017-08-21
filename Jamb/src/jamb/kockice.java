package jamb;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
public class kockice extends JPanel 
{
    private static JLabel l1,l2,l3,l4,l5,l6;
    JButton klik,najavi;
    Random r;
    JFrame frame;
    static int brojac = 0;
    private static JCheckBox b1,b2,b3,b4,b5,b6;
    public kockice()
    {
        setLayout(new GridLayout(2,7));
        r = new Random();
        setPreferredSize(new Dimension(480,70));
        JPanel p = new JPanel();
        JLabel label = new JLabel(""+brojac);
        p.add(label);
        b1 = new JCheckBox();b4 = new JCheckBox();
        b2 = new JCheckBox();b5 = new JCheckBox();
        b3 = new JCheckBox();b6 = new JCheckBox();
        l1 = new JLabel();l2 = new JLabel();
        l3 = new JLabel();l4 = new JLabel();
        l5 = new JLabel();l6 = new JLabel();
        klik = new JButton("Baci");
        najavi = new JButton("Najavi");
        najavi.addActionListener(new MyAction());
        frame = new JFrame("Show Message Box");
        Osluskivac2 o = new Osluskivac2();
        Osluskivac l = new Osluskivac();
        klik.addActionListener(l);
        najavi.addActionListener(l);
        b1.addActionListener(o);b2.addActionListener(o);
        b3.addActionListener(o);b5.addActionListener(o);
        b4.addActionListener(o);b6.addActionListener(o);
        add(b1);add(l1);add(b2);add(l2);
        add(b3);add(l3);add(klik);
        add(b4);add(l4);add(b5);add(l5);
        add(b6);add(l6);add(najavi);
    }
    public class MyAction implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(frame, "Klikni na polje koje zelis da najavis!");
		}
	}
    private class Osluskivac implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            Object o = e.getSource();
            if(brojac == 0) {
                    for(int i=0;i<Tabla.getNiz().length-1;i++)
                        Tabla.getNiz()[i]=0;
                    b1.setSelected(false);b2.setSelected(false);
                    b4.setSelected(false);b3.setSelected(false);
                    b6.setSelected(false);b5.setSelected(false);
                }
            if(o == klik && brojac != 3) {
                brojac++;
                if(b1.isSelected() == false)
                    l1.setText(""+(r.nextInt(6)+1));
                if(b2.isSelected() == false)
                    l2.setText(""+(r.nextInt(6)+1));
                if(b3.isSelected() == false)
                    l3.setText(""+(r.nextInt(6)+1));
                if(b4.isSelected() == false)
                    l4.setText(""+(r.nextInt(6)+1));
                if(b5.isSelected() == false)
                    l5.setText(""+(r.nextInt(6)+1));
                if(b6.isSelected() == false)
                    l6.setText(""+(r.nextInt(6)+1));
                panel.label.setText("Bacanje: "+brojac+".");
            } else if(o == najavi && brojac == 1){
                Tabla.setNajava(true);
            }
        } 
    }
    private class Osluskivac2 implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) 
        {
            if(e.getSource() == b1 && b1.isSelected() == true)
                Tabla.getNiz()[0] = Integer.parseInt(l1.getText());
            if(e.getSource() == b1 && b1.isSelected() == false)
                Tabla.getNiz()[0] = 0;
            if(e.getSource() == b2 && b2.isSelected() == true)
                Tabla.getNiz()[1] = (Integer.parseInt(l2.getText()));
            if(e.getSource() == b2 && b2.isSelected() == false)
                Tabla.getNiz()[1] = 0;
            if(e.getSource() == b3 && b3.isSelected() == true )
                Tabla.getNiz()[2] = (Integer.parseInt(l3.getText()));
            if(e.getSource() == b3 && b3.isSelected() == false)
                Tabla.getNiz()[2] = 0;
            if(e.getSource() == b4 && b4.isSelected() == true)
                Tabla.getNiz()[3] = (Integer.parseInt(l4.getText()));
            if(e.getSource() == b4 && b4.isSelected() == false) 
                Tabla.getNiz()[3] = 0;
            if(e.getSource() == b5 && b5.isSelected() == true)
                Tabla.getNiz()[4] = (Integer.parseInt(l5.getText()));
            if(e.getSource() == b5 && b5.isSelected() == false) 
                Tabla.getNiz()[4] = 0;
            if(e.getSource() == b6 && b6.isSelected() == true)
                Tabla.getNiz()[5] = (Integer.parseInt(l6.getText()));
            if(e.getSource() == b6 && b6.isSelected() == false) 
                Tabla.getNiz()[5] = 0;
            for(int i:Tabla.getNiz())
                    System.out.print(i);
        }
    }
    public static void odcekiraj()
    {
        b1.setSelected(false);b2.setSelected(false);
        b4.setSelected(false);b3.setSelected(false);
        b6.setSelected(false);b5.setSelected(false);
    }
    public static void brojac(int i)
    {
        brojac = i;
    }
    public static int getBrojac() {
        return brojac;
    }
    public static JLabel getL1() {
        return l1;
    }
    public static JLabel getL2() {
        return l2;
    }
    public static JLabel getL3() {
        return l3;
    }
    public static JLabel getL4() {
        return l4;
    }
    public static JLabel getL5() {
        return l5;
    }
    public static JLabel getL6() {
        return l6;
    }
    public static void postaviNule()
    {
        l1.setText("0");l2.setText("0");
        l3.setText("0");l4.setText("0");
        l5.setText("0");l6.setText("0");
    }
    
}
